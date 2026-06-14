package Constructor

class Refrigerator(var name: String, var foodCount: Int) {
    constructor(name: String) : this(name, 0 ) {
        println("[알림] $name 냉장고가 텅 빈 상태(0개)로 배달되었습니다.")
    }
    fun showStatus() {
        println("-> [$name] 냉장고 안의 음식 개수: ${foodCount}개")
    }
}
fun main() {
    println("--- 1. 주 생성자로 만들기 ---")
    val myFridge = Refrigerator("김성일", 5)
    myFridge.showStatus()

    println("\n---2. 부 생성자로 만들기 ---")
    val roomMateFridge = Refrigerator("룸메이트")
    roomMateFridge.showStatus()
}