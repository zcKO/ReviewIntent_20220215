package com.jc.reviewintent_20220215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userId = "aaa@aaa.com"
        val userPassword = "asdfg"

        loginButton.setOnClickListener {

            val userInputId = inputIdEditText.text.toString()
            val userInputPassword = inputPasswordEditText.text.toString()

            if (userId == userInputId && userPassword == userInputPassword) {
                Toast.makeText(this, "${userId}님 환영합니다.", Toast.LENGTH_SHORT).show()
            } else if (userId != userInputId) {
                Toast.makeText(this, "아이디가 다릅니다.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "비밀번호가 다릅니다.", Toast.LENGTH_SHORT).show()
            }

        }



    }
}