package org.example.Classes

import org.example.GameFlow.Player

class Fighter(name: String = "Noelia",
              maxHealth: Int,
              currentHealth: Int,
              initiative: Int,
              var armor: Int,
              var numberOfExecutes: Int): Player(name,
                                                maxHealth,
                                                currentHealth,
                                                initiative){
}