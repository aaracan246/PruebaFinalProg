package gameflow

import org.example.GameFlow.Player
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*


/**
 * Class representing a fake player used for testing purposes.
 * Inherits from the abstract class Player.
 * @param level The level of the player.
 * @param name The name of the player.
 * @param maxHealth The maximum health points of the player.
 * @param currentHealth The current health points of the player.
 * @param initiative The initiative value of the player, determining turn order in combat.
 */
class FakePlayer(                     // Se implementa una clase mock debido a que la clase real es abstract y no puede instanciarse
    level: Int,
    name: String,
    maxHealth: Int,
    currentHealth: Int,
    initiative: Int
) : Player(level, name, maxHealth, currentHealth, initiative)

/**
 * Class containing test cases for the Player class.
 */
class PlayerTest {

    /**
     * Test case to check the isAlive() function when the player is alive.
     */
    @Test
    fun testIsAlive_PlayerAlive() {
        val initialHealth = 100

        // Create a fake player with initial health greater than 0
        val player = FakePlayer(1, "FakePlayer", initialHealth, initialHealth, 10)
        assertEquals(true, player.isAlive())
    }

    /**
     * Test case to check the isAlive() function when the player is dead.
     */
    @Test
    fun testIsAlive_PlayerDead() {
        val initialHealth = 0

        // Create a fake player with initial health equal to 0
        val player = FakePlayer(1, "FakePlayer", initialHealth, initialHealth, 10)
        assertEquals(false, player.isAlive())
    }

    /**
     * Test case to check the takeDmg() function.
     */
    @Test
    fun testTakeDmg() {
        val initialHealth = 100
        val damageTaken = 20
        val expectedHealthAfterDamage = initialHealth - damageTaken

        // Create a fake player with initial health and apply damage
        val player = FakePlayer(1, "FakePlayer", initialHealth, initialHealth, 10)
        player.takeDmg(damageTaken)

        // Assert that the player's current health is updated correctly after taking damage
        assertEquals(expectedHealthAfterDamage, player.currentHealth)
    }
}