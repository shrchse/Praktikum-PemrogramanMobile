class Teknologi{
    var device = ""
    var seri = ""
    var status = false
    var activity = ""
    var battery = 0

    fun checkStatus(){
        println("Device $seri is $activity")
    }
    fun checkInfo(){
        println("Device Information")
        println("Device : $device")
        println("Series : $seri")
        if (status) {
            println("Status : Online")
        }
        println("Battery : $battery%")
    }
}

fun main() {
    val obj = Teknologi()
    val obj2 = Teknologi()
    obj.device = "Laptop" //readline() for input
    obj.seri = "Lenovo Ideapad 3"
    obj.activity = "Running some Apps"
    obj.status = true
    obj.battery = 90 //Integer.valueOf(readline())

    obj2.device = "Smartphone"
    obj2.seri = "Huawei Nova 3i"
    obj2.activity = "Running Games"
    obj2.status = true
    obj2.battery = 65

    obj.checkInfo()
    obj.checkStatus()
    println()
    obj2.checkInfo()
    obj2.checkStatus()
}