/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.CustomerModel;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gertrude
 */
public class CustomerDao {

    public CustomerDao() {
    }
    public void registerCustomer(CustomerModel Customer){
        try{
            Session ss  = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(Customer);
            tr.commit();
            ss.close();
        }catch(Exception exe){
            exe.printStackTrace();
        }
    }
     public void updateCustomer(CustomerModel Customer){
        try{
            Session ss  = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(Customer);
            tr.commit();
            ss.close();
        }catch(Exception exe){
            exe.printStackTrace();
        }
    }
      public void deleteCustomer(CustomerModel Customer){
        try{
            Session ss  = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(Customer);
            tr.commit();
            ss.close();
        }catch(Exception exe){
            exe.printStackTrace();
        }
    }
   
   
    public List<CustomerModel> allCustomer(){
       try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            //create transaction
            Transaction tr = ss.beginTransaction();
            List<CustomerModel> CustomerList = ss.createQuery("select Customer from CustomerModel Customer").list();
            ss.close();
            return CustomerList;
       }catch(Exception exe){
           exe.printStackTrace();
       }
        return null;
    }
    public CustomerModel searchId(CustomerModel Customer){
       try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            CustomerModel Customers = (CustomerModel) ss.get(CustomerModel.class, Customer.getCustomerId());
            return Customers;
       }catch(Exception exe){
           exe.printStackTrace();
       }
        return null;
    }
    public CustomerModel selectedBus(CustomerModel Customer){
       try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            CustomerModel Custo = (CustomerModel) ss.get(CustomerModel.class, Customer.getBuse());
            return Custo;
       }catch(Exception exe){
           exe.printStackTrace();
       }
        return null;
    }
    

    
}
