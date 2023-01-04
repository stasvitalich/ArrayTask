fun main() {

    val lostArray = arrayOf(10000, 2300, 45000, 65000, 6500, 400)
    val earnArray = arrayOf(15000, 300, 345000, 5000, 165000, 3400)
    val names = arrayOf("Сергей", "Анна", "Слава", "Мазай", "Феоктист", "Илья")
    var resultArray = ArrayList<String>()

    for((index, name) in names.withIndex()){
        println("Имя: $name, результат инвестиции: ${earnArray[index] - lostArray[index]}")
    }

}