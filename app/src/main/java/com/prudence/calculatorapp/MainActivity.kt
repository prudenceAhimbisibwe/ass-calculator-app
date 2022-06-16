package com.prudence.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var tilnumber1:TextInputLayout
    lateinit var etnumber1:TextInputEditText
    lateinit var tilnumber2:TextInputLayout
    lateinit var etnumber2:TextInputEditText
    lateinit var btnadd:Button
    lateinit var btnsubtract:Button
    lateinit var btnmodulus:Button
    lateinit var btndivision:Button
    lateinit var tvresult:TextView
    lateinit var tvresult1:TextView
    lateinit var tvresult2:TextView
    lateinit var tvresult3:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castaview()
    }
    fun castaview(){
        tilnumber1=findViewById(R.id.tilnumber1)
        etnumber1=findViewById(R.id.etnumber1)
        tilnumber2=findViewById(R.id.tilnumber2)
        etnumber2=findViewById(R.id.etnumber2)
        btnadd=findViewById(R.id.btnadd)
        btnsubtract=findViewById(R.id.btnsubtract)
        btnmodulus=findViewById(R.id.btnmodulus)
        btndivision=findViewById(R.id.btndivision)
        tvresult=findViewById(R.id.tvresult)
        tvresult1=findViewById(R.id.tvresult1)
        tvresult2=findViewById(R.id.tvresult2)
        tvresult3=findViewById(R.id.tvresult3)


        btnadd.setOnClickListener {
            val number1 = etnumber1.text.toString().toInt()
            val number2 = etnumber2.text.toString().toInt()
            getResult(number1,number2)
        }
        btnsubtract.setOnClickListener {
            val number1 = etnumber1.text.toString().toInt()
            val number2 = etnumber2.text.toString().toInt()
            getResult1(number1,number2)

        }
        btnmodulus.setOnClickListener {
            val number1 = etnumber1.text.toString().toInt()
            val number2 = etnumber2.text.toString().toInt()
            getResult2(number1,number2)
        }
        btndivision.setOnClickListener {
            val number1 = etnumber1.text.toString().toInt()
            val number2 = etnumber2.text.toString().toInt()
            getResult3(number1,number2)
        }
    }
    fun getResult(number1:Int,number2:Int){
        val result=number1+number2
        tvresult.text=result.toString()
    }
    fun getResult1(number1: Int,number2 :Int){
        val result=number1-number2
        tvresult1.text=result.toString()
    }
    fun getResult2(number1: Int,number2: Int){
        val result=number1%number2
        tvresult2.text=result.toString()
    }
    fun getResult3(number1: Int,number2: Int){
        val result=number1/number2
        tvresult3.text=result.toString()
    }

}