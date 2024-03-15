package org.example.GameFlow

/**
 * Abstract class representing a player in the game.
 * @property level The level of the player.
 * @property name The name of the player.
 * @property maxHealth The maximum health points of the player.
 * @property currentHealth The current health points of the player.
 * @property initiative The initiative value of the player, determining turn order in combat.
 */
abstract class Player(
    var level: Int,
    val name: String,
    var maxHealth: Int,
    var currentHealth: Int,
    val initiative: Int
) {
    /**
     * Function to check if the player is alive.
     * @return True if the player's current health is greater than 0, false otherwise.
     */
    fun isAlive(): Boolean {
        return currentHealth > 0
    }

    /**
     * Function to apply damage to the player.
     * @param dmgTaken The amount of damage to be taken.
     */
    fun takeDmg(dmgTaken: Int) {
        currentHealth -= dmgTaken
    }
}