package enemies

import enemies.Enemy

class Rat(name: String,
          maxHealth: Int,
          currentHealth: Int,
          initiative: Int): Enemy(name,
                                    maxHealth,
                                    currentHealth,
                                    initiative){
}