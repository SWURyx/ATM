package main

import java.util.*

fun main() {
    val acount: Int = 123456789 //账号
    val password = 666666  //密码
    var leftmoney = 10000  //余额
    val scanner = Scanner(System.`in`)

    println("欢迎使用ATM自助取款功能")
    println("输入账号")
    val acinput = scanner.nextInt()
    println("输入密码")
    val passinput = scanner.nextInt()
    if (acinput == acount && passinput == password){
        println("请选择功能 1.存款 2.取款 3.查询余额 4.退出")
        val choice = scanner.nextInt()
        when(choice){
            1 -> {
                println("输入要存入的金额")
                val inputmoney = scanner.nextInt()
                println("目前总金额为${inputmoney+leftmoney}")
            }
            2 -> {
                if(leftmoney > 0) println("输入取款金额") else println("金额不足无法取款")
                val outputmoney = scanner.nextInt()
                if (leftmoney - outputmoney > 0) println("取款成功,余额为${leftmoney - outputmoney}") else  println("金额不足无法取款")
                leftmoney = leftmoney - outputmoney
            }
            3 -> println("余额为$leftmoney")
            4 -> println("谢谢使用")
        }
    }else{
        println("账号或密码错误")
    }


}