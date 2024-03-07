package org.example
import org.example.Miscellaneous.DiceType
import org.example.Miscellaneous.DiceRoller

fun main() {
    val diceRoller = DiceRoller()  // probando el dadito
    val d100 = DiceType.D100

    val roll = diceRoller.roll(d100)

    println(roll)
}