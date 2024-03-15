package org.example.Enemies.Bosses

import enemies.Enemy

/**
 * Class representing an enemy named Diego in the game.
 * @param nombre The name of the enemy. Default is set to "Lord of jokes and picardía".
 * @param maxHealth The maximum health points of the enemy. Default is set to 100.
 * @param currentHealth The current health points of the enemy. Default is set to 100.
 * @param initiative The initiative value of the enemy, determining turn order in combat.
 */
class Diego(nombre: String = "Lord of jokes and picardía", maxHealth: Int = 100, currentHealth: Int = 100, initiative: Int)
    : Enemy(nombre, maxHealth, currentHealth, initiative) {

    /**
     * Function to cheat, adding health points to the enemy.
     */
    fun hacerTrampas() {
        currentHealth += 100
    }
}