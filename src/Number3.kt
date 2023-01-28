fun main()
{
    var q = readLine()!!.toByte()
    when(q)
    {
        in 0..2 -> println("Newborn")
        in 3..14 -> println("Baby")
        in 15..18 -> println("Teenager")
        in 19..50 -> println("Adult")
        in 51..100 -> println("Pensioner")
    }
}