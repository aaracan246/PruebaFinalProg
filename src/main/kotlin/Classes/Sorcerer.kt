package org.example.Classes

class Sorcerer(name: String,
               maxHealth: Int,
               currentHealth: Int,
               initiative: Int,
               var spellsRemaining: Int): Player(name,
                                                maxHealth,
                                                currentHealth,
                                                initiative){
}