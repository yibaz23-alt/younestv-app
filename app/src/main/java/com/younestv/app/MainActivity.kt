package com.younestv.app
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val text = TextView(this)
        text.text = "مرحبا بيك فـ YounesTV 🎉"
        text.textSize = 24f
        text.setPadding(50, 200, 50, 50)
        setContentView(text)
    }
}
