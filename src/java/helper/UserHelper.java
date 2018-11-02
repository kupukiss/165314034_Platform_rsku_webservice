/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.Collections;
import util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.User;

public class UserHelper {

    public UserHelper() {

    }

    public List<User> getAllUser() {
        List<User> result = null;
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from User u";
        Query q = session.createQuery(query);
        result = q.list();
        session.close();
        return result;
    }

    public User getUser(String username, String password) {
        List<User> list = this.getAllUser();
        Collections.sort(list);
        User user = new User(username, password);
        int index = Collections.binarySearch(list, user);

        if (index < 0) {
            // user tiada
            return null;
        } else {
            // user ada
            User result = list.get(index);
//            System.out.println("Pencarian = "+result.getEmail()+","+result.getPassword());
            if (password.equals(result.getPassword())) {
                // pass bener
                System.out.println("Password = " +password);
                return user;
            } else {
                // pass salah
                return null;
            }
        }
    }
}

