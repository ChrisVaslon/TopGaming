/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traitements;

import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.UUID;

/**
 *
 * @author Win 7
 */
public class chaineAleatoire {

    public String generateString() {
        String uuid = UUID.randomUUID().toString();
        return uuid;
    }

}
