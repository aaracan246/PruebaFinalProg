package classes

import org.example.GameFlow.Player

class Fighter(level: Int,
              name: String = "Noelia",
              maxHealth: Int,
              currentHealth: Int,
              initiative: Int,
              var armor: Int,
              var numberOfExecutes: Int): Player(level,
                                                name,
                                                maxHealth,
                                                currentHealth,
                                                initiative){

    override fun toString() = "Hero's name: ${this.name}, max health: $maxHealth, current health: $currentHealth, initiative: $initiative, armor: $armor, executes remaining: $numberOfExecutes."
}