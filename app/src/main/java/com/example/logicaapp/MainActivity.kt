package com.example.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        InitViews()
    }

    private fun InitViews() {
        submitButton.setOnClickListener{
            getFields()
            inputField1.setText("")
            inputField2.setText("")
            inputField3.setText("")
            inputField4.setText("")
        }
    }

    private fun getFields() {
        val list: ArrayList<String> = ArrayList()

        val field1 = inputField1.text.toString().trim()
        val field2 = inputField2.text.toString().trim()
        val field3 = inputField3.text.toString().trim()
        val field4 = inputField4.text.toString().trim()

        list.add(field1)
        list.add(field2)
        list.add(field3)
        list.add(field4)

        compareArray(list)
    }

    private fun compareArray(list: ArrayList<String>) {
        //hardcoded array as these values are always the correctValues
        val correctList = arrayOf("T", "F", "F", "F")

        var correct = 0
        // hardcoded for as we now there should only be 4 values
        for(i in 0 .. 3) {
            // adds 1 to correct value if the 2 match
            if(list[i].toUpperCase() == correctList[i]){
                correct++
            }
        }
        // output a toast message
        showToast(correct)
    }

    private fun showToast(correct: Int) {
        Toast.makeText(this, "correct amount is: $correct", Toast.LENGTH_LONG).show()

    }
}
