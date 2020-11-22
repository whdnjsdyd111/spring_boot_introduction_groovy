package chapter02.ch2_1_그루비로_애플리케이션_개발

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class App {

    @RequestMapping("/")
    def home() {
        "Hello!"
    }
}