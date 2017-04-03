package hello.controller;

import hello.service.emailService.APIService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by patrik on 2017.03.20..
 */
@Controller
public class EmailController {

    private final APIService apiService;

    public EmailController(){
        this.apiService = APIService.getInstance();
    }

    @RequestMapping("/sendEmail")
    public String sendEmailMessage(@RequestParam(value = "email") String email,
                                   @RequestParam(value = "phoneNumber") String phoneNumber,
                                   @RequestParam(value = "content") String content){


        String subject = "Új igény az oldalról az alábbi telefonszámmal: " + phoneNumber;


        apiService.sendEmail(email, subject, content);

        return "redirect:/contact";
    }


}
