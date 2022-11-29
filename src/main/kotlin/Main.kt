fun main(args: Array<String>) {

    println("Hello, world!")
    printInfoAboutMe("Nika", 30, 89.0)
}

fun printInfoAboutMe(name: String, age: Int, weight: Double): Unit {
    println("Your name is $name. You are $age years old. You weigh $weight kilograms!")
}