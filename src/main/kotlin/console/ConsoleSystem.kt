package org.example.console

import com.github.ajalt.mordant.rendering.BorderType
import com.github.ajalt.mordant.rendering.TextColors
import com.github.ajalt.mordant.rendering.WidthRange
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal
import org.example.GameFlow.Player


open class ConsoleSystem {
        private val t = Terminal()
companion object{
    val TEXT_WHITESMOKE = TextColors.rgb("F5F5F5")
    val TEXT_RED = TextColors.red
    val TEXT_DARKMAGENTA = TextColors.rgb("A330C9")
    val TEXT_GOLD = TextColors.rgb("FFDF00")
    val TEXT_GREEN = TextColors.rgb("AAD372")
}
    open fun classMenu(){



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



    open fun showCharData(player: Player){

        val table = table {
            borderType = BorderType.ROUNDED
            borderStyle = TEXT_DARKMAGENTA
            WidthRange(300, 500)
            header {
                row(TEXT_WHITESMOKE("Name"), TEXT_WHITESMOKE("Class"), TEXT_WHITESMOKE("Level"))
            }
            body {
                row(TEXT_WHITESMOKE(player.name), TEXT_WHITESMOKE(player.javaClass.simpleName), TEXT_WHITESMOKE("${player.level}"))  //player.javaClass.simpleName debería imprimir el nombre asignado a la clase del ítem
            }

        }
        t.println(table)
    }
}


