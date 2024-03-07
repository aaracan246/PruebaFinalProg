package org.example.Classes

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