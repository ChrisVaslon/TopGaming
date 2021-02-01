package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


/*
 Auteur: Djouela
 Date de création: 28/01/2021
 */
public class ContactDao {

    private MaConnexionBDD mccBDD;

    public ContactDao() {
        mccBDD = new MaConnexionBDD();
    }

    public ContactDao(MaConnexionBDD mccBDD) {
        this.mccBDD = mccBDD;
    }

    public void setMccBDD(MaConnexionBDD mccBDD) {
        this.mccBDD = mccBDD;
    }
    

    public void insererContact(String nom, String prenom, String mail, String message) throws SQLException {

        try (Connection cnn = mccBDD.getConnection();) {
            String sql = "INSERT INTO contact(contact_nom, contact_prenom, contact_mail, contact_message)"
                    + " VALUES(?,?,?,?)";
            PreparedStatement pstm = cnn.prepareStatement(sql);
            pstm.setString(1, nom);
            pstm.setString(2, prenom);
            pstm.setString(3, mail);
            pstm.setString(4, message);

            pstm.executeUpdate();
        }
    }

}
