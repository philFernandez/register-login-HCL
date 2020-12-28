package com.hcl.simplilearn.fake;

import com.hcl.simplilearn.model.User;
import com.hcl.simplilearn.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class FakeUser {
    public static void main(String[] args) {
        Transaction transaction = null;
        try (Session session = HibernateUtility.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            User u1 = new User("fred", "123", "fred@hotmail.com");
            session.save(u1);
            transaction.commit();
        } catch(Exception e) {
            System.out.println("Something is broken");
            if(transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
}
