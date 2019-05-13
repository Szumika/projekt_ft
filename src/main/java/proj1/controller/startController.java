package proj1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


import proj1.model.Cennik;
import proj1.model.Nagrody;
import proj1.model.Pojazd;
import proj1.model.Przystanek;
import proj1.repository.CennikRepository;
import proj1.repository.NagrodyRepository;
import proj1.repository.PojazdRepository;
import proj1.repository.PrzystanekRepository;

import java.util.List;

@Controller
public class startController {
    @Autowired
private PojazdRepository pojazdrep;
    @Autowired
private CennikRepository cennikrep;
    @Autowired
private PrzystanekRepository przystanekrep;
    @Autowired
private NagrodyRepository nagrodyrep;

    @GetMapping("/")
    public String start(){
        return ("index");
    }

    @GetMapping("/pojazd")
    public String cars(){return  ("pojazd");}

    @GetMapping("/cennik")
    public String cennik(){return ("cennik"); }

    @GetMapping("/przystanek")
    public String przystanek(){return  ("przystanek");}

    @GetMapping("/nagrody")
    public String nag(){return  ("nagrody");}

    @ModelAttribute("nagrody")
    public List<Nagrody> nagrody() {return  this.nagrodyrep.findAll();}

    @ModelAttribute("przystanek")
    public List<Przystanek> przy() {return this.przystanekrep.findAll();}

    @ModelAttribute("pojazd")
    public List<Pojazd> solutions(){ return this.pojazdrep.findAll(); }

    @ModelAttribute("cennik")
    public  List<Cennik> ceny() {return this.cennikrep.findAll(); }
}
