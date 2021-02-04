package traitements;

import dao.MembreDao;
import entites.Membre;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import outils.CustomedException;

public class GestionMembre {

    // proprietes
    private MembreDao membreDao;

    // constructeurs
    public GestionMembre() {
        membreDao = new MembreDao();
    }
 
    public void creerNouveauMembre(String pseudo, String nom, String prenom, Date dateCreationProfil, Date dateNaissance, String mail, String mdp, String rue, String ville, String cp, String tel) throws SQLException, CustomedException {
 

        HashMap<String, String> erreurs = new HashMap<>();

        int qte = membreDao.verifierExistanceEmail(mail);
        if (qte > 0) {
            erreurs.put("errMail", "Adresse mail déjà utilisé");
        }

        int qtePseudo = membreDao.verifierExistancePseudo(pseudo);
        if (qtePseudo > 0) {
            erreurs.put("errPseudo", "Pseudo déjà utilisé !");
        }

     

  
        String regex = "^(?:(?:\\+|00)33|0)\\s*[1-9](?:[\\s.-]*\\d{2}){4}$";
        boolean ok = tel.matches(regex);
        if (ok == false){
            erreurs.put("errTel", "Le format n'est pas bon !");
        }
        


        if (!erreurs.isEmpty()) {
            CustomedException ex = new CustomedException(erreurs, "Echec de l'inscription");
            throw ex;
        } else {
            membreDao.InsertMembre(pseudo, nom, prenom, dateCreationProfil, dateNaissance, mail, mdp, rue, ville, cp, tel);
        }

    }

    public Membre SeConnecter(String pseudo, String mdp) throws SQLException, CustomedException {
      
        Membre user = null;
        HashMap<String, String> erreurs = new HashMap<>();
        if(pseudo == null || pseudo.trim().isEmpty()){
            erreurs.put("errPseudo", "pseudo obligatoire !");
        } else {
            pseudo = pseudo.trim();
        }
        
        if(mdp == null || mdp.isEmpty()){
            erreurs.put("errPassword", "Mot de passe obligatoire");
        }
        
        if(!erreurs.isEmpty()){
            CustomedException ex = new CustomedException(erreurs, "echec de la connexion");
            throw ex;
        }
        user = membreDao.Connexion(pseudo, mdp);
        if(user == null){
            CustomedException ex02 = new CustomedException(erreurs, "Compte inexistant");
            throw ex02;
        }
        
        return user;
        
    }
    
    public void InsererChaineAleatoire(String Pseudo, String chaineAleatoire) throws SQLException{
        membreDao.CreerChaineAleatoire(Pseudo, chaineAleatoire);
    }
    
   
    public void RecupererMembreAvecChaineAleatoire(String chaineAleatoire) throws SQLException{
        membreDao.CreerMembreAvecChaineAleatoire(chaineAleatoire);
    }
    
    
     public void RecupererMembreByCommentaireId(int commId) throws SQLException{
        membreDao.AfficherMembreByCommentaireId(commId);
    }
}
