object Build {
    private const val AgpVersion = "7.4.1"
    val androidGradlePlugin by lazy { "com.android.tools.build:gradle:${AgpVersion}"}
    val kotlinGradlePlugin by lazy { "org.jetbrains.kotlin:kotlin-gradle-plugin:${Kotlin.Version}"}
    val sqlDelightGradlePlugin by lazy { "com.squareup.sqldelight:gradle-plugin:${SqlDelight.Version}"}
}