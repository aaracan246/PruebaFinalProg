package enemies

open class Enemy(val name: String,
                 val maxHealth: Int,
                 var currentHealth: Int,
                 val initiative: Int) {

    fun isAlive(): Boolean{
        return currentHealth > 0
    }
}