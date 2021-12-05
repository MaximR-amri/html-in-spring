package be.syntra;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/task")
public class TaskController {

    @RequestMapping(method = RequestMethod.GET)
    public String printTask(Model model) {
        model.addAttribute("title", "DO YOUR TASK");
        model.addAttribute("message", "CLEAN");
        model.addAttribute("date", new java.util.Date());
        return "template";
    }
}
