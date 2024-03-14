package org.example.GameFlow

abstract class Player(var level: Int,
                      val name: String,
                      var maxHealth: Int,
                      var currentHealth: Int,
                      val initiative: Int){

    fun isAlive(): Boolean{
        return currentHealth > 0
    }
}