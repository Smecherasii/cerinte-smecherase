package smecherasii.controller;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import smecherasii.dto.CompanyDto;
import smecherasii.dto.StudentDto;
import smecherasii.dto.UserDto;
import smecherasii.exception.InvalidDataException;
import smecherasii.exception.NotFoundException;
import smecherasii.service.CompanyService;
import smecherasii.service.StudentService;
import smecherasii.service.UserService;

@Controller
public class UserController {

    private final UserService userService;

    private final StudentService studentService;

    private final CompanyService companyService;

    public UserController(UserService userService, StudentService studentService,
                          CompanyService companyService) {
        this.userService = userService;
        this.studentService = studentService;
        this.companyService = companyService;
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

    @GetMapping("/register/step1")
    public ModelAndView registerStep1() {
        return new ModelAndView("register.html");
    }

    @GetMapping("register/step2")
    public ModelAndView getRegisterFragment(@RequestParam String registerType) {
        if (registerType.equals("student")) {
            ModelAndView modelAndView = new ModelAndView("registerStudent.html");
            modelAndView.addObject("studentDto", new StudentDto());

            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("registerCompany.html");
            modelAndView.addObject("companyDto", new CompanyDto());

            return modelAndView;
        }
    }

    @PostMapping("/register/student")
    public ModelAndView registerStudent(@ModelAttribute @Valid StudentDto studentDto) {
        try {
            studentService.save(studentDto);

            return getLoginPage();
        } catch (InvalidDataException exception) {
            ModelAndView modelAndView = new ModelAndView("registerStudent.html");
            modelAndView.addObject("studentDto", studentDto);
            modelAndView.addObject("error", exception.getMessage());

            return modelAndView;
        }
    }

    @PostMapping("/register/company")
    public ModelAndView registerCompany(@ModelAttribute @Valid CompanyDto companyDto) {
        try {
            companyService.save(companyDto);

            return getLoginPage();
        } catch (InvalidDataException exception) {
            ModelAndView modelAndView = new ModelAndView("registerCompany.html");
            modelAndView.addObject("companyDto", companyDto);
            modelAndView.addObject("error", exception.getMessage());

            return modelAndView;
        }
    }

}
