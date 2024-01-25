package com.springmvcorm;

import com.springmvcorm.EmployeeLogin.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class FormController {
    @Autowired
    LoginRepo repo;
    @RequestMapping("/")
    public String show(){

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

    @RequestMapping("find")
    public String find(){

        return "findbyid";
    }
    @RequestMapping("result")
    public String result(@RequestParam("id") String Id, Model m) {
        Optional<Login> result = repo.findById(Id);

        if (result.isPresent()) {
            Login login = result.get();
            m.addAttribute("r", login);
        } else {
            m.addAttribute("error", "No user found with ID: " + Id);
        }
        return "result";
    }
    @RequestMapping("delete")
    public String delete(){

        return "delete";
    }
    @RequestMapping("deleted")
    public String deleted(@RequestParam("id") String Id){

       repo.deleteById(Id);
       return "deleted";
    }
}
