package smecherasii.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import smecherasii.dto.UserDto;
import smecherasii.exception.NotFoundException;
import smecherasii.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public ModelAndView getLoginPage() {
        ModelAndView modelAndView = new ModelAndView("login.html");
        modelAndView.addObject("userDto", new UserDto());

        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute UserDto userDto) {
        try {
            ModelAndView modelAndView = new ModelAndView("mainPage.html", HttpStatus.OK);
            modelAndView.addObject("userDto", userService.login(userDto.getUsername(), userDto.getPassword()));

            return modelAndView;
        } catch (NotFoundException ex) {
            ModelAndView modelAndView = new ModelAndView("login.html", HttpStatus.NOT_FOUND);
            modelAndView.addObject("error", ex.getMessage());
            modelAndView.addObject("userDto", userDto);

            return modelAndView;
        }

    }

}
