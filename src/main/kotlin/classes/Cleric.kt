package classes

import org.example.GameFlow.Player

/**
 * Class representing a Cleric player character in the game.
 * @param level The level of the Cleric.
 * @param name The name of the Cleric.
 * @param maxHealth The maximum health points of the Cleric.
 * @param currentHealth The current health points of the Cleric.
 * @param initiative The initiative value of the Cleric, determining turn order in combat.
 * @param armor The armor value of the Cleric.
 * @param regeneration The regeneration rate of the Cleric, representing the amount of health restored per turn.
 * @param spellsRemaining The remaining number of spells the Cleric can cast.
 */
class Cleric(
    level: Int,
    name: String = "",
    maxHealth: Int,
    currentHealth: Int,
    initiative: Int,
    var armor: Int,
    var regeneration: Int,
    val spellsRemaining: Int
) : Player(level, name, maxHealth, currentHealth, initiative) {
    /**
     * Function to represent the Cleric as a string.
     * @return A string representation of the Cleric including name, health, initiative, armor, and spells remaining.
     */
    override fun toString() = "Hero's name: ${this.name}, max health: $maxHealth, current health: $currentHealth, initiative: $initiative, armor: $armor, spells remaining: $spellsRemaining."
}