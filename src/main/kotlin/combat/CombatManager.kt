package combat

import enemies.Enemy
import miscellaneous.DiceRoller
import miscellaneous.DiceType
import org.example.GameFlow.Player
import org.example.console.ConsoleSystem

object CombatManager{

    fun startCombat(player: Player, enemy: Enemy){                                                     // Se plantea un sistema de 1 turno yo, 1 turno la máquina
        ConsoleSystem.printer("An enemy has appeared!!")

        while (player.isAlive() && enemy.isAlive()){
            ConsoleSystem.inGameMenu()

            val selection = ConsoleSystem.reader().toIntOrNull()
            when(selection){                                                                          // Este sería el turno del jugador
                1 -> playerAttack(player, enemy)

                2 -> playerSkill()

                3 -> playerItem()

                4 -> { ConsoleSystem.printer("${player.name} passes their turn!") }

                else ->  ConsoleSystem.printer("Invalid choice.")
            }
        }

        if (enemy.isAlive()){                                                                        // Turno máquina
            enemyAttack(player, enemy)
        }
    }
}

// FALTA IMPLEMENTAR TAKEDMG EN LAS DOS FUNCIONES
fun playerAttack(player: Player, enemy: Enemy): Int {
    val diceRoller = DiceRoller()
    val d20 = DiceType.D20
    val roll = diceRoller.roll(d20)
    val critFail = 2
    when (roll) {

        in 2..19 -> ConsoleSystem.printer("You rolled a $roll. ${enemy.name} receives $roll points of dmg.")

        1 -> ConsoleSystem.printer("Critical failure!! You rolled a $roll. You miss the attack so hard you hit yourself in the head and take $critFail points of dmg.")

        20 -> ConsoleSystem.printer("Critical hit!! You rolled a $roll.")
    }
    enemy.takeDmg(roll)
    return roll
}

    fun playerSkill(){}

    fun playerItem(){}

    fun enemyAttack(player: Player, enemy: Enemy): Int{
        val diceRoller = DiceRoller()
        val d20 = DiceType.D20
        val roll = diceRoller.roll(d20)
        val critFail = 2
        when (roll) {

            in 2..19 -> ConsoleSystem.printer("Enemy rolled a $roll. ${player.name} receives $roll points of dmg.")

            1 -> ConsoleSystem.printer("Critical failure!! Enemy rolled a $roll. Enemy misses the attack so hard it hit itself in the head and take $critFail points of dmg.")

            20 -> ConsoleSystem.printer("Critical hit!! Enemy rolled a $roll.")
        }
        player.takeDmg(roll)
        return roll
    }



