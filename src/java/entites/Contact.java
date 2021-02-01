
package entites;



/**
 Auteur: Djouela
 Date de création: 28/01/2021
 */
public class Contact {
    private int id;
    private String nom;
    private String prenom;
    private String mail;
    private String message;
   

    public Contact() {
    }

    public Contact(int id, String nom, String prenom, String mail, String message) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Contact{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", message=" + message + '}';
    }


}