package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class BilleterController {

@Autowired
private BilletRepository rep;
    @PostMapping("/kjopbillet")
    public void kjop( Billeter billett){
        rep.lagreBillet(billett);

    }


    @GetMapping("/hentbiletter")
    public List<Billeter> Billet(){

        return rep.hentbiletter();

    }

    @GetMapping("/slettAlleBilletter")
    public void slett(){
        rep.slettAlleBilletter();

    }
}


