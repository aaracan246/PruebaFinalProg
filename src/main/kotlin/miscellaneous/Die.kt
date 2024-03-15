package miscellaneous

/**
 * Enum class representing different types of dice.
 * @property numberOfFaces The number of faces on the die.
 */
enum class DiceType(val numberOfFaces: Int) {
    /** Represents a 4-sided die. */
    D4(4),
    /** Represents a 6-sided die. */
    D6(6),
    /** Represents a 20-sided die. */
    D20(20),
    /** Represents a 100-sided die. */
    D100(100)
}

/**
 * Interface defining a roller for rolling dice.
 */
interface Roller {
    /**
     * Function to roll a die of a specified type.
     * @param dieType The type of die to roll.
     * @return The result of the roll.
     */
    fun roll(dieType: DiceType): Int
}

/**
 * Class implementing the Roller interface for rolling dice.
 */
class DiceRoller : Roller {
    /**
     * Function to roll a die of a specified type.
     * @param dieType The type of die to roll.
     * @return The result of the roll.
     */
    override fun roll(dieType: DiceType): Int {
        return (1..dieType.numberOfFaces).random()
    }
}
