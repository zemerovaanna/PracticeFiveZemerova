fun main()
{
    println("Hello Kotlin")
    println("Введите первое число:")
    var a = readLine()!!.toDouble()
    println("Введите второе число:")
    var b = readLine()!!.toDouble()
    if (a == b) println(Math.pow(a, 3.0))
    else if (a > b)  a++
    else b++
    println("А:"+ a)
    println("В:" + b)
}