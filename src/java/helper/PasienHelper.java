/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import pojos.Pasien;
import util.NewHibernateUtil;

public class PasienHelper {

    public PasienHelper() {

    }

    public List<Pasien> getAllPasien(){
        Session session = NewHibernateUtil.getSessionFactory().openSession();
        String query = "from Pasien";
        Query q = session.createQuery(query);
        List<Pasien> list = q.list();
        return list;
    }

}

