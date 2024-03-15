package org.example

import enemies.Enemy
import miscellaneous.Event
import miscellaneous.Mappers
import org.example.Enemies.Bosses.Diego
import org.example.GameFlow.CreatePlayer
import org.example.console.ConsoleSystem

fun main() {
    // Initialize necessary objects
    val consoleSystem = ConsoleSystem
    val mappers = Mappers()
    val events = Event()

    // Create enemies
    val enemy = Enemy("Rat", 50, 50, 5)
    val boss = Diego("Lord of jokes and picardía", 200, 200, 25)

    // Generate a random event
    val eventoide = events.generateEvent()

    // Print the prologue of the game
    ConsoleSystem.printPrologue()

    // Create a player character
    val player = CreatePlayer.createChar()

    // Display player character data
    consoleSystem.showCharData(player)

    // Enter the dungeon
    ConsoleSystem.enterTheGungeon()

    // Choose a door
    mappers.chooseDoor()

    // Play the generated event
    events.playEvent(eventoide, player, enemy)

    // Encounter the boss behind the red door
    mappers.redDoor(player, boss)
}