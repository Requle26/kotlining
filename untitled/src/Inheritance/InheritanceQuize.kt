package Inheritance// 1단계: 빈칸 채우기 (기초 문법 체크)
// 스마트폰 부모 클래스를 상속받아 아이폰 자식 클래스를 만들려고 합니다.
// 코드가 정상적으로 작동하도록 (A), (B), **(C)**에 들어갈 올바른 키워드를 맞춰보세요!

// (A)을 붙여서 자식에게 상속이 가능하도록 열어줍니다.
open class SmartPhone {
    // 자식이 이 함수를 덮어쓸 수 있도록 허용합니다.
    open fun boot() {
        println("폰이 켜집니다.")
    }
}

// 콜론(:)을 사용해 부모를 상속받고, 부모 함수를 내 입맛대로 재정의합니다.
class IPhone : SmartPhone() {
    override fun boot() {
        println("🍎 애플 로고가 뜨며 아이폰이 켜집니다.")
    }
}

// 🧐 2단계: 에러 찾기 (실수 방지 훈련)
// 다음 코드는 인텔리제이에서 **빨간 줄(컴파일 에러)**이 발생합니다.
// 왜 에러가 나는지 이유를 찾아내고, 어떻게 고쳐야 할지 설명해 보세요!

open class Laptop {
    open fun charge() {
        println("노트북을 충전 중입니다.")
    }
}

class MacBook : Laptop() {
    // 🚨 여기서 에러 발생! 원인이 무엇일까요?
    override fun charge() {
        println("💻 맥북에 맥세이프를 연결해 충전합니다.")
    }
}

// charge 메서드 앞에 상속을 허용하는 open 이 없다

// 🛠️ 3단계: 미니 설계 미션 (실전 아키텍처)
// 성일 님의 기숙사 방에 있는 **'스피커(Speaker)'**를 상속 기능으로 설계해 봅시다!

open class speaker {
    val volume : Int? = null
    open fun makeSound() {
        println("블루투스 연결됨! 음악이 흘러나옵니다")
    }
}