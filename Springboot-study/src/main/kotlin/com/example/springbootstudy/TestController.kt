package com.example.springbootstudy

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test")
    fun hello(): String {
        return "코틀린 스프링 부트 서버 연동 성공!"
    }
}