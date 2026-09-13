package org.example

class Player {
    val name: String = "lijun"
        get() = field.replaceFirstChar { it.uppercase() }

    var weapon: Weapon? = Weapon("Mjolnir")

    fun weaponName(): Unit {
        weapon?.let { println(it.name) }
    }
}