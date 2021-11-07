package com.example.newproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var clicker = findViewById<Button>(R.id.button3)
        clicker.setOnClickListener {
            Toast.makeText(this, "მომხმარებლის ინფორმაცია შენახულია", Toast.LENGTH_SHORT).show()

        }
    }



}
class Company {
    var name = ""
    var numerous = 0
    var job = ""
    var location = 0
    fun printName(){
        println(location)
    }

    override fun toString(): String {
        return "$location"
    }

    override fun equals(other: Any?): Boolean {
        if(other is Company){
            if(location == other.location){
                return true
            }
        }
        return false
    }

}
fun main(){
    val company1 = Company()
    company1.name = "3G"
    company1.numerous = 65
    company1.job = "15165156"
    company1.location = 223
    val company2 = Company()
    company2.name = "3G"
    company2.numerous = 65
    company2.job = "15165156"
    company2.location = 223
    println(company1 == company2)
}