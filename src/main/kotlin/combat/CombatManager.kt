package combat

import enemies.Enemy
import miscellaneous.DiceRoller
import miscellaneous.DiceType
import org.example.Enemies.Bosses.Diego
import org.example.GameFlow.Player
import org.example.console.ConsoleSystem

/**
 * Object responsible for managing combat between a player and an enemy.
 */
object CombatManager {
    /**
     * Function to start a combat encounter between a player and an enemy.
     * @param player The player participating in the combat.
     * @param enemy The enemy the player is facing.
     */
    fun startCombat(player: Player, enemy: Enemy) {
        ConsoleSystem.printer("An enemy has appeared!!")

        // Continue combat until either the player or the enemy is defeated
        while (player.isAlive() && enemy.isAlive()) {
            // Display in-game menu for player actions
            ConsoleSystem.inGameMenu()

            // Read player's selection from the menu
            val selection = ConsoleSystem.reader().toIntOrNull()
            when (selection) {
                1 -> playerAttack(player, enemy)    // Player chooses to attack
                2 -> playerSkill()                  // Player chooses to use a skill (not implemented)
                3 -> playerItem()                   // Player chooses to use an item (not implemented)
                4 -> { ConsoleSystem.printer("${player.name} passes their turn!") } // Player chooses to pass their turn
                else -> ConsoleSystem.printer("Invalid choice.")
            }

            // If enemy is still alive, perform enemy's attack
            if (enemy.isAlive()) {
                ConsoleSystem.printer(". . .")
                enemyAttack(player, enemy)
                ConsoleSystem.printer(". . .")
            }

            // Check if player is defeated
            if (!player.isAlive()) {
                ConsoleSystem.printer("You died.")
            }

            // Check if enemy is defeated
            if (!enemy.isAlive()) {
                ConsoleSystem.printer("The enemy was defeated!!")
            }
        }

        // Combat ends
        ConsoleSystem.printer("Ending combat...")
    }
}

/**
 * Function to execute a player's attack on an enemy.
 * @param player The player performing the attack.
 * @param enemy The enemy being attacked.
 * @return The value rolled on the dice.
 */
fun playerAttack(player: Player, enemy: Enemy): Int {
    val diceRoller = DiceRoller()
    val d20 = DiceType.D20
    val roll = diceRoller.roll(d20)
    val critFail = 2
    when (roll) {
        in 2..19 -> ConsoleSystem.printer("You rolled a $roll. ${enemy.name} receives $roll points of dmg. (Current health: ${enemy.currentHealth})")
        1 -> ConsoleSystem.printer("Critical failure!! You rolled a $roll. You miss the attack so hard you hit yourself in the head and take $critFail points of dmg. (${player.currentHealth})")
        20 -> ConsoleSystem.printer("Critical hit!! You rolled a $roll. (Current health: ${enemy.currentHealth})")
    }
    enemy.takeDmg(roll)
    return roll
}

/**
 * Function to execute a player's skill (not implemented).
 */
fun playerSkill() {
    ConsoleSystem.printer("Welcome to our assistant! This element has not been implemented yet! Sorry for the inconvenience!")
}

/**
 * Function to execute a player's item use (not implemented).
 */
fun playerItem() {
    ConsoleSystem.printer("Welcome to our assistant! This element has not been implemented yet! Sorry for the inconvenience!")
}

/**
 * Function to execute an enemy's attack on the player.
 * @param player The player being attacked.
 * @param enemy The enemy performing the attack.
 * @return The value rolled on the dice.
 */
fun enemyAttack(player: Player, enemy: Enemy): Int {
    val diceRoller = DiceRoller()
    val d20 = DiceType.D20
    val roll = diceRoller.roll(d20)
    val critFail = 2
    when (roll) {
        in 2..19 -> ConsoleSystem.printer("Enemy rolled a $roll. ${player.name} receives $roll points of dmg. (Current health: ${player.currentHealth})")
        1 -> ConsoleSystem.printer("Critical failure!! Enemy rolled a $roll. Enemy misses the attack so hard it hit itself in the head and take $critFail points of dmg. (Current health: ${enemy.currentHealth})")
        20 -> ConsoleSystem.printer("Critical hit!! Enemy rolled a $roll. (Current health: ${player.currentHealth})")
    }
    player.takeDmg(roll)
    return roll
}

/**
 * Function to start a combat encounter with a boss enemy.
 * @param player The player participating in the combat.
 * @param boss The boss enemy to fight against.
 */
fun startBossCombat(player: Player, boss: Diego) {
    ConsoleSystem.printer("The room shifts, the temperature grows. Something's wrong. You have been feeling strange from the moment you went through the red door.")
    ConsoleSystem.printer(". . .")
    ConsoleSystem.printer("There it is. The heart of the dungeon, a chest with unfathomable treasure... And right before it, a shrouded figure...")
    ConsoleSystem.printer(". . .")
    ConsoleSystem.printer(". . .")
    ConsoleSystem.printer(". . .")
    ConsoleSystem.printer("As you walk towards the figure, he unshrouds himself. . .")
    ConsoleSystem.printer(". . .")
    ConsoleSystem.printer("it is Diego, lord of jokes and picardía.")

    // Start combat with the boss enemy
    CombatManager.startCombat(player, boss)
}



