package miscellaneous

import combat.startBossCombat
import org.example.Enemies.Bosses.Diego
import org.example.GameFlow.Player
import org.example.console.ConsoleSystem

/**
 * Class representing mappers in the game.
 */
open class Mappers {
    /**
     * Enumeration defining different colors of doors.
     */
    enum class DoorColor {
        WHITE, BLACK, RED
    }

    /**
     * Function to choose a door.
     */
    open fun chooseDoor() {
        ConsoleSystem.printer("Before you stand two mighty doors. On your left there is a ${DoorColor.WHITE} door. On your right a ${DoorColor.BLACK} one.")
        ConsoleSystem.doorMenu()

        val selection = ConsoleSystem.reader()
        val event = Event()

        when (selection.toIntOrNull()) {
            1 -> event.generateEvent()
            2 -> event.generateEvent()
            else -> event.generateEvent()
        }
    }

    /**
     * Function to handle the red door event.
     * @param player The player involved in the event.
     * @param boss The boss enemy involved in the event.
     */
    open fun redDoor(player: Player, boss: Diego) {
        ConsoleSystem.printer("Before you stands a ${DoorColor.RED} door. It has a fiery red color and a symbol that vaguely reminds you of a skull. This is surely the boss room. Prepare for the worst.")
        startBossCombat(player, boss)
    }
}