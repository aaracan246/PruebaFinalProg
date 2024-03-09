package enemies

import enemies.Enemy

open class Summoner(name: String,
                    maxHealth: Int,
                    currentHealth: Int,
                    initiative: Int): Enemy(name,
                                            maxHealth,
                                            currentHealth,
                                            initiative){
}