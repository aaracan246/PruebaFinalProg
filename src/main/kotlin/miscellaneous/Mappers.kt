package miscellaneous

import combat.startBossCombat
import org.example.Enemies.Bosses.Diego
import org.example.GameFlow.Player
import org.example.console.ConsoleSystem

open class Mappers {

    enum class DoorColor{
        WHITE, BLACK, RED
    }

    open fun chooseDoor(){
        ConsoleSystem.printer("Before you stand two mighty doors. On your left there is a ${DoorColor.WHITE} door. On your right a ${DoorColor.BLACK} one.")
        ConsoleSystem.doorMenu()

        val selection = ConsoleSystem.reader()
        val event = Event()

        when(selection.toIntOrNull()){

            1 -> event.generateEvent()

            2 -> event.generateEvent()

            else -> event.generateEvent()
        }
    }

    open fun redDoor(player: Player, boss: Diego){
        ConsoleSystem.printer("Before you stands a ${DoorColor.RED} door. It has a fiery red color and a symbol that vaguely reminds you of a skull. This is surely the boss room. Prepare for the worst.")
        startBossCombat(player, boss)
    }

}