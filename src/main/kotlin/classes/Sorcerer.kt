package classes

import org.example.GameFlow.Player

class Sorcerer(level: Int,
               name: String = "Kaeus",
               maxHealth: Int,
               currentHealth: Int,
               initiative: Int,
               var spellsRemaining: Int): Player(level,
                                                name,
                                                maxHealth,
                                                currentHealth,
                                                initiative){
    override fun toString() = "Hero's name: ${this.name}, max health: $maxHealth, current health: $currentHealth, initiative: $initiative, spells remaining: $spellsRemaining."
}