package org.example.Miscellaneous

enum class DiceType(val numberOfFaces: Int){

    D4(4),
    D6(6),
    D20(20),
    D100(100)

}
interface Roller{
    fun roll(dieType: DiceType): Int

}

class DiceRoller: Roller {
    override fun roll(dieType: DiceType): Int {
        return (1..dieType.numberOfFaces).random()
    }

}
