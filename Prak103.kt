fun main() {
    print("Input Bilangan : ")
    var x = Integer.valueOf(readLine())
    val y = x
    var z = 5
    for (i in 1..z){
        if (x % 2 == 0 || x % 3 == 0) {
            print(x)
            print(" ")
            x += y
        } else {
            x += y
            z += 1
        }
    }
}