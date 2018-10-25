package guru.springframework.controllers;

import guru.springframework.commands.LoginCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;


@Controller
public class LoginController {

    @RequestMapping("/login")
    public String showSecuredPage(Model model) {

        model.addAttribute("loginCommand", new LoginCommand());

        return "loginform";

    }

    @RequestMapping("logout-success")
    public String loggedOut() {

        return "logout-success";

    }

//    @PostMapping("/doLogin")
//    public String doLogin(@Valid LoginCommand loginCommand, BindingResult bindingResult) {
//
//        if (bindingResult.hasErrors()) {
//            return "loginform";
//        }
//
//        return "redirect:/index";
//
//    }

}
