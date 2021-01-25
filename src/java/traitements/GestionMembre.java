package traitements;

import dao.MembreDao;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;

public class GestionMembre {

    // proprietes
    private MembreDao membreDao;

    // constructeurs

    public GestionMembre() {
       membreDao = new MembreDao();
    }

    public void creerNouveauMembre(String pseudo, String nom, String prenom, Date dateCreationProfil, Date dateNaissance, String mail, String mdp, String rue, String ville, String cp, int tel) throws SQLException {

       
        System.out.println("1");
    membreDao.InsertMembre(pseudo, nom, prenom, dateCreationProfil, dateNaissance, mail, mdp, rue, ville, cp, tel);
    System.out.println("2");

    }
}