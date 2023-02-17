object AndroidX {
    private const val LifecycleVersion = "2.6.0-alpha02"

    val lifecycleRuntime by lazy { "androidx.lifecycle:lifecycle-runtime-ktx:$LifecycleVersion" }
    val lifecycleRuntimeCompose by lazy { "androidx.lifecycle:lifecycle-runtime-compose:$LifecycleVersion" }
    val lifecycleViewModel by lazy { "androidx.lifecycle:lifecycle-viewmodel-ktx:$LifecycleVersion" }

    val coreKtx by lazy { "androidx.core:core-ktx:1.9.0" }
    val datastorePref by lazy { "androidx.datastore:datastore-preferences:1.0.0" }

}