import java.util.*

// Decorator
class RoomDecorator(private val room: Room) {
    val inhabitants get() = room.inhabitants
    val furniture: MutableList<String> = LinkedList()
}