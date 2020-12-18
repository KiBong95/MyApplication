package com.example.myapplication.Kotlin



fun main(array: Array<String>){
    val testAccess : TestAccess = TestAccess("아무개")

    val reward : Reward = Reward()
    reward.rewardAmount = 2000

    val runningCar : RunningCar = RunningCar()
    runningCar.runFast()

    println(reward.rewardAmount)
    println(runningCar)
}

class Reward() {
    var rewardAmount : Int = 1000
}

class TestAccess{
    private var name: String = "김기봉"

    constructor(name: String){
        this.name = name
    }

    fun changeName(newName: String){
        this.name = newName
    }

    private fun test(){
        println("테스트")
    }
}

class RunningCar(){
   fun runFast(){
       run()
   }

    private fun run() {

    }
}