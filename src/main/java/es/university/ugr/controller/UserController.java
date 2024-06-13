package es.university.ugr.controller;

import es.university.ugr.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    // method to handle variable-expression request
    @GetMapping("variable-expression")
    public String variableExpression(Model model){
        User user = new User("Alexander", "tarasov1812@gmail.com", "admin", "male");
        model.addAttribute("user", user);
        return "variable-expression";
    }
}
