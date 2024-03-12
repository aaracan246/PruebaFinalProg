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

interface CharacterCreator <T: Player>{
        fun createChar(): T
    }

object CreatePlayer: CharacterCreator<Player>{
    override fun createChar(): Player {


        val diceRoller = DiceRoller()
        val d20 = DiceType.D20
        val charName = enterCharName()


        //Stats:
        val maxHealth = (20..50).random()
        var currentHealth = maxHealth
        val initiative = diceRoller.roll(d20)

        ConsoleSystem.classSelectorMenu()

        val selection = readln()

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

    private fun enterCharName(): String{

        var charName: String
        do {
            ConsoleSystem.printer("Please enter the character's name:")
            charName = readln()
            if (charName.isBlank()) { ConsoleSystem.printer("Name cannot be blank.") }
            else if (charName.any { it.isDigit() }) { ConsoleSystem.printer("Name cannot be a number.") }

        }while (charName.isBlank() || charName.any { it.isDigit() })

        return charName
    }


    private fun createFighter(charName: String): Fighter {
        return Fighter(level = 1, name = charName, maxHealth = 50, currentHealth = 50, initiative = 10, armor = 10, numberOfExecutes = 5)
    }

    private fun createCleric(charName: String): Cleric {
        return Cleric(level = 1, name = charName, maxHealth = 35, currentHealth = 35, initiative = 10, armor = 10, regeneration = 2, spellsRemaining = 3)
    }

    private fun createRogue(charName: String): Rogue {
        return Rogue(level = 1, name = charName, maxHealth = 30, currentHealth = 30, initiative = 10, sneakAttack = true)
    }

    private fun createSorcerer(charName: String): Sorcerer {
        return Sorcerer(level = 1, name = charName, maxHealth = 28, currentHealth = 28, initiative = 10, spellsRemaining = 6)
    }

}


