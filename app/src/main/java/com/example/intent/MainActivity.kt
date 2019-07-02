package com.example.intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd.setOnClickListener {

            if(TextUtils.isEmpty(etFirstNum.text.toString()) || TextUtils.isEmpty(etSecondNum.text.toString())) {

//              Toast.makeText(this, "Invalid Input",LENGTH_SHORT).show()

                toast("Invalid Input")

            }
            else {

               var firstNum = etFirstNum.text.toString().toInt()
               var secondNum = etSecondNum.text.toString().toInt()
               var stringOfSum = firstNum.toString() + " + " + secondNum.toString() + " = " + (firstNum + secondNum).toString()

//              val intent = Intent(this, Main2Activity::class.java)
//              intent.putExtra("EQN", stringOfSum)
//              startActivity(intent)

               startActivity(intentFor<Main2Activity>("EQN" to stringOfSum))

            }
        }

    }
}
