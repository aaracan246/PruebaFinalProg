package classes

import org.example.GameFlow.Player

class Cleric(level: Int,
             name: String = "",
             maxHealth: Int,
             currentHealth: Int,
             initiative: Int,
             var armor: Int,
             var regeneration: Int,
             val spellsRemaining: Int):  Player(level,
                                            name,
                                            maxHealth,
                                            currentHealth,
                                            initiative){

    override fun toString() = "Hero's name: ${this.name}, max health: $maxHealth, current health: $currentHealth, initiative: $initiative, armor: $armor, spells remaining: $spellsRemaining."
}