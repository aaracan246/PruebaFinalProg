package enemies

/**
 * Open class representing an enemy in the game.
 * @property name The name of the enemy.
 * @property maxHealth The maximum health points of the enemy.
 * @property currentHealth The current health points of the enemy.
 * @property initiative The initiative value of the enemy, determining turn order in combat.
 */
open class Enemy(
    val name: String,
    val maxHealth: Int,
    var currentHealth: Int,
    val initiative: Int
) {
    /**
     * Function to check if the enemy is alive.
     * @return True if the enemy's current health is greater than 0, false otherwise.
     */
    fun isAlive(): Boolean {
        return currentHealth > 0
    }

    /**
     * Function to apply damage to the enemy.
     * @param dmgTaken The amount of damage to be taken.
     */
    fun takeDmg(dmgTaken: Int) {
        currentHealth -= dmgTaken
    }
}