package miscellaneous

import combat.CombatManager
import enemies.Enemy
import org.example.GameFlow.Player

/**
 * Class representing an event in the game.
 */
class Event {
    /**
     * Enumeration defining different types of events.
     */
    enum class EventType {
        ITEM, COMBAT, CURIO
    }

    /**
     * Function to randomly generate an event type.
     * @return A randomly selected event type.
     */
    fun generateEvent(): EventType {
        val listOfEvents = listOf(EventType.ITEM, EventType.COMBAT, EventType.CURIO)
        return listOfEvents.random()
    }

    /**
     * Function to play the generated event.
     * @param eventito The type of event to be played. Defaults to a randomly generated event.
     * @param player The player involved in the event.
     * @param enemy The enemy involved in the event.
     */
    fun playEvent(eventito: EventType = generateEvent(), player: Player, enemy: Enemy) {
        if (eventito == EventType.COMBAT) {
            CombatManager.startCombat(player, enemy)
        } else {
            CombatManager.startCombat(player, enemy)
        }
        //if(eventito == EventType.ITEM){
        //  TODO: NOT YET IMPLEMENTED. . . FUTURE UPDATE
        // }
    }
}