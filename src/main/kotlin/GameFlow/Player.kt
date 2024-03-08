package org.example.GameFlow

abstract class Player(val name: String,
                      var maxHealth: Int,
                      var currentHealth: Int,
                      val initiative: Int)