package entites;

import java.util.Date;

/*
auteur : thulaksan
date de creation : 19/01/2021
 */
public class Command {
    private int id;
    private Date date;
    
    Membre membre;
    Adresse addresse;

    public Command() {
    }

    public Command(int id, Date date, Membre membre, Adresse addresse) {
        this.id = id;
        this.date = date;
        this.membre = membre;
        this.addresse = addresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Membre getMembre() {
        return membre;
    }

    public void setMembre(Membre membre) {
        this.membre = membre;
    }

    public Adresse getAddresse() {
        return addresse;
    }

    public void setAddresse(Adresse addresse) {
        this.addresse = addresse;
    }

    @Override
    public String toString() {
        return "Command{" + "id=" + id + ", date=" + date + ", membre=" + membre + ", addresse=" + addresse + '}';
    }
    
    
}
