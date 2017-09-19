package common

fun fibonacci(n: Int) {
    val time = Time()
    val start = time.currentTime()
    var a = 1
    var fib = a
    var b = 1
    var i = 1
    while (i <= n) {
        fib = a + b
        a = b
        b = fib
        i++
    }
    val end = time.currentTime()
    println("$n fibonacci number = $fib")
    println("Job takes ${(start - end)} ms!")
}

