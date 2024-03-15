package classes

import org.example.GameFlow.Player

/**
 * Class representing a Sorcerer player character in the game.
 * @param level The level of the Sorcerer.
 * @param name The name of the Sorcerer. Default is set to "Kaeus".
 * @param maxHealth The maximum health points of the Sorcerer.
 * @param currentHealth The current health points of the Sorcerer.
 * @param initiative The initiative value of the Sorcerer, determining turn order in combat.
 * @param spellsRemaining The remaining number of spells the Sorcerer can cast.
 */
class Sorcerer(
    level: Int,
    name: String = "Kaeus",
    maxHealth: Int,
    currentHealth: Int,
    initiative: Int,
    var spellsRemaining: Int
) : Player(level, name, maxHealth, currentHealth, initiative) {
    /**
     * Function to represent the Sorcerer as a string.
     * @return A string representation of the Sorcerer including name, health, initiative, and spells remaining.
     */
    override fun toString() = "Hero's name: ${this.name}, max health: $maxHealth, current health: $currentHealth, initiative: $initiative, spells remaining: $spellsRemaining."
}