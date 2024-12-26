package id.ac.ui.cs.jarkom.websitec03.controller;

import id.ac.ui.cs.jarkom.websitec03.model.Company;
import id.ac.ui.cs.jarkom.websitec03.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/")
public class Controller {
    @Autowired
    private Repository repo;
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

    @GetMapping("/getsql")
    public ModelAndView getsqldata(){

        return getModelAndView(homeHTML);
    }

    @GetMapping("/savesql")
    @ResponseStatus(HttpStatus.CREATED)
    public Company addCompany()
    {
        Company c = new Company("Budi", 100, "lala",1000000, false);
        return repo.save(c);
    }

}
