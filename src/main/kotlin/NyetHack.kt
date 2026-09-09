package org.example

import java.io.File
import java.nio.charset.StandardCharsets

fun main() {
    println(profile("Hello World"))
//    val heroName = readLine() ?: "无名";
    val file = File("data/menu.txt")
    val text = file.readText(StandardCharsets.UTF_8)
    val menus: List<String> = text.split("\n")
    val list = List(menus.size) { i ->
        // 解构化
        val (_, english) = menus[i].split(",")
        english
    }
    list.forEach { println(it) }
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
