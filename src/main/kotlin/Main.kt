package org.example

import org.example.Miscellaneous.D100
import org.example.Miscellaneous.DiceRoller

fun main() {
    val diceRoller = DiceRoller()  // probando el dadito
    val d100 = D100()

    val roll = diceRoller.roll(d100)

    println(roll)
}