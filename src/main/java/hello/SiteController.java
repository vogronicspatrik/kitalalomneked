package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SiteController {

    @RequestMapping("/")
    public String greeting(){
        return "greeting";
    }

    @RequestMapping("/webDesign")
    public String webDesign(){
        return "webDesign";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "contact";
    }
}