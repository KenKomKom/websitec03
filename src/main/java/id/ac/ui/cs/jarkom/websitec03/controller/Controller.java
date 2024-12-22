package id.ac.ui.cs.jarkom.websitec03.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("")
public class Controller {
    String homeHTML = "home";

    @GetMapping("")
    public ModelAndView createListingPage(){
        return getModelAndView(homeHTML);
    }

    private ModelAndView getModelAndView(String html) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName(html);
        return modelAndView;
    }
}
