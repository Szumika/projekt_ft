package proj1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


import org.springframework.web.bind.annotation.PostMapping;
import proj1.model.*;
import proj1.model.security.User;
import proj1.repository.*;
import proj1.repository.security.UserRepository;

import javax.validation.Valid;
import java.time.LocalDateTime;
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
    @Autowired
    private DataRepository datarep;
    @Autowired
    private UserRepository userrep;
    @Autowired
    private RezerwacjeRepository rezrep;
    @Autowired
    private GrafikRepository grafikrep;

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


    @GetMapping("/rezerwacja")
    public String addBookFormVali(@Valid Rezerwacje rezerwacja, BindingResult result, Model m){
        m.addAttribute("rezerwacja",new Rezerwacje());
        return "rezerwacja";
    }

    @PostMapping("/rezerwacja")
    public String addpostvali(@Valid Rezerwacje rezerwacja, BindingResult result, Authentication auth){
        if(result.hasErrors()){
            return "addFormValid";
        }
        rezerwacja.setCena(1);
        User user = userrep.findByUsername(auth.getName());
        rezerwacja.setUser(user);
        this.rezrep.save(rezerwacja);
        return  "index";
    }

    @GetMapping("/grafik")
    public String grafik(@Valid Grafik gafik, BindingResult result, Model m){
        m.addAttribute("grafik",new Grafik());
        return "grafik";
    }

    @PostMapping("/grafik")
    public String addgra(@Valid Grafik grafik, BindingResult result, Authentication auth){
        if(result.hasErrors()){
            return "grafik";
        }
        User user = userrep.findByUsername(auth.getName());
        grafik.setUser(user);
        this.grafikrep.save(grafik);
        return  "index";
    }


    @ModelAttribute("rezerwacja")
    public List<Rezerwacje> rez(){return this.rezrep.findAll();}

    @ModelAttribute("grafik")
    public List<Grafik> grafik(){return this.grafikrep.findAll();}

    @ModelAttribute("data")
    public List<Data> data(){return this.datarep.findAll();}

    @ModelAttribute("nagrody")
    public List<Nagrody> nagrody() {return  this.nagrodyrep.findAll();}

    @ModelAttribute("przystanek")
    public List<Przystanek> przy() {return this.przystanekrep.findAll();}

    @ModelAttribute("pojazd")
    public List<Pojazd> solutions(){ return this.pojazdrep.findAll(); }

    @ModelAttribute("cennik")
    public  List<Cennik> ceny() {return this.cennikrep.findAll(); }
}
