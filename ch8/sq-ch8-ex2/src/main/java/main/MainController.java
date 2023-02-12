package main;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/home")
    public String home(@RequestParam String color,Model page) {
        page.addAttribute("username", "Daniyal"); // key, value
        page.addAttribute("color", color);
        return "home.html";
    }
}
