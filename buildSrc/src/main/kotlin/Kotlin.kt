object Kotlin {
    const val Version = "1.8.0"

    private const val DatetimeVersion = "0.4.0"
    val datetime by lazy { "org.jetbrains.kotlinx:kotlinx-datetime:${DatetimeVersion}" }

    private const val SerializationVersion = "1.5.0"
    val serializationCore by lazy { "org.jetbrains.kotlinx:kotlinx-serialization-core:${SerializationVersion}" }
    val serializationJson by lazy { "org.jetbrains.kotlinx:kotlinx-serialization-json:${SerializationVersion}" }

    private const val CoroutineVersion = "1.6.4"
    val coroutineCore by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-core:${CoroutineVersion}" }
    val coroutineAndroid by lazy { "org.jetbrains.kotlinx:kotlinx-coroutines-android:${CoroutineVersion}" }

}