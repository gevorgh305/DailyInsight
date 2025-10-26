# 📰 Daily Insight

A clean and modern Android News App built with **Kotlin**, **Jetpack Compose**, and **Material 3**.

## ✨ Features
- MVVM architecture with Repository pattern
- Live data from [NewsAPI.org](https://newsapi.org/)
- Retrofit2 for network calls
- StateFlow for reactive updates
- Material 3 UI with dark & light themes
- Fully built with Jetpack Compose

## 🧠 Tech Stack
- Kotlin
- Jetpack Compose
- ViewModel + StateFlow
- Retrofit2 + Gson
- Material 3
- Clean Architecture

## 🚀 Setup
1. Get your API key from [NewsAPI.org](https://newsapi.org/)
2. Open `NewsApi.kt` and replace the API key:
   ```kotlin
   @Query("apiKey") apiKey: String = "c963766239d046c38f400c8319fa8465"
