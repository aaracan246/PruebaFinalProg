package org.example.Miscellaneous

interface Roller{
    fun roll(die: Die): Int
}

abstract class Die(val numberOfFaces: Int)

class D4: Die(4)

class D6: Die(6)

class D20: Die(20)

class D100: Die(100)

class DiceRoller: Roller {
    override fun roll(die: Die): Int {
        return (1..die.numberOfFaces).random()
    }

}
