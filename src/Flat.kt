import java.util.*

// Composite
class Flat(private var rent: Int) : Habitable() {
    var cleaningStrategy: CleaningStrategy = DefaultCleaning()
    // Memento
    class FlatLayout(
        val rent: Int,
        val rooms: List<Room>
    )

    override val inhabitants: Set<String>
        get() = rooms
            .flatMap{it.inhabitants}
            .toSet()
    val rooms: MutableList<Room> = LinkedList()

    fun saveLayout(): FlatLayout {
        return FlatLayout(rent, rooms.toList())
    }

    fun restoreLayout(layout: FlatLayout) {
        rooms.removeAll { true }
        rooms.addAll(layout.rooms)
    }

    fun clean() {
        cleaningStrategy.clean()
    }
}
