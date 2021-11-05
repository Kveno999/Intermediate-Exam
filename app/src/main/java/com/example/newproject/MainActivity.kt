package com.example.newproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
class Person {
    var name = ""
    var age = 0
    fun printName(){
        println(name)
    }

    override fun toString(): String {
        return "$name, $age"
    }

    override fun equals(other: Any?): Boolean {
        if(other is Person){
            if(name == other.name){
                return true
            }
        }
        return false
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}
fun main(){
    var person1 = Person()
    person1.name = "nika"
    person1.age = 65
    person1.printName()
    var person2 = Person()
    person2.name = "jemal"
    person2.age = 84
    println(person1)
    println(person1 == person2)
    println(person1.hashCode())
    println(person2.hashCode())
}