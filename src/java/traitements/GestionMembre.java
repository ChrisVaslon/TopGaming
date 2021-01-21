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

    public void creerNouveauMembre(String pseudo, String nom, String prenom, Date dateNaissance, String mail, String mdp, String rue, String ville, String cp, int tel) throws SQLException {

       
    membreDao.InsertClient(pseudo, nom, prenom, dateNaissance, mail, mdp, rue, ville, cp, tel);

    }
}