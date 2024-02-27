package org.example.springbootproject.controller;

import lombok.RequiredArgsConstructor;
import org.example.springbootproject.repository.UserRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class HelloController {
    private final UserRepository userRepository;

    public HelloController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/hello")
    public ModelAndView greeting (ModelAndView modelAndView){
        modelAndView.setViewName("hello");
        modelAndView.getModel().put("allUsers",userRepository.findAll());
        return modelAndView;
    }
}
