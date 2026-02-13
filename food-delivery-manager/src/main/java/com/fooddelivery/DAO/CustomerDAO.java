package com.fooddelivery.DAO;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.fooddelivery.entities.Customer;
import com.fooddelivery.utils.SessionManager;

public class CustomerDAO {
    

    public static void saveCustomer(String name,int id){
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(name);
        
        try(Session session = SessionManager.getSession().openSession(); ){

            Transaction transaction = session.beginTransaction();
    
            session.persist(customer);
    
            transaction.commit();

        }catch(Exception e){
            e.printStackTrace();
        }

    }


    public static Customer getCustomer(int id){

        try(Session session = SessionManager.getSession().openSession();){

            Customer foundCustomer = session.find(Customer.class, id);
            
            return foundCustomer;

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
