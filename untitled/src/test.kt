fun main() {
    // 1번 문제
    // 사용자의 이메일 주소 email이 문자열로 주어집니다.
    // 이메일에서 @를 기준으로 앞부분(아이디)의 글자 수와
    // 뒷부분(도메인)을 대문자로 바꾼 문자열을 공백으로 구분하여
    // 출력하는 프로그램을 작성하세요.

    var email = "kotlin123@gmail.com"
    var email2 = "abc@naver.com"

    val email_list = email.split("@").toMutableList()
    val email2_list = email2.split("@").toMutableList()

    email_list[1] = email_list[1].uppercase()
    email2_list[1] = email2_list[1].uppercase()

    println("${email_list[0].length} ${email_list[1]}")
    println("${email2_list[0].length} ${email2_list[1]}")

    // 2번 문제
    // 학생의 시험 점수들이 담긴 정수 리스트 scores가 주어집니다.
    // 이 학생의 평균 점수를 구하고, 리스트 안에서 60점 미만인
    // 과락 과목의 개수를 구하는 프로그램을 작성하세요.

    // 출력은 평균점수 / 과락과목수 형태로 출력합니다.
    // 사용할 내장 함수 힌트: .average(), .count { 조건 }
    val scores = listOf(80, 90, 50, 70)
    val scores2 = listOf(55, 40, 60)

    println("${scores.average()} / ${scores.count{ it < 60 }}")
    println("${scores2.average()} / ${scores2.count{ it < 60 }}")

    // 3번 문제
    // 숫자가 문자열 형태로 저장된 리스트 strNumbers가 주어집니다.
    // 이 리스트에 있는 문자열들을 모두 숫자로 변환한 뒤, 내림차순으로
    // 정렬된 새로운 리스트를 출력하는 프로그램을 작성하세요.

    val strNumbers = listOf("10", "4", "25", "1")
    val strNumbers2 = listOf("5", "50", "500")
    var numbers = mutableListOf<Int>()
    var numbers2 = mutableListOf<Int>()
    for (i in strNumbers) {
        numbers.add(i.toInt())
    }
    for (i in strNumbers2) {
        numbers2.add(i.toInt())
    }

    println(numbers.sortedDescending())
    println(numbers2.sortedDescending())
}