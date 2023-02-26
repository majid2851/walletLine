plugins {
    kotlin(KotlinPlugins.Multiplatform)
    kotlin(KotlinPlugins.Cocoapods)
    id(Plugins.AndroidLibrary)
    kotlin(KotlinPlugins.Serialization) version Kotlin.Version
    id(Plugins.SqlDelight) version SqlDelight.Version
    id(GradleVersions.Plugin) version GradleVersions.Version
}

version = "1.0"

kotlin {
    android()
    iosX64()
    iosArm64()
    iosSimulatorArm64()

    cocoapods {
        summary = "Some description for the Shared Module"
        homepage = "Link to the Shared Module homepage"
//        version = "1.0"
        ios.deploymentTarget = "14.1"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "shared"
        }
    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                // SqlDelight
                implementation(SqlDelight.runtime)
                // Koin
                api(Koin.core)
                // Ktor
                implementation(Ktor.core)
                implementation(Ktor.logging)
                implementation(Ktor.contentNegotiation)
                implementation(Ktor.serialization)
                implementation(Kermit.kermitLogger)
                // Coroutine
                implementation(Kotlin.coroutineCore)
                // Serialization
                implementation(Kotlin.serializationCore)
                implementation(Kotlin.serializationJson)

                implementation(Kotlin.datetime)

            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val androidMain by getting {
            dependencies {
                implementation(SqlDelight.androidDriver)
                implementation(Ktor.okhttp)
            }
        }
//        val androidUnitTest by getting
        val iosX64Main by getting
        val iosArm64Main by getting
        val iosSimulatorArm64Main by getting
        val iosMain by creating {
            dependencies {
                implementation(SqlDelight.nativeDriver)
                implementation(Ktor.ios)
            }
            dependsOn(commonMain)
            iosX64Main.dependsOn(this)
            iosArm64Main.dependsOn(this)
            iosSimulatorArm64Main.dependsOn(this)
        }
        val iosX64Test by getting
        val iosArm64Test by getting
        val iosSimulatorArm64Test by getting
        val iosTest by creating {
            dependsOn(commonTest)
            iosX64Test.dependsOn(this)
            iosArm64Test.dependsOn(this)
            iosSimulatorArm64Test.dependsOn(this)
        }
    }
}

sqldelight {
    database(name = "WalletLineDB") {
        packageName = "com.walletline.database"
        sourceFolders = listOf("sqldelight")
    }
}

android {
    namespace = "com.walletline"
    compileSdk = AndroidApplication.CompileSdkVersion
    defaultConfig {
        minSdk = AndroidApplication.MinSdkVersion
        targetSdk = AndroidApplication.TargetSdkVersion
    }
}

tasks.named<com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask>("dependencyUpdates")
    .configure {
        checkForGradleUpdate = true
        outputFormatter = "json"
        outputDir = "build/dependencyUpdates"
        reportfileName = "report"
    }