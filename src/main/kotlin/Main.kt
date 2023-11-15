fun main(args: Array<String>) {
    println("Введите строку")
    var str = readln()

    val chars = str.toCharArray()
    chars.sort()
    str = String(chars)

    println(str)

    var ch = str[0]
    var value_ = 1
    for (i in 1 until str.length)
    {
        if (ch == str[i])
        {
            value_++
        }
        else
        {
            print(ch)
            println(" - " + value_)

            ch = str[i]
            value_ = 1
        }
    }
    print(ch)
    println(" - " + value_)
}