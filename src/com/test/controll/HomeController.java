package com.test.controll;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
    @RequestMapping(value="/home")
    public ModelAndView goHome(){
        Map<String ,String> map = new HashMap<String, String>();
        map.put("userName", "MVC4.1!");
        return new ModelAndView("/view",map);
    }
}