package org.example.Enemies.Bosses

import enemies.Enemy

class Diego(nombre: String = "Lord of jokes and picardía", maxHealth: Int = 100, currentHealth: Int = 100, initiative: Int): Enemy(nombre, maxHealth, currentHealth, initiative){

    fun hacerTrampas(){
        currentHealth += 100
    }
}