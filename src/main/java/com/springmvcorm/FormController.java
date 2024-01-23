package com.springmvcorm;

import com.springmvcorm.EmployeeLogin.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
    @Autowired
    LoginRepo repo;
    @RequestMapping("/")
    public String show( ){

        return  "form";
    }
    @RequestMapping("save")
    public String save(@ModelAttribute("l1") Login l){

        repo.save(l);
        return "store";
    }
    @RequestMapping("view")
    public String view(Model m){

        m.addAttribute("result",repo.findAll());
        return "show";
    }


}
