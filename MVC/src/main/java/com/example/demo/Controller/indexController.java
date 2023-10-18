package com.example.demo.Controller;


import com.example.demo.Model.Person;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {


    @GetMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value="/action", method= RequestMethod.POST)
    public String something(@ModelAttribute Person person , Model model) {

        model.addAttribute("firstName",person.getFirstName());
        model.addAttribute("lastName",person.getLastName());
        model.addAttribute("country",person.getCountry());

        return "welcome";
    }


}
