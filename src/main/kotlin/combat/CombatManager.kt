package combat

import enemies.Enemy
import org.example.GameFlow.Player
import org.example.console.ConsoleSystem

object CombatManager{

    fun startCombat(player: Player, enemy: Enemy){                                                     // Se plantea un sistema de 1 turno yo, 1 turno la máquina
        ConsoleSystem.printer("An enemy has appeared!!")

        while (player.isAlive() && enemy.isAlive()){
            ConsoleSystem.inGameMenu()

            val selection = ConsoleSystem.reader().toIntOrNull()
            when(selection){                                                                          // Este sería el turno del jugador
                1 -> playerAttack()

                2 -> playerSkill()

                3 -> playerItem()

                4 -> { ConsoleSystem.printer("${player.name} passes their turn!") }

                else ->  ConsoleSystem.printer("Invalid choice.")
            }
        }

        if (enemy.isAlive()){                                                                        // Turno máquina
            enemyAttack()
        }
    }
}


    fun playerAttack(){}

    fun playerSkill(){}

    fun playerItem(){}

    fun enemyAttack(){}





}