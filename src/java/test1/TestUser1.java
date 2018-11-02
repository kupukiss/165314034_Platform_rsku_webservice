/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import helper.UserHelper;
import pojos.User;

public class TestUser1 {
    public static void main(String[] args) {
        UserHelper helper = new UserHelper();
        User cari = helper.getUser("puspa@usd.ac.id");
        String pass = cari.getPassword();
        System.out.print("Password : "+pass);
    }
}
