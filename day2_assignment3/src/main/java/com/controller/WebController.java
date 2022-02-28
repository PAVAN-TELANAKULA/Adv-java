package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("this is home controller");
        return "home";
    }

    @RequestMapping("/about")
    public String about(Model model){

        model.addAttribute("name","Pavan Telanakula");
        model.addAttribute("id",01);

        List<String> list= new ArrayList<>();
        list.add("Pavan");
        list.add("Venkata");
        list.add("Telanakula");

        model.addAttribute("f",list);

        return "about";
    }

    @RequestMapping("/service")
    public ModelAndView service(){

        ModelAndView m= new ModelAndView();
        m.addObject("name","24*7 support");
        m.addObject("service","Genuine Service");

        m.setViewName("service");

        return m;
    }
}
