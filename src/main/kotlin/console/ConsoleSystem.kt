package org.example.console

import com.github.ajalt.mordant.rendering.TextColors
import com.github.ajalt.mordant.table.Table
import com.github.ajalt.mordant.terminal.Terminal
import org.example.GameFlow.Player

open class ConsoleSystem {
    open fun classMenu(){

        val t = Terminal()
        val textWhitesmoke = TextColors.rgb("F5F5F5")
        val textRed = TextColors.red
        val textDarkMagenta = TextColors.rgb("A330C9")
        val textGold = TextColors.rgb("FFDF00")
        val textGreen = TextColors.rgb("AAD372")

        t.println(textWhitesmoke("                                   ${textRed("Fighter")}                                                                      ${textGold("Cleric")}                                                                 ${textGreen("Rogue")}                                           \n" +
                "                                                                                                                                                                                                                                   \n" +
                "                 ${textRed("The fighter")} is a sturdy warrior in heavy armor that                      ${textGold("The cleric")} is a holy warrior in heavy armor that                     ${textGreen("The rogue")} is a squishy combatant with high offensive          \n" +
                "                   has both offensive and defensive capabilities.                                 has high defensive capabilities.                                   capabilities. Show your skill with daggers                                                                         \n" +
                "                 Charge right into battle and execute your enemies.                         Pray to your goddess and burn your enemies.                               skewering your enemies with sneak attacks.                                                                        \n" +
                "          Skill: ${textRed("Executioner")}. You deal x2 damage to enemies below 40% health.       Skill: ${textGold("Pray")}. You can ask your goddess for a favor once per battle.       Skill: ${textGreen("Sneak Attack")}. 30% chance to hit your enemy one more time.\n" +
                "                                                                                                                                                                                                                                                                                        \n" +
                "                                                                                                                                                                                                                                                                                        \n" +
                "                                                                                                               ${textDarkMagenta("Sorcerer")}                                                                                                                                      \n" +
                "                                                                                                                                                                                                                                                                                        \n" +
                "                                                                                               ${textDarkMagenta("The sorcerer")} is a squishy spell-caster that                                                                                                                   \n" +
                "                                                                                               has high utility and offensive capabilities.                                                                                                                                             \n" +
                "                                                                                         Show your enemies the destructive power of your bloodline.                                                                                                                                     \n" +
                "                                                                                Skill: ${textDarkMagenta("Spell-casting")}. You can choose from a list of spells to help you in battle.                                                                                             "))
    }



//    open fun showCharData(): Player{
//
//        Table
//
//
//    }
}


