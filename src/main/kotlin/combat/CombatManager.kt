package combat

import enemies.Enemy
import miscellaneous.DiceRoller
import miscellaneous.DiceType
import org.example.Enemies.Bosses.Diego
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
        if (enemy.isAlive()){                                                                        // Turno máquina
            ConsoleSystem.printer(". . .")
            enemyAttack(player, enemy)
            ConsoleSystem.printer(". . .")
        }
        if (!player.isAlive()){
            ConsoleSystem.printer("You died.")
        }
        if (!enemy.isAlive()){
            ConsoleSystem.printer("The enemy was defeated!!")
        }
        }

        ConsoleSystem.printer("Ending combat...")
    }
}


fun playerAttack(player: Player, enemy: Enemy): Int {
    val diceRoller = DiceRoller()
    val d20 = DiceType.D20
    val roll = diceRoller.roll(d20)
    val critFail = 2
    when (roll) {

        in 2..19 -> ConsoleSystem.printer("You rolled a $roll. ${enemy.name} receives $roll points of dmg. (Current health: ${enemy.currentHealth})")

        1 -> ConsoleSystem.printer("Critical failure!! You rolled a $roll. You miss the attack so hard you hit yourself in the head and take $critFail points of dmg. (${player.currentHealth})")

        20 -> ConsoleSystem.printer("Critical hit!! You rolled a $roll. (Current health: ${enemy.currentHealth})")
    }
    enemy.takeDmg(roll)
    return roll
}

    fun playerSkill(){ ConsoleSystem.printer("Welcome to our assistant! This element has not been implemented yet! Sorry for the inconvenience!") }

    fun playerItem(){ ConsoleSystem.printer("Welcome to our assistant! This element has not been implemented yet! Sorry for the inconvenience!") }

    fun enemyAttack(player: Player, enemy: Enemy): Int{
        val diceRoller = DiceRoller()
        val d20 = DiceType.D20
        val roll = diceRoller.roll(d20)
        val critFail = 2
        when (roll) {

            in 2..19 -> ConsoleSystem.printer("Enemy rolled a $roll. ${player.name} receives $roll points of dmg. (Current health: ${player.currentHealth})")

            1 -> ConsoleSystem.printer("Critical failure!! Enemy rolled a $roll. Enemy misses the attack so hard it hit itself in the head and take $critFail points of dmg. (Current health: ${enemy.currentHealth})")

            20 -> ConsoleSystem.printer("Critical hit!! Enemy rolled a $roll. (Current health: ${player.currentHealth})")
        }
        player.takeDmg(roll)
        return roll
    }


    fun startBossCombat(player: Player, boss: Diego){
        ConsoleSystem.printer("The room shifts, the temperature grows. Something's wrong. You have been feeling strange from the moment you went through the red door.")
        ConsoleSystem.printer(". . .")
        ConsoleSystem.printer("There it is. The heart of the dungeon, a chest with unfathomable treasure... And right before it, a shrouded figure...")
        ConsoleSystem.printer(". . .")
        ConsoleSystem.printer(". . .")
        ConsoleSystem.printer(". . .")
        ConsoleSystem.printer("As you walk towards the figure, he unshrouds himself. . .")
        ConsoleSystem.printer(". . .")
        ConsoleSystem.printer("it is Diego, lord of jokes and picardía.")

        CombatManager.startCombat(player, boss)
    }



