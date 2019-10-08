package com.yunsam.kj.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")   //test
public class HomeController {
    @RequestMapping(value = "/home",method = RequestMethod.GET)
    public String hello(Model model) {
        return "home";
    }

    @RequestMapping(value = "/home1",method = RequestMethod.GET)
    public String hello1(Model model) {
        return "home1";
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String aa() {
        return "index";
    }

    @RequestMapping(value = "/home2",method = RequestMethod.GET)
    public String hello2(Model model) {
        return "home2";
    }

    @RequestMapping(value = "/home3",method = RequestMethod.GET)
    public String hello3(Model model) {
        return "home3";
    }

    @RequestMapping(value = "/home4",method = RequestMethod.GET)
    public String hello4(Model model) {
        return "home4";
    }
    @RequestMapping(value = "/home5",method = RequestMethod.GET)
    public String hello5(Model model) {
        return "home5";
    }
    @RequestMapping(value = "/home6",method = RequestMethod.GET)
    public String hello6(Model model) {
        return "home6";
    }
    @RequestMapping(value = "/home7",method = RequestMethod.GET)
    public String hello7(Model model) {
        return "home7";
    }
    @RequestMapping(value = "/home8",method = RequestMethod.GET)
    public String hello8(Model model) {
        return "home8";
    }
    @RequestMapping(value = "/home9",method = RequestMethod.GET)
    public String hello9(Model model) {
        return "home9";
    }
}