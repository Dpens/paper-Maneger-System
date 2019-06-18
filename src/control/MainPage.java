package control;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainPage {
    @RequestMapping(value = "/mainPage")
    public String mainPage(Model model){
        model.addAttribute("usrname","admin"); // 指定Model的值
        model.addAttribute("password","password"); // 指定Model的值
        return "mainPage";
    }

}

