/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import com.google.gson.Gson;
import helper.UserHelper;

public class TestUser1 {
    public static void main(String[] args) {
        helper.UserHelper u = new UserHelper();
        System.out.println(new Gson().toJson(u.login("puspa@usd.ac.id", "123456789")));
    }
}
