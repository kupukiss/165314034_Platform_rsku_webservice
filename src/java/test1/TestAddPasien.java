/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import helper.PasienHelper;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestAddPasien {

    public static void main(String[] args) {
        try {
            SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
            Date date = format.parse("19920302");
            String noRm = "676869";
            PasienHelper test = new PasienHelper();
            test.addNewPasien(noRm, "Kaneki", "Tokyo", "noRm", date, "laki-laki");
        } catch (Exception ex) {
            Logger.getLogger(TestAddPasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
