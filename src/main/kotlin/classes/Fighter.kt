package classes

import org.example.GameFlow.Player

/**
 * Class representing a Fighter player character in the game.
 * @param level The level of the Fighter.
 * @param name The name of the Fighter. Default is set to "Noelia".
 * @param maxHealth The maximum health points of the Fighter.
 * @param currentHealth The current health points of the Fighter.
 * @param initiative The initiative value of the Fighter, determining turn order in combat.
 * @param armor The armor value of the Fighter.
 * @param numberOfExecutes The remaining number of special executes the Fighter can perform.
 */
class Fighter(
    level: Int,
    name: String = "Noelia",
    maxHealth: Int,
    currentHealth: Int,
    initiative: Int,
    var armor: Int,
    var numberOfExecutes: Int
) : Player(level, name, maxHealth, currentHealth, initiative) {
    /**
     * Function to represent the Fighter as a string.
     * @return A string representation of the Fighter including name, health, initiative, armor, and remaining executes.
     */
    override fun toString() = "Hero's name: ${this.name}, max health: $maxHealth, current health: $currentHealth, initiative: $initiative, armor: $armor, executes remaining: $numberOfExecutes."
}