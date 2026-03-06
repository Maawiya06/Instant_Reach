package com.InstanceReach.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class pageController {

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    // about
    @RequestMapping("/about")
    public String About(Model m){
        return "about";
    }
    // services
    @RequestMapping("/services")
    public String Services(Model m){
        return "services";
    }
}
