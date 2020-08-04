package com.example.demo.controller;


import com.example.demo.Service.ProductService;
import com.example.demo.Service.UserServiceImplement;
import com.example.demo.dto.SearchByNameDto;
import com.example.demo.dto.UserDto;
import com.example.demo.model.Coment;
import com.example.demo.repository.ProductRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserServiceImplement userServiceImplement;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home() {
        userRepository.findByUsername("alfer");
        return "home";
    }


    @GetMapping(value = "/login")
    public ModelAndView getLoginForm(ModelAndView view, UserDto userDto) {
        view.addObject("userDto", userDto);
        view.setViewName("login");
        return view;
    }

    @PostMapping(value = "/login")
    public ModelAndView postLogin(ModelAndView view, UserDto userDto) throws Exception {
        userServiceImplement.login(userDto);
        view.setViewName("homeLogin");
        return view;
    }


    @GetMapping(value = "/registration")
    public ModelAndView getRequestForm(ModelAndView view, UserDto userDto) {

        view.addObject("userDto", userDto);
        view.setViewName("registration");
        return view;
    }

    @PostMapping(value = "/registration")
    public ModelAndView postRegistration(ModelAndView view, UserDto userDto) throws Exception {

        userServiceImplement.registration(userDto);
        view.setViewName("login");
        return view;
    }

    @GetMapping(value = "/homeLogin")
    public ModelAndView getRequestForm(ModelAndView view) {

        view.setViewName("homeLogin");
        return view;
    }

    @PostMapping(value = "/homeLogin")
    public ModelAndView postRegistration(ModelAndView view, SearchByNameDto searchByNameDto) throws Exception {
        productService.findByProductName(searchByNameDto);
        view.setViewName("search");
        return view;
    }

    @GetMapping("/search")
    public String search() {
        productRepository.findByName("oil");
        return "search";
    }

}
