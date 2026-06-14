// 부모 클래스: 주 생성자로 volume(볼륨) 값을 바로바로 채워 넣을 수 있게 만듭니다.
open class Speaker(val volume: Int) {
    // 부모는 기본 소리만 출력하도록 open 해둡니다.
    open fun makeSound() {
        println("🔊 소리가 출력됩니다. (현재 볼륨: $volume)")
    }
}

// 자식 클래스: 부모 상속받고, 블루투스 전용으로 함수를 완전히 개조(override)합니다!
class BluetoothSpeaker(volume: Int) : Speaker(volume) {
    override fun makeSound() {
        println("📱 블루투스 연결됨! 🔊 음악이 흘러나옵니다. (현재 볼륨: $volume)")
    }
}

fun main() {
    // 성일이 방에 있는 블루투스 스피커 상자 생성 (볼륨 50으로 바로바로 대입!)
    val mySpeaker = BluetoothSpeaker(50)

    // 개조된 블루투스 스피커 기능 실행!
    mySpeaker.makeSound()
    Speaker(30).makeSound()
}