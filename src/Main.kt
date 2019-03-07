import jdk.internal.org.objectweb.asm.tree.AnnotationNode
import kotlin.reflect.full.findAnnotation

fun main() {
    val kitchen = @Heated Room("Kitchen")
    kitchen.inhabitants.add("Gordon Ramsay")

    val decoratedKitchen = RoomDecorator(kitchen)
    decoratedKitchen.inhabitants.add("Jamie Oliver")
    decoratedKitchen.inhabitants.forEach {
            print(it + " ")
    }
    println()

    decoratedKitchen.furniture.apply {
        addAll(listOf("Stove", "Fridge"))
        forEach {
            print(it + " ")
        }
    }
    println()

    val apartment = Flat(1000).apply {
        rooms.add(kitchen)
        rooms.add(Room("Bedroom").apply{inhabitants.add("Gordon Ramsay")})
    }
    apartment.inhabitants.forEach {
        print(it + " ")
    }
    println()

    apartment.clean()
    listOf(DustCleaning(), WetCleaning())
        .forEach {
            apartment.cleaningStrategy = it
            apartment.clean()
        }
}
