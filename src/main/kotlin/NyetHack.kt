package org.example

fun main() {
    println(profile("Hello World"))
//    val heroName = readLine() ?: "无名";
}

fun narrate(msg: String) {
    println(msg.uppercase() + "!".repeat(3))
}

val profile : (String) -> String = {
    it.uppercase() + "!".repeat(3)
}

// 类型推断
val profile1 = { msg:String ->
    msg.uppercase() + "!".repeat(3)
}
