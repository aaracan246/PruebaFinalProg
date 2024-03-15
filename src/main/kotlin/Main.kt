package org.example

import classes.Cleric
import enemies.Enemy
import enemies.Rat
import miscellaneous.Event
import miscellaneous.Mappers
import miscellaneous.Stories
import org.example.Enemies.Bosses.Diego
import org.example.GameFlow.CreatePlayer
import org.example.GameFlow.Player
import org.example.console.ConsoleSystem

fun main() {
    val consoleSystem = ConsoleSystem
    val mappers = Mappers()
    val events = Event()
    val enemy = Enemy("Rat", 50, 50, 5)
    val boss = Diego("Lord of jokes and picardía", 200, 200, 25)
    val eventoide = events.generateEvent()

    Stories.printPrologue()

    val player = CreatePlayer.createChar()

    consoleSystem.showCharData(player)

    Stories.enterTheGungeon()

    mappers.chooseDoor()

    events.playEvent(eventoide, player, enemy)

    mappers.chooseDoor()


    mappers.redDoor(player, boss)
}