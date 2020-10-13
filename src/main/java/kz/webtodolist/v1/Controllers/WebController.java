package kz.webtodolist.v1.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("title", "Главная страница 111");
        model.addAttribute("", "");
        return "index";
    }

    @GetMapping("/sign-in")
    public String sign_in(Model model) {
        model.addAttribute("", "");
        return "sign-in";
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("", "");
        return "register";
    }

    @GetMapping("/category")
    public String category(Model model) {
        model.addAttribute("", "");
        return "category";
    }

    @GetMapping("/task")
    public String task(Model model) {
        model.addAttribute("", "");
        return "task";
    }

    @GetMapping("/404")
    public String page404(Model model) {
        model.addAttribute("", "");
        return "404";
    }

    @GetMapping("/500")
    public String page500(Model model) {
        model.addAttribute("", "");
        return "500";
    }

}
