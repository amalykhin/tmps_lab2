import java.util.*

class Room (val name: String) : Habitable() {
    override val inhabitants: MutableList<String> = LinkedList()
}