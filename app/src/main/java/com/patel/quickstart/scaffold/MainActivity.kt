package com.patel.quickstart.scaffold

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.patel.quickstart.scaffold.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityMainBinding.inflate(layoutInflater).root)
    }
}