package org.example.GameFlow

import com.github.ajalt.mordant.animation.textAnimation
import com.github.ajalt.mordant.terminal.Terminal


object CreatePlayer {

    fun pickName(name: String){
        println("Please, pick a name: ")

        try {
            val heroName = readln()
        } catch (e: Exception) {
            println("The hero's name cannot have numeric input.")
            throw e
        }
    }

    fun pickClass(){
        classMenu()

        println("Please, select your class: ")



    }

    fun classMenu(){

        val terminal = Terminal()
        //TODO: Introducir esto con Mordant

        println("Fighter")
        println("________")
        println("The fighter is a sturdy warrior in heavy armor that has both offensive and defensive capabilities. Charge right into battle and execute your enemies.")
        println("________")
        println("Skill: Execute. You deal x2 damage to enemies below 40% health.")


        println("Cleric")
        println("________")
        println("The cleric is a holy warrior in heavy armor that has high defensive capabilities. Pray to your goddess and burn your enemies.")
        println("________")
        println("Skill: Pray. You can ask your goddess for a favor once per battle.")


        println("Rogue")
        println("________")
        println("The rogue is a squishy combatant with high offensive capabilities. Show your skill with daggers skewering your enemies with sneak attacks.")
        println("________")
        println("Skill: Sneak Attack. Each time you attack you have a 30% chance to sneak attack, hitting your enemy one more time.")



        println("Sorcerer")
        println("________")
        println("The sorcerer is a squishy spell-caster that has high utility and offensive capabilities. Show your enemies the destructive power of your bloodline.")
        println("________")
        println("Skill: Spell-casting. You can choose from a list of spells to help you in battle.")

    }
}