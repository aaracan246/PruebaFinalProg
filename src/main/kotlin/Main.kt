package org.example

fun main() {
    val diceRoller = DiceRoller()  // probando el dadito
    val d20 = D20()

    val roll = diceRoller.roll(d20)

    println(roll)
}