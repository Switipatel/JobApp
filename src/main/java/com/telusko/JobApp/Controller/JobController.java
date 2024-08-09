package com.telusko.JobApp.Controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JobController {
    @RequestMapping({"/","home"})
    public String home(){
        System.out.println("in home");
        return "home";
    }

}
