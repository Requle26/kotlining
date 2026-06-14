package Inheritance

// 1. open을 붙여서 '부모 클래스 틀'의 문을 열어줍니다.
open class Post(var title: String, var author: String) {
    // 자식이 바꿔 쓸 수 있도록 함수 앞에도 open을 붙여줍니다.
    open fun showContent() {
        println("📌 [일반 글] 제목: $title | 작성자: $author")
    }
}

// 2. 부모(Inheritance.Post)를 상속받은 '자식 클래스 틀'을 만듭니다.
// 제목(title)과 작성자(author)는 값을 받는 즉시 부모 틀로 바로 토스(: Inheritance.Post(title, author))하고,
// 자기 틀만의 고유한 데이터인 foodType을 바로바로 넣어서 추가합니다.
class DeliveryPost(title: String, author: String, var foodType: String) : Post(title, author) {

    // 3. 부모의 기능을 내 입맛대로 완전히 덮어쓰기(override) 합니다!
    override fun showContent() {
        println("🛵 [배달 메이트 구함!] ------------------")
        println("제목: $title (작성자: $author)")
        println("같이 먹을 음식: $foodType")
        println("----------------------------------------")
    }
}

fun main() {
    // 값을 바로바로 넣어서 배달 게시글 상자(객체)를 만듭니다.
    val myPost = DeliveryPost("치킨 파티원 모집", "김성일", "뿌링클")

    // 부모의 기능을 내 방식대로 덮어쓴 함수를 실행합니다!
    myPost.showContent()
}