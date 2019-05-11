package proj1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


import proj1.model.Pojazd;
import proj1.repository.PojazdRepository;

import java.util.List;

@Controller
public class startController {
    @Autowired
private PojazdRepository pojazdrep;


    @GetMapping("/")
    public String start(){
        return ("index");
    }

    @GetMapping("/pojazd")
    public String cars(){return  ("pojazd");}


    @ModelAttribute("pojazd")
    public List<Pojazd> solutions(){
        return this.pojazdrep.findAll();
    }

}
