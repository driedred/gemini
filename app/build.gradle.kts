plugins {
    id("com.android.application") version "8.7.0"
    id("org.jetbrains.kotlin.android") version "1.9.20"
}

android {
    namespace = "kz.ada.app2"
    compileSdk = 34

    defaultConfig {
        applicationId = "kz.ada.app2"
        minSdk = 33
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}


dependencies {
    implementation("com.github.PhilJay:MPAndroidChart:v3.0.3")
    implementation("com.squareup.okhttp3:logging-interceptor:5.0.0-alpha.2")
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.20")
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")
    implementation("com.google.android.material:material:1.9.0")  // Убедись, что эта зависимость добавлена
    implementation("androidx.appcompat:appcompat:1.7.0")  // Также стоит проверить зависимость на appcompat
    implementation("androidx.core:core-ktx:1.10.0")  // Поддержка новых функций для работы с ресурсами
}














