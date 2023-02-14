object SqlDelight {
    const val Version = "1.5.5"
    val runtime by lazy { "com.squareup.sqldelight:runtime:${Version}" }
    val androidDriver by lazy { "com.squareup.sqldelight:android-driver:${Version}" }
    val nativeDriver by lazy { "com.squareup.sqldelight:native-driver:${Version}" }
//    val coroutineExt by lazy { "com.squareup.sqldelight:coroutines-extensions-jvm:${Version}" }
}