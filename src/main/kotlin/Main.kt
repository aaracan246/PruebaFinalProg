package org.example

fun main() {
    val diceRoller = DiceRoller()  // probando el dadito
    val d20 = D20()

    val tirada = diceRoller.roll(d20)

    println(tirada)
}