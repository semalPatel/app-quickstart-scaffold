object Versions {
    const val androidGradleVersion = "8.0.0"
    const val kotlinVersion = "1.8.20"
    const val appCompatVersion = "1.3.1"
    const val coreKtxVersion = "1.6.0"
    const val activityVersion = "1.3.0"
    const val constraintLayoutVersion = "2.0.4"
    const val materialVersion = "1.5.0-alpha01"
    const val coroutinesVersion = "1.5.1"
    const val glideVersion = "4.12.0"
    const val retrofitVersion = "2.9.0"
    const val recyclerViewVersion = "1.2.1"
    const val serializationVersion = "1.5.21"
    const val lifecycleVersion = "2.4.0-alpha02"
    const val daggerVersion = "2.38.1"
    const val junitVersion = "4.13.2"
    const val espressoVersion = "3.4.0"
}

object AppConfig {
    const val COMPILE_SDK_VERSION = 33
    const val TARGET_SDK_VERSION = 33
    const val MIN_SDK_VERSION = 21
    // TODO change this to match app package name
    const val APPLICATION_ID = "com.patel.quickstart.scaffold"
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0"
}

object Libs {
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlinVersion}"
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Versions.androidGradleVersion}"
    const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlinVersion}"
    const val hiltGradlePlugin = "com.google.dagger:hilt-android-gradle-plugin:${Versions.daggerVersion}"
    const val appCompat = "androidx.appcompat:appcompat:${Versions.appCompatVersion}"
    const val coreKtx = "androidx.core:core-ktx:${Versions.coreKtxVersion}"
    const val material = "com.google.android.material:material:${Versions.materialVersion}"
    const val hilt = "com.google.dagger:hilt-android:${Versions.daggerVersion}"
    const val hiltCompiler = "com.google.dagger:hilt-compiler:${Versions.daggerVersion}"
    const val activity = "androidx.activity:activity-ktx:${Versions.activityVersion}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayoutVersion}"
    const val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutinesVersion}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    const val glide = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Versions.recyclerViewVersion}"
    const val liveData = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycleVersion}"
    const val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofitVersion}"
    const val viewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycleVersion}"
    const val junit = "junit:junit:${Versions.junitVersion}"
    const val espresso = "androidx.test.espresso:espresso-core:${Versions.espressoVersion}"
}