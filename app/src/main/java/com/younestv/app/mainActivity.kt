package com.younestv.app
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "مرحبا بك في YounesTV ✅\nالتطبيق خدام"
        tv.textSize = 24f
        tv.setPadding(50, 200, 50, 50)
        setContentView(tv)
    }
}
