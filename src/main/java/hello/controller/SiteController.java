package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SiteController {

    @RequestMapping("/")
    public String greeting(){
        return "index";
    }

    @RequestMapping("/service")
    public String webDesign(){
        return "services";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "contact_alt";
    }

    @RequestMapping("/webnevjegy")
    public String nevjegy(){
        return "webnevjegy";
    }

    @RequestMapping("/about_us")
    public String about(){
        return "team";
    }

    @RequestMapping("/weboldal_ora")
    public String ora(){
        return "weboldal_ora";
    }

    @RequestMapping("/design")
        public String design() {
        return "design";
    }

    @RequestMapping("/webshop")
    public String webshop(){
        return "webshop";
    }

}