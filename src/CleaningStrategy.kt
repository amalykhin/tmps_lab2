interface CleaningStrategy {
    fun clean()
}

class DefaultCleaning: CleaningStrategy {
    override fun clean() {
        println("No cleaning for you")
    }
}

class DustCleaning: CleaningStrategy {
    override fun clean() {
        println("Cleaning dust in the house")
    }
}

class WetCleaning: CleaningStrategy {
    override fun clean() {
        println("Mopping all the floors in the house")
    }
}