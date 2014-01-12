package com.eighthinfo.drca.controller;

import com.eighthinfo.drca.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by dam on 14-1-12.
 */
@Controller
@RequestMapping(value = "/")
public class MainController {

    @RequestMapping(value = "/")
    public String welcome(){
        return  "login";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String userLogin(User userModel){

        String forward = null;
        if(userModel == null){
            forward = "redirect:/";
        }else{
            forward = "forward:/index";
        }
        return  forward;
    }
}
