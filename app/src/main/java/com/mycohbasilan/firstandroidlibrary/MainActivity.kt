package com.mycohbasilan.firstandroidlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mycohbasilan.toasterlibrary.ToasterMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ToasterMessage.toastMessage(this, "This is my first android library!")
    }
}