# 🧩 Learn Fragments Android App (Kotlin)

This is a beginner-friendly Android app that demonstrates how to use **Fragments** in Kotlin using **View Binding**. The app allows users to switch between two fragments by clicking buttons, dynamically replacing the content in a container.

## 🎯 Features

- Demonstrates fragment replacement using `FragmentManager`
- Uses modern **View Binding** for UI reference
- Clean and maintainable structure
- Two separate fragments: `Fragment1` and `Fragment2`

## 🧱 Built With

- Kotlin  
- Android SDK  
- Android Studio  
- View Binding  
- AndroidX Fragment Library  

## 🧪 How It Works

1. The layout uses a `fragmentContainer` (`FrameLayout`) to hold dynamic fragments.  
2. Two buttons (`fragmentButton1` and `fragmentButton2`) allow switching between Fragment 1 and Fragment 2.  
3. When a button is clicked, `goToFragment()` is called to perform a fragment transaction using `FragmentManager`.  
4. `replace()` swaps the current fragment with the selected one, and `commit()` applies the change.

## 📂 Project Structure

com.example.learnfragments/  
├── MainActivity.kt → Handles fragment switching logic  
├── Fragment1.kt → First sample fragment  
├── Fragment2.kt → Second sample fragment  
├── res/  
│   └── layout/  
│       ├── activity_main.xml → Contains buttons and fragment container  
│       ├── fragment1.xml → Layout for Fragment 1  
│       └── fragment2.xml → Layout for Fragment 2  
└── viewbinding/ → Auto-generated binding classes  

## 💡 Key Code Snippet

```kotlin
private fun goToFragment(fragment: Fragment) {
    fragmentManager = supportFragmentManager
    fragmentManager.beginTransaction()
        .replace(R.id.fragmentContainer, fragment)
        .commit()
}
```
## 📄 License
This project is licensed under the MIT License.

## ▶️ How to Run
Clone the repository:
git clone https://github.com/yourusername/learn-fragments-kotlin.git

Open in Android Studio

Enable View Binding in your build.gradle (if not already enabled):
buildFeatures {
    viewBinding true
}


