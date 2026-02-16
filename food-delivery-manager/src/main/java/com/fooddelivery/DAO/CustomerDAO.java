package com.fooddelivery.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

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

    public static void updateCustomer(int id) {

        Transaction tx = null;

        try (Session session = SessionManager.getSession().openSession()) {

            tx = session.beginTransaction();

            Customer foundCustomer = session.find(Customer.class, id);

            if (foundCustomer != null) {
                foundCustomer.setName("Ramulu");   // update field
                session.merge(foundCustomer);     // optional, Hibernate auto-tracks entity
                System.out.println("Customer updated successfully");
            } else {
                System.out.println("Customer not found with id: " + id);
            }

            tx.commit();

        } catch (Exception e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        }
    }

}
