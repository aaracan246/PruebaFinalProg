package classes

import org.example.GameFlow.Player

/**
 * Class representing a Rogue player character in the game.
 * @param level The level of the Rogue.
 * @param name The name of the Rogue. Default is set to "Murochima".
 * @param maxHealth The maximum health points of the Rogue.
 * @param currentHealth The current health points of the Rogue.
 * @param initiative The initiative value of the Rogue, determining turn order in combat.
 * @param sneakAttack A boolean indicating whether the Rogue has the ability to perform sneak attacks. Default is set to true.
 */
class Rogue(
    level: Int,
    name: String = "Murochima",
    maxHealth: Int,
    currentHealth: Int,
    initiative: Int,
    var sneakAttack: Boolean = true
) : Player(level, name, maxHealth, currentHealth, initiative) {
    /**
     * Function to represent the Rogue as a string.
     * @return A string representation of the Rogue including name, health, and initiative.
     */
    override fun toString() = "Hero's name: ${this.name}, max health: $maxHealth, current health: $currentHealth, initiative: $initiative."
}