package miscellaneous

import com.github.ajalt.mordant.rendering.TextColors
import com.github.ajalt.mordant.terminal.Terminal
import org.example.console.ConsoleSystem

/**
 * Object defining various stories and their elements.
 */
object Stories {
    /**
     * Function to print the prologue of the story.
     */
    fun printPrologue() {
        // Initialize a Terminal instance
        val t = Terminal()
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
}



//"In the realm of Programoria, where ancient magics intertwine with the steel of swords, there exists a guild renowned for its valor and strength: The Order of the SQL (Silver Queen's Labyrinthine) Questers. Within its hallowed halls, warriors train relentlessly, honing their skills for the ultimate test - the Trial of the Abyss. At the heart of Programoria lies the forgotten depths of the Labyrinthine Dungeon, a place where darkness reigns and danger lurks at every turn. It is here that the aspirants must prove themselves worthy of entering into the ranks of the guild. You exist among those aspirants. You always dreamed about joining the order and showing your mettle to the world. Honor, blood and fame. Everything can be found in the darkest depths of these dungeons."