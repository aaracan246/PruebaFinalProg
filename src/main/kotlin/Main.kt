package org.example

import classes.Cleric
import org.example.GameFlow.CreatePlayer
import org.example.GameFlow.Player
import org.example.console.ConsoleSystem

fun main() {
//    val diceRoller = DiceRoller()  // probando el dadito
//    val d100 = DiceType.D100
//
//    val roll = diceRoller.roll(d100)
//
//    println(roll)


    //var player = Cleric(1, "Noe", 123, 123, 23, 2, 2, 2)
    val consoleSystem = ConsoleSystem()
    val player = CreatePlayer.createChar()

    consoleSystem.showCharData(player)
}