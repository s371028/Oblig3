package com.example.oblig3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BilletRepository {
    @Autowired
    private JdbcTemplate db;
    public void lagreBillet(Billeter innBillet){
    String sql="INSERT INTO Billeter (valg, antall, fornavn, etternavn, telfoonr, epost)  VALUES(?,?,?,?,?,?)";
    db.update(sql,innBillet.getValg(),innBillet.getAntall(),innBillet.getFornavn(),innBillet.getEtternavn(),innBillet.getTelfoonr(),innBillet.getEpost());

    }

public List<Billeter> hentbiletter(){
        String sql="SELECT*FROM Billeter";
        List<Billeter> alleBilleter=db.query(sql,new BeanPropertyRowMapper(Billeter.class));
        return alleBilleter;
}
public void slettAlleBilletter(){
        String sql="DELETE FROM Billeter";
        db.update(sql);
}

}
