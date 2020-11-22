package chapter02.ch2_3_뷰와_컨트롤러_연계.templates

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.servlet.ModelAndView

@Controller
class App {

    @RequestMapping("/")
    @ResponseBody
    def home(ModelAndView mav) {
        mav.setViewName("home")
        mav.addObject("msg", "Hello! this is sample page.")
        mav
    }
}