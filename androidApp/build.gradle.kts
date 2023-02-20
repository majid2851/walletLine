import KotlinPlugins.kapt
import org.jetbrains.kotlin.storage.CacheResetOnProcessCanceled.enabled

plugins {
    id(Plugins.AndroidApplication)
    id(Plugins.Ksp) version Plugins.KspVersion
    id(GradleVersions.Plugin) version GradleVersions.Version
    id (Plugins.Hilt)

    kotlin(KotlinPlugins.Android)
    kotlin(KotlinPlugins.kapt)
    kotlin(KotlinPlugins.Serialization) version Kotlin.Version

}

android {
    namespace = AndroidApplication.AppId
    compileSdk = AndroidApplication.CompileSdkVersion
    defaultConfig {
        applicationId = AndroidApplication.AppId
        minSdk = AndroidApplication.MinSdkVersion
        targetSdk = AndroidApplication.TargetSdkVersion
        versionCode = AndroidApplication.VersionCode
        versionName = AndroidApplication.VersionName
    }


    buildFeatures {
        compose = true
    }
    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
//            jvmTarget = "11"
            freeCompilerArgs = listOf(
                "-opt-in=androidx.compose.animation.ExperimentalAnimationApi",
                "-opt-in=com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi",
                "-opt-in=androidx.compose.material3.ExperimentalMaterial3Api",
                "-opt-in=androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi",
                "-opt-in=com.google.accompanist.permissions.ExperimentalPermissionsApi",
            )
        }
    }
    composeOptions {
        kotlinCompilerExtensionVersion = Compose.CompilerVersion
    }
    packagingOptions {
        resources {
            excludes.add("/META-INF/{AL2.0,LGPL2.1}")
            excludes.add("META-INF/INDEX.LIST")
            excludes.add("META-INF/LICENSE.md")
            excludes.add("META-INF/LICENSE-notice.md")
        }
    }
    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
        }
    }


    // KSP
    // to make sure the IDE looks at the generated folder
    applicationVariants.all {
        kotlin.sourceSets {
            getByName(name) {
                kotlin.srcDir("build/generated/ksp/$name/kotlin")
            }
        }
    }

    applicationVariants.all {
        addJavaSourceFoldersToModel(File(buildDir, "generated/ksp/$name/kotlin"))
    }
}

dependencies {
    implementation(project(":shared"))
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.4.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    val composeBOM = platform(Compose.composeBOM)
    implementation(composeBOM)
    androidTestImplementation(composeBOM)
    implementation(Compose.material3)
    implementation(Compose.toolingPreview)
    debugImplementation(Compose.tooling)
    androidTestImplementation(Compose.junit)
    debugImplementation(Compose.testManifest)
    implementation(Compose.iconExtended)
    implementation(Compose.activity)
    implementation(Compose.viewModels)
    implementation(Compose.runtime)
    implementation(Compose.composeLock)
    implementation(Compose.compiler)
    implementation(Compose.navigation)

    implementation(AndroidX.coreKtx)
    implementation(AndroidX.datastorePref)
    implementation(AndroidX.lifecycleRuntime)
    implementation(AndroidX.lifecycleRuntimeCompose)
    implementation(AndroidX.lifecycleViewModel)

    implementation(Kotlin.serializationCore)
    implementation(Kotlin.serializationJson)
    implementation(Kotlin.coroutineCore)
    implementation(Kotlin.coroutineAndroid)
    implementation(Kotlin.datetime)

    implementation(Coil.core)
    implementation(Coil.compose)

    implementation(ComposeDestinations.composeDestAnimCore)
    ksp(ComposeDestinations.composeDestKSP)

    implementation(Koin.core)
    implementation(Koin.android)
    implementation(Koin.compose)

    implementation(Accpmpanist.systemUiController)
    implementation(Accpmpanist.permission)

    implementation(Kermit.kermitLogger)


    //Added by Majid
    implementation(RESPONSIVE.SSP)
    implementation(RESPONSIVE.SDP)
    implementation(Hilt.hiltAndroid)
    implementation(Hilt.hiltNavigation)
    kapt(Hilt.hiltCompiler)

    //-------------------------------------------


}

tasks.named<com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask>("dependencyUpdates")
    .configure {
        checkForGradleUpdate = true
        outputFormatter = "json"
        outputDir = "build/dependencyUpdates"
        reportfileName = "report"
    }