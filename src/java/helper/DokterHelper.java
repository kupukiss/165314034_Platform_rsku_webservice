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
import pojos.Dokter;

public class DokterHelper {

    public DokterHelper() {

    }

    public List<Dokter> getDokter() {
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "From Dokter";
        Query q = session.createQuery(query);
        List<Dokter> list = q.list();
        return list;
    }
}
