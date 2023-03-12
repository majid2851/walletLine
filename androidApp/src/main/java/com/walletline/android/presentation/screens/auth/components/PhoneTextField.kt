package com.walletline.android.presentation.screens.auth.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.core.text.isDigitsOnly
import com.walletline.android.R
import com.walletline.android.presentation.components.WalletLineBackground
import com.walletline.android.presentation.util.Country
import com.walletline.android.presentation.theme.Dimen
import com.walletline.android.presentation.theme.WalletLineTheme
import com.walletline.android.presentation.theme.padding
import com.walletline.android.presentation.util.Constants
import com.walletline.android.presentation.util.sdp

@Composable
fun PhoneTextField(
    countries: List<Country>,
    text: String,
    onTextChange: (String) -> Unit,
    onCountryChange: (Int) -> Unit,
    selectedCountry: Country,
    modifier: Modifier = Modifier,
    errorMessage: String? = null,
    enabled: Boolean = true
) {

    var expanded by remember { mutableStateOf(false) }
    val focusManager = LocalFocusManager.current

    BasicTextField(
        modifier = modifier
            .fillMaxWidth(),
        value = text,
        textStyle = MaterialTheme.typography.bodyMedium.copy(
            color = MaterialTheme.colorScheme.onBackground.copy(
                alpha = 0.8f
            )
        ),
        onValueChange = {
            // fixme: The actual number length may change from country to country
            if (it.isDigitsOnly()) onTextChange(it.take(10))
        },
        cursorBrush = if (!errorMessage.isNullOrBlank()) SolidColor(MaterialTheme.colorScheme.error) else SolidColor(
            MaterialTheme.colorScheme.primary
        ),
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Phone,
            imeAction = ImeAction.Done
        ),
        keyboardActions = KeyboardActions(onNext = { focusManager.clearFocus() }),
        decorationBox = { innerTextField ->
            TextFieldDefaults.TextFieldDecorationBox(
                value = text,
                innerTextField = innerTextField,
                enabled = enabled,
                singleLine = true,
                visualTransformation = VisualTransformation.None,
                interactionSource = remember { MutableInteractionSource() },
                isError = !errorMessage.isNullOrBlank(),
                contentPadding = PaddingValues(start = MaterialTheme.padding.extraMedium),
                placeholder = {
                    Text(
                        text = "Phone number",
                        style = MaterialTheme.typography.bodyMedium
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    textColor = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.8f),
                    disabledTextColor = MaterialTheme.colorScheme.onBackground.copy(alpha = Constants.DisabledAlpha),
                    containerColor = MaterialTheme.colorScheme.surface,
                    placeholderColor = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.6f),
                    focusedLeadingIconColor = MaterialTheme.colorScheme.onBackground,
                    unfocusedLeadingIconColor = MaterialTheme.colorScheme.onBackground,
                    errorLeadingIconColor = MaterialTheme.colorScheme.error
                ),
                supportingText = {
                    AnimatedVisibility(
                        visible = !errorMessage.isNullOrBlank(),
                        enter = expandVertically(),
                        exit = shrinkVertically()
                    ) {
                        Text(
                            text = errorMessage ?: "",
                            style = MaterialTheme.typography.labelSmall
                        )
                    }
                },
                container = {
                    Box(
                        modifier = Modifier
                            .requiredHeight(Dimen.PhoneTextFieldHeight)
                            .border(
                                width = Dimen.PhoneTextFieldBorderWidth,
                                color = if (!errorMessage.isNullOrBlank()) MaterialTheme.colorScheme.error
                                else MaterialTheme.colorScheme.outlineVariant,
                                shape = RoundedCornerShape(Dimen.PhoneTextFieldBorderRadius)
                            ),
                        contentAlignment = Alignment.CenterStart
                    ) {

                        VerticalDivider(
                            isError = !errorMessage.isNullOrBlank(),
                            modifier = Modifier
                                .padding(
                                    top = MaterialTheme.padding.medium,
                                    bottom = MaterialTheme.padding.medium,
                                    start = Dimen.PhoneTextFieldDividerMarginStart
                                ),
                        )

                    }
                },
                leadingIcon = {
                    Box(
                        modifier = Modifier
                            .height(Dimen.PhoneTextFieldHeight)
                            .width(Dimen.PhoneTextFieldDividerMarginStart),
                        contentAlignment = Alignment.Center,
                    ) {
                        IconButton(
                            modifier = Modifier
                                .fillMaxSize(),
                            onClick = { expanded = true },
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxSize(),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.End
                            ) {
                                Text(
                                    text = selectedCountry.name,
                                    style = MaterialTheme.typography.bodySmall
                                )

                                Icon(
                                    modifier = Modifier
                                        .requiredSize(Dimen.DropDownIconSize),
                                    imageVector = Icons.Filled.ArrowDropDown,
                                    contentDescription = stringResource(R.string.desc_drop_down_icon)
                                )
                            }
                        }
                        MobileDropDownMenu(
                            expanded = expanded,
                            onDropDownDismiss = { expanded = false },
                            onCountryClick = onCountryChange,
                            countries = countries
                        )
                    }

                }
            )
        }
    )
}

