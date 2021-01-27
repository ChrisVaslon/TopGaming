/*
Auteur: Djouela
Date de création: 25/01/2021
 */
package entites;

import java.util.Date;


public class Message {
    private int id;
    private String contenu;
    private Date dateMessage;
    private Membre membre;

    public Message() {

    }
    public Message(int id, String contenu, Date dateMessage) {
        this.id = id;
        this.contenu = contenu;
        this.dateMessage = dateMessage;
    }

    public Message(int id, String contenu, Date dateMessage, Membre membre) {
        this.id = id;
        this.contenu = contenu;
        this.dateMessage = dateMessage;
        this.membre = membre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public Date getDateMessage() {
        return dateMessage;
    }

    public void setDateMessage(Date dateMessage) {
        this.dateMessage = dateMessage;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    @Override
    public String toString() {
        return "Message{" + "id=" + id + ", contenu=" + contenu + ", dateMessage=" + dateMessage + ", membre=" + membre + '}';
    }

      
    
}
