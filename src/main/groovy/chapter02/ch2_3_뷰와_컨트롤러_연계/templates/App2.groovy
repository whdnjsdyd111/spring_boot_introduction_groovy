package chapter02.ch2_3_뷰와_컨트롤러_연계.templates

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.servlet.ModelAndView

@Grab("thymeleaf-spring4")

@Controller
class App2 {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    def home(ModelAndView mav) {
        mav.setViewName("home")
        mav.addObject("msg", "Hello! this is sample page.")
        mav
    }

    @RequestMapping(value = "/send", method = RequestMethod.POST)
    @ResponseBody
    def send(@RequestParam("text1") String str, ModelAndView mav) {
        mav.setViewName("home");
        mav.addObject("msg", "Hello, " + str + "!!");
        mav.addObject("value", str);
        mav
    }
}