package com.example.weichenglinactivitylifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d("STATE", "onCreate() is being executed")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val editText: EditText = findViewById(R.id.edit_text)
        val textView: TextView = findViewById(R.id.textView)

        button.setOnClickListener { view: View ->
            editText.setText(R.string.hello)
            textView.setText(R.string.hello)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("STATE", "onStart() is being executed")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("STATE", "onRestart() is being executed")
    }

    override fun onResume() {
        super.onResume()
        Log.d("STATE", "onResume() is being executed")
    }

    override fun onPause() {
        super.onPause()
        Log.d("STATE", "onPause() is being executed")
    }

    override fun onStop() {
        super.onStop()
        Log.d("STATE", "onStop() is being executed")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("STATE", "onDestroy() is being executed")
    }


}