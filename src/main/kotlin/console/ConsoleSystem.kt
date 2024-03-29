package org.example.console

import com.github.ajalt.mordant.rendering.BorderType
import com.github.ajalt.mordant.rendering.TextColors
import com.github.ajalt.mordant.rendering.WidthRange
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal
import org.example.GameFlow.CreatePlayer
import org.example.GameFlow.Player

/**
 * Interface defining a method for printing messages.
 */
interface Sender {
    /**
     * Function to print a message.
     * @param msgToPrint The message to be printed.
     */
    fun printer(msgToPrint: String)
}

/**
 * Interface defining a method for reading input.
 */
interface Reader {
    /**
     * Function to read input.
     * @return The input read as a string.
     */
    fun reader(): String
}

/**
 * Object responsible for handling console input and output.
 */
object ConsoleSystem : Sender, Reader {

    /**
     * Function to print a message.
     * @param msgToPrint The message to be printed.
     */
    override fun printer(msgToPrint: String) {
        println(msgToPrint)
    }

    /**
     * Function to read input.
     * @return The input read as a string.
     */
    override fun reader(): String {
        return readln()
    }

    // Terminal color constants
    private val t = Terminal()
    val TEXT_WHITESMOKE = TextColors.rgb("F5F5F5")
    val TEXT_RED = TextColors.red
    val TEXT_DARKMAGENTA = TextColors.rgb("A330C9")
    val TEXT_GOLD = TextColors.rgb("FFDF00")
    val TEXT_GREEN = TextColors.rgb("AAD372")

    /**
     * Function to display the class selection menu.
     */
    fun classSelectorMenu() {
        println("Please select your class:")
        t.println((TextColors.red)("1. Fighter"))
        t.println((TextColors.rgb("FFDF00")("2. Cleric")))
        t.println((TextColors.rgb("AAD372")("3. Rogue")))
        t.println((TextColors.rgb("A330C9")("4. Sorcerer")))
        classMenu()
        t.println((TEXT_WHITESMOKE)("Select the number of your class: "))
    }

    /**
     * Function to display the in-game menu.
     */
    fun inGameMenu() {
        t.println("Select your next move: ")
        t.println("1. Normal attack (1d20)")
        t.println("2. Skill")
        t.println("3. Use item")
        t.println("4. Pass turn")
    }

    /**
     * Function to display class descriptions and skills.
     */
    private fun classMenu() {
        t.println(TEXT_WHITESMOKE("                                   ${TEXT_RED("Fighter")}                                                                      ${TEXT_GOLD("Cleric")}                                                                 ${TEXT_GREEN("Rogue")}                                           \n" +
                "                                                                                                                                                                                                                                   \n" +
                "                 ${TEXT_RED("The fighter")} is a sturdy warrior in heavy armor that                      ${TEXT_GOLD("The cleric")} is a holy warrior in heavy armor that                     ${TEXT_GREEN("The rogue")} is a squishy combatant with high offensive          \n" +
                "                   has both offensive and defensive capabilities.                                 has high defensive capabilities.                                   capabilities. Show your skill with daggers                                                                         \n" +
                "                 Charge right into battle and execute your enemies.                         Pray to your goddess and burn your enemies.                               skewering your enemies with sneak attacks.                                                                        \n" +
                "          Skill: ${TEXT_RED("Executioner")}. You deal x2 damage to enemies below 40% health.       Skill: ${TEXT_GOLD("Pray")}. You can ask your goddess for a favor once per battle.       Skill: ${TEXT_GREEN("Sneak Attack")}. 30% chance to hit your enemy one more time.\n" +
                "                                                                                                                                                                                                                                                                                        \n" +
                "                                                                                                                                                                                                                                                                                        \n" +
                "                                                                                                               ${TEXT_DARKMAGENTA("Sorcerer")}                                                                                                                                      \n" +
                "                                                                                                                                                                                                                                                                                        \n" +
                "                                                                                               ${TEXT_DARKMAGENTA("The sorcerer")} is a squishy spell-caster that                                                                                                                   \n" +
                "                                                                                               has high utility and offensive capabilities.                                                                                                                                             \n" +
                "                                                                                         Show your enemies the destructive power of your bloodline.                                                                                                                                     \n" +
                "                                                                                Skill: ${TEXT_DARKMAGENTA("Spell-casting")}. You can choose from a list of spells to help you in battle.                                                                                             "))
    }

    /**
     * Function to display character data.
     * @param player The player character whose data is to be displayed.
     */
    fun showCharData(player: Player) {
        val table = table {
            borderType = BorderType.ROUNDED
            borderStyle = TEXT_DARKMAGENTA
            WidthRange(300, 500)
            header {
                row(TEXT_WHITESMOKE("Name"), TEXT_WHITESMOKE("Class"), TEXT_WHITESMOKE("Level"))
            }
            body {
                row(TEXT_WHITESMOKE(player.name), TEXT_WHITESMOKE(player.javaClass.simpleName), TEXT_WHITESMOKE("${player.level}"))
            }
        }
        t.println(table)
    }

    /**
     * Function to display the door selection menu.
     */
    fun doorMenu() {
        printer("Which one will you choose?")
        printer("1. White one.")
        printer("2. Black one.")
        printer("Select here: ")
    }


    /**
     * Function to print the prologue of the story.
     */
    fun printPrologue() {
        // Initialize a Terminal instance

        // Define text color for the prologue
        val TEXT_WHITESMOKE = TextColors.rgb("F5F5F5")

        // Print the prologue text with specified formatting and color
        t.println(TEXT_WHITESMOKE(
            "          In the realm of Programoria, where ancient magics intertwine with the steel of swords,\n" +
                    "there exists a guild renowned for its valor and strength: The Order of the SQL (Silver Queen's Labyrinthine)\n" +
                    "Questers. Within its hallowed halls,  warriors  train  relentlessly,  honing  their  skills for the ultimate\n" +
                    "test - the Trial of the Abyss.  At  the  heart  of  Programoria lies the forgotten depths of the Labyrinthine\n" +
                    "Dungeon,a place where darkness reigns and danger lurks at every turn.                              \n" +
                    "                                                                                               \n" +
                    "          It is here that the aspirants must prove themselves worthy of entering into the ranks of the guild.\n" +
                    "You exist among those aspirants.  You  always  dreamed about joining the order and showing your mettle to the \n" +
                    "world. Honor, blood and fame. Everything can be found in the darkest depths of these dungeons.\n"
        ))
    }

    /**
     * Function to simulate entering the dungeon.
     */
    fun enterTheGungeon() {
        // Print messages indicating the moment of entering the dungeon
        ConsoleSystem.printer("It is before you... That long awaited moment... At last you find yourself right before the dungeon...")
        ConsoleSystem.printer(". . .")
        ConsoleSystem.printer("You enter the dungeon. . .")
    }
    fun showSpellListPerClass(){

    }
}


