package org.example.Classes

class Rogue(name: String,
            maxHealth: Int,
            currentHealth: Int,
            initiative: Int,
            var sneakAttack: Boolean = true): Player(name,
                                                    maxHealth,
                                                    currentHealth,
                                                    initiative){
}