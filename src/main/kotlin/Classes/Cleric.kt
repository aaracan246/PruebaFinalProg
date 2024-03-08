package org.example.Classes

import org.example.GameFlow.Player

class Cleric(name: String,
             maxHealth: Int,
             currentHealth: Int,
             initiative: Int,
             var armor: Int,
             var regeneration: Int,
             spellsRemaining: Int):  Player(name,
                                            maxHealth,
                                            currentHealth,
                                            initiative){

}