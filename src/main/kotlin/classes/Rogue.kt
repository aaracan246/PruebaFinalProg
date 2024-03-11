package classes

import org.example.GameFlow.Player

class Rogue(level: Int,
            name: String = "Murochima",
            maxHealth: Int,
            currentHealth: Int,
            initiative: Int,
            var sneakAttack: Boolean = true): Player(level,
                                                    name,
                                                    maxHealth,
                                                    currentHealth,
                                                    initiative){
    override fun toString() = "Hero's name: ${this.name}, max health: $maxHealth, current health: $currentHealth, initiative: $initiative."
}