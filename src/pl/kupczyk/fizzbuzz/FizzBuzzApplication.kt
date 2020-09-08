package pl.kupczyk.fizzbuzz

import kotlin.random.Random

fun main() {
    val fizzBuzz = FizzBuzz()
    var int: Int = Random.nextInt(1, 60)

    println("-------------NOOB------------")
    fizzBuzz.noob(int)

    println("\n\n----------RECURSIVE----------")
    val begin = System.nanoTime()
    print(fizzBuzz.recursive(int))
    val end = System.nanoTime()
    println("\nElapsed time: ${end - begin}ms")

}
