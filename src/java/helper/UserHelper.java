/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import util.NewHibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.User;

public class UserHelper {

//    public UserHelper() {
//
//    }
//
//    public List<User> getAllUser() {
//        List<User> result = null;
//        Session session = NewHibernateUtil.getSessionFactory().openSession();
//        String query = "from User u";
//        Query q = session.createQuery(query);
//        result = q.list();
//        session.close();
//        return result;
//    }
//
//    public User getUser(String username, String password) {
//        List<User> list = this.getAllUser();
//        Collections.sort(list);
//        User user = new User(username, password);
//        int index = Collections.binarySearch(list, user);
//
//        if (index < 0) {
//            return null;
//        } else {
//            User result = list.get(index);
//            if (password.equals(result.getPassword())) {
//                System.out.println("Password = " + password);
//                return user;
//            } else {
//                return null;
//            }
//        }
//    }
    public User login(String email, String password) {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String q = "From User a where a.email=:email AND a.password =:password";

        Query query = session.createQuery(q);
        query.setParameter("email", email);
        query.setParameter("password", password);

        return (User) query.uniqueResult();
    }
}
