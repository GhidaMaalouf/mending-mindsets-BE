package ad.mendingmindsets.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;

@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class HelloController {

    @RequestMapping({"/welcome"})
    public String hello(){
        return "Welcome to mending mindsets' backend";
    }
}
