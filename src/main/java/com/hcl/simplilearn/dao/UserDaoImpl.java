package com.hcl.simplilearn.dao;

import com.hcl.simplilearn.model.User;
import com.hcl.simplilearn.utility.HibernateUtility;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDaoImpl implements IUserDao {

    @Override
    public boolean register(User user) {
        Transaction transaction = null;
        try(Session session = HibernateUtility.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();
        } catch(Exception e) {
            // If some error occurs after a transaction has begun we will rollback database
            // to last known acceptable state.
            if(transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public boolean login(User user) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean logout(User user) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
