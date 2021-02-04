
package traitements;

import dao.ContactDao;
import java.sql.SQLException;
import java.util.HashMap;
import outils.CustomedException;


/**
Auteur: Djouela
* Date de création: 28/01/2021
 */
public class GestionContact {
    private ContactDao contactDao;

    public GestionContact() {
        contactDao = new ContactDao();
    }

    public GestionContact(ContactDao contactDao) {
        this.contactDao = contactDao;
    }
    
    public void ajouterContact(String nom, String prenom, String mail, String message) throws SQLException, CustomedException{
        HashMap<String, String> erreurs = new HashMap<>();

        String email = mail;
        String regex = "[a-zA-Z0-9.!#$%&'+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)";
        
       
        if(!mail.matches(regex)){
            erreurs.put("errMail", "Adresse mail non conforme"); 
        } 
        
        if (!erreurs.isEmpty()) {
            CustomedException ex = new CustomedException(erreurs, "Echec envoi message");
            throw ex;
        } else {
            contactDao.insererContact(nom, prenom, mail, message);
        
          
       }
        
    }
}
    
   
    

