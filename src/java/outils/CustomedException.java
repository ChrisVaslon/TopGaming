/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outils;

import java.util.HashMap;


public class CustomedException extends Exception{
    private HashMap<String, String> erreurs;

    public CustomedException() {
        erreurs = new HashMap();
    }
    
     public CustomedException(HashMap<String, String> erreurs) {
        this.erreurs = erreurs;
    }

    public CustomedException(HashMap<String, String> erreurs, String message) {
        super(message);
        this.erreurs = erreurs;
    }

    public HashMap<String, String> getErreurs() {
        return erreurs;
    }

    public void setErreurs(HashMap<String, String> erreurs) {
        this.erreurs = erreurs;
    }
    
    
    
    
}

