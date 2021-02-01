
package traitements;

import dao.ContactDao;
import java.sql.SQLException;


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
    
    public void ajouterContact(String nom, String prenom, String mail, String message) throws SQLException{
        contactDao.insererContact(nom, prenom, mail, message);
    }
    
    
    
}
