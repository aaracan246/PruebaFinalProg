package classes

import org.example.GameFlow.Player

class Rogue(name: String = "Murochima",
            maxHealth: Int,
            currentHealth: Int,
            initiative: Int,
            var sneakAttack: Boolean = true): Player(name,
                                                    maxHealth,
                                                    currentHealth,
                                                    initiative){
    override fun toString() = "Hero's name: ${this.name}, max health: $maxHealth, current health: $currentHealth, initiative: $initiative."
}