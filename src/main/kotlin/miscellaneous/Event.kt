package miscellaneous

import combat.CombatManager
import enemies.Enemy
import org.example.GameFlow.Player

class Event {

    enum class EventType{
        ITEM, COMBAT, CURIO
    }

    fun generateEvent(): EventType{
        val listOfEvents = listOf(EventType.ITEM, EventType.COMBAT, EventType.CURIO)

        return listOfEvents.random()
    }

    fun playEvent(eventito: EventType = generateEvent(), player: Player, enemy: Enemy){
        if (eventito == EventType.COMBAT){
            CombatManager.startCombat(player, enemy)
        }
        else{
            CombatManager.startCombat(player, enemy)
        }
        //if(eventito == EventType.ITEM){
    //  TODO: NOT YET IMPLEMENTED. . . FUTURE UPDATE
    // }

    }
}