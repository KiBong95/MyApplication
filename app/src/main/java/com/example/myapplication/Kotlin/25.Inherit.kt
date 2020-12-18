package com.example.myapplication.Kotlin

fun main(array : Array<String>){

}

// 부모 : Car100
// 자식 : SuperCar100, Bus100

open class Car100 () {
    open fun drive(): String {
        return "달린다"
    }

    fun stop() {

    }
}

class SuperCar100() : Car100() {
    override fun drive() : String {
        val run = super.drive()
        return "빨리 $run"
    }
}

class Bus100() : Car100() {

}