package pl.kupczyk.fizzbuzz

class FizzBuzz {

    public fun noob(n: Int){
        val begin = System.nanoTime()
        for (i in 1..n){
            if (i % 15 == 0) {
                print("FizzBuzz ")
                continue
            }
            else if (i % 3 == 0) print("Fizz ")
            else if (i % 5 == 0) print("Buzz ")
            else print(i.toString() + " ")
        }
        val end = System.nanoTime()

        println("\nElapsed time: ${end - begin}ms")
    }

    public fun recursive(n: Int): String{
        var s = ""
        if (n == 0) return s
        if (n % 3 == 0) s += "Fizz "
        if (n % 5 == 0) s += "Buzz "
        if (s == "") s = n.toString() + " "

        return recursive(n - 1) + s
    }
}