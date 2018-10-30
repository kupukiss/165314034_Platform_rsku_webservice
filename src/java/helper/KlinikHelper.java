/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.Klinik;

public class KlinikHelper {

    public KlinikHelper() {

    }

    public List<Klinik> getKlinik() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "From Klinik";
        Query q = session.createQuery(query);
        List<Klinik> list = q.list();
        return list;
    }
}
