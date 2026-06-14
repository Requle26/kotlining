package Inheritance

open class Food(val foodName: String) {
    open fun share() {
        println("🎁 $foodName 을(를) 방 친구들과 나누어 먹습니다!")
    }
}

class DeliveryFood(foodName: String, val deliveryFree: Int) : Food(foodName) {
    override fun share() {
        println("배달 주문 완료! [$foodName]을(를) 친구들과 나눕니다. (배달비: ${deliveryFree}원 뿜엔빵!)")
    }
}

fun main() {
    DeliveryFood("치킨", 3000).share()

    Food("바나나").share()
}