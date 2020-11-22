package chapter02.ch2_1_그루비로_애플리케이션_개발

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class App2 {

    @RequestMapping("/")
    def home() {
        def header = "<html><body>"
        def footer = "</body></html>"
        def content = "<h1>Hello!</h1><p>this is html content.</p>"

        header + footer + content
    }
}
