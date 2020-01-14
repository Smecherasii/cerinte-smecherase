package smecherasii.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import smecherasii.dto.InternshipDto;
import smecherasii.dto.UserDto;
import smecherasii.service.CompanyService;
import smecherasii.service.InternshipService;

import javax.validation.Valid;
import java.util.UUID;

@Controller
public class InternshipController {
    @Autowired
    private InternshipService internshipService;

    @Autowired
    private CompanyService companyService;

    @PostMapping(value = "/internships")
    public ModelAndView addInternship(@ModelAttribute @Valid InternshipDto internshipDto){
        internshipService.addInternship(internshipDto);
        ModelAndView modelAndView = new ModelAndView("mainPage.html");
        UserDto userDto = companyService.findBy(internshipDto.getCompanyId());
        modelAndView.addObject("userDto", userDto);

        return modelAndView;
    }

    @GetMapping(value = "/addInternship/{companyId}")
    public ModelAndView addInternshipPage(@PathVariable UUID companyId){
        ModelAndView modelAndView = new ModelAndView("addInternship.html");
        InternshipDto internshipDto = new InternshipDto();
        modelAndView.addObject("internshipDto", internshipDto);
        modelAndView.addObject("companyId", companyId);

        return modelAndView;
    }
}
