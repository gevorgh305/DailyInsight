# 📰 Daily Insight  

![Kotlin](https://img.shields.io/badge/Kotlin-1DA1F2?style=for-the-badge&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=android&logoColor=white)
![Material 3](https://img.shields.io/badge/Material%203-6200EE?style=for-the-badge&logo=material-design&logoColor=white)

A clean and modern **Android News App** built with **Kotlin**, **Jetpack Compose**, and **Material 3**.  
It fetches live news data from the [NewsAPI.org](https://newsapi.org/) and displays it using MVVM architecture with StateFlow.

---

## ✨ Features
- 🚀 **MVVM architecture** with Repository pattern  
- 🧠 Reactive UI powered by **StateFlow**  
- 🌙 Material 3 theming (Light & Dark Mode)  
- 🔌 API integration with **Retrofit2 + Gson**  
- 🧩 100% **Jetpack Compose** UI  
- 📱 Fully responsive and smooth scroll design  

---

## 🧠 Tech Stack
| Layer | Technology |
|-------|-------------|
| Language | **Kotlin** |
| UI | **Jetpack Compose**, **Material 3** |
| Data | **Retrofit2**, **Gson** |
| State Management | **ViewModel**, **StateFlow** |
| Architecture | **MVVM + Repository Pattern** |

---

## ⚙️ Setup
1. Get your free API key from [NewsAPI.org](https://newsapi.org/)  
2. Add it inside your `NewsApi.kt` file:  
   ```kotlin
   @Query("apiKey") apiKey: String = "YOUR_API_KEY"
