package be.syntra;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping(method = RequestMethod.GET)
    public String printHello(Model model) {
        model.addAttribute("title", "Home page");
        model.addAttribute("message", "Enjoy your day");
        model.addAttribute("date", new java.util.Date());
        return "template";
    }
}