@Composable
fun VerticalDivider(
    modifier: Modifier = Modifier,
    thickness: Dp = 1.sdp,
    color: Color = MaterialTheme.colorScheme.onBackground.copy(alpha = 0.2f),
    errorColor: Color = MaterialTheme.colorScheme.error,
    isError: Boolean = false
) {
    val targetThickness = if (thickness == Dp.Hairline) {
        (1f / LocalDensity.current.density).dp
    } else {
        thickness
    }
    val mColor = remember(isError) { if (isError) errorColor else color }

    Box(
        modifier = modifier
            .fillMaxHeight()
            .width(targetThickness)
            .background(color = mColor, shape = RoundedCornerShape(50f))
    )
}

@Composable
fun MobileDropDownMenu(
    expanded: Boolean,
    onDropDownDismiss: () -> Unit,
    onCountryClick: (Int) -> Unit,
    countries: List<Country>,
    modifier: Modifier = Modifier
) {
    DropdownMenu(
        modifier = modifier
            .background(color = MaterialTheme.colorScheme.background),
        expanded = expanded,
        onDismissRequest = onDropDownDismiss
    ) {

        repeat(countries.size) { index ->
            CountryMenuItem(
                country = countries[index],
                enabled = true
            ) {
                onCountryClick(it)
                onDropDownDismiss()
            }
        }

    }
}

@Composable
fun CountryMenuItem(
    country: Country,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    colors: MenuItemColors = MenuDefaults.itemColors(
        textColor = MaterialTheme.colorScheme.onBackground,
        disabledTextColor = MaterialTheme.colorScheme.onBackground.copy(alpha = Constants.DisabledAlpha),
        disabledLeadingIconColor = MaterialTheme.colorScheme.onBackground.copy(alpha = Constants.DisabledAlpha)
    ),
    onCountryClick: (Int) -> Unit,
) {

    DropdownMenuItem(
        modifier = modifier
            .width(Dimen.DropDownItemWidth)
            .height(Dimen.DropDownItemHeight),
        onClick = { onCountryClick(country.id) },
        text = {
            Text(
                text = country.name,
                style = MaterialTheme.typography.bodySmall
            )
        },
        enabled = enabled,
        colors = colors
    )
}

@Preview
@Composable
fun PhoneTextFieldPreview() {
    val countries by remember {
        mutableStateOf(
            listOf(
                Country(1, "NL +31"),
                Country(2, "IR +98"),
                Country(3, "US +1"),
            )
        )
    }
    var selected by remember { mutableStateOf(Country(1, "NL +31")) }
    var text by remember { mutableStateOf("") }
    var error: String? by remember {
        mutableStateOf(null)
    }
    WalletLineTheme {
        WalletLineBackground {
            PhoneTextField(
                modifier = Modifier
                    .align(Alignment.Center),
                countries = countries,
                selectedCountry = selected,
                errorMessage = error,
                text = text,
                onTextChange = {
                    text = it; if (text.length > 5) error = "Dummy error" else error = null
                },
                onCountryChange = { id -> selected = countries.first { it.id == id } }
            )
        }
    }
}