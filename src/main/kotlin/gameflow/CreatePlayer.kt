package org.example.GameFlow

import classes.Cleric
import classes.Fighter
import classes.Rogue
import classes.Sorcerer
import com.github.ajalt.mordant.rendering.TextColors
import com.github.ajalt.mordant.terminal.Terminal
import miscellaneous.DiceRoller
import miscellaneous.DiceType
import org.example.console.ConsoleSystem
import org.example.console.Sender

/**
 * Interface defining a character creator.
 * @param T The type of player to be created.
 */
interface CharacterCreator<T: Player> {
    /**
     * Function to create a character of type T.
     * @return An instance of type T representing the created character.
     */
    fun createChar(): T
}

/**
 * Object implementing the CharacterCreator interface for creating players.
 */
object CreatePlayer: CharacterCreator<Player> {
    /**
     * Function to create a player character.
     * @return A Player object representing the created character.
     */
    override fun createChar(): Player {
        // Create a DiceRoller instance
        val diceRoller = DiceRoller()
        // Define the type of dice to be rolled
        val d20 = DiceType.D20
        // Prompt user to enter character name
        val charName = enterCharName()

        // Generate random values for initial character stats
        val maxHealth = (20..50).random()
        var currentHealth = maxHealth
        val initiative = diceRoller.roll(d20)

        // Display character class selection menu
        ConsoleSystem.classSelectorMenu()

        // Read user input for class selection
        val selection = readln()

        // Create character based on user selection
        return when (selection.toIntOrNull()) {
            1 -> createFighter(charName)
            2 -> createCleric(charName)
            3 -> createRogue(charName)
            4 -> createSorcerer(charName)
            else -> {
                ConsoleSystem.printer("Invalid choice. Defaulting to the coolest class.")
                createCleric(charName)
            }
        }
    }

    /**
     * Function to prompt the user to enter a character name.
     * @return The entered character name.
     */
    private fun enterCharName(): String {
        var charName: String
        do {
            ConsoleSystem.printer("Please enter the character's name:")
            charName = readln()
            if (charName.isBlank()) { ConsoleSystem.printer("Name cannot be blank.") }
            else if (charName.any { it.isDigit() }) { ConsoleSystem.printer("Name cannot be a number.") }
        } while (charName.isBlank() || charName.any { it.isDigit() })

        return charName
    }

    /**
     * Function to create a Fighter character.
     * @param charName The name of the character.
     * @return An instance of Fighter representing the created character.
     */
    private fun createFighter(charName: String): Fighter {
        return Fighter(level = 1, name = charName, maxHealth = 50, currentHealth = 50, initiative = 10, armor = 10, numberOfExecutes = 5)
    }

    /**
     * Function to create a Cleric character.
     * @param charName The name of the character.
     * @return An instance of Cleric representing the created character.
     */
    private fun createCleric(charName: String): Cleric {
        return Cleric(level = 1, name = charName, maxHealth = 35, currentHealth = 35, initiative = 10, armor = 10, regeneration = 2, spellsRemaining = 3)
    }

    /**
     * Function to create a Rogue character.
     * @param charName The name of the character.
     * @return An instance of Rogue representing the created character.
     */
    private fun createRogue(charName: String): Rogue {
        return Rogue(level = 1, name = charName, maxHealth = 30, currentHealth = 30, initiative = 10, sneakAttack = true)
    }

    /**
     * Function to create a Sorcerer character.
     * @param charName The name of the character.
     * @return An instance of Sorcerer representing the created character.
     */
    private fun createSorcerer(charName: String): Sorcerer {
        return Sorcerer(level = 1, name = charName, maxHealth = 28, currentHealth = 28, initiative = 10, spellsRemaining = 6)
    }
}

