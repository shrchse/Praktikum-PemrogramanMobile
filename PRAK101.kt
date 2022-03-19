fun main() {
    print("Waktu Sekarang : ")
    val time = readLine()
    print("Nama Anda : ")
    val nama = readLine()
    print("Umur Anda : " )
    val umur = readLine()
    print("Suhu tubuh : ")
    val suhu = ((Math.random())*(37 - 35)+ 35)
    val rounded = String.format("%.2f", suhu)
    println(rounded)

    println("Selamat " + time + ", " + nama + ".\n" +
            "Umur anda " + umur + " Tahun.\n" +
            "Suhu tubuh anda " + rounded + " derajat Celcius.")
}
