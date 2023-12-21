/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.BusModel;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gertrude
 */
public class BusDao {

    public BusDao() {
    }
    public void registerBus(BusModel bus){
        try{
            Session ss  = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(bus);
            tr.commit();
            ss.close();
        }catch(Exception exe){
            exe.printStackTrace();
        }
    }
     public void updateBus(BusModel bus){
        try{
            Session ss  = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(bus);
            tr.commit();
            ss.close();
        }catch(Exception exe){
            exe.printStackTrace();
        }
    }
      public void deleteBus(BusModel bus){
        try{
            Session ss  = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(bus);
            tr.commit();
            ss.close();
        }catch(Exception exe){
            exe.printStackTrace();
        }
    }
   
   
    public List<BusModel> allBus(){
       try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            //create transaction
            Transaction tr = ss.beginTransaction();
            List<BusModel> BusList = ss.createQuery("select bus from BusModel bus").list();
            ss.close();
            return BusList;
       }catch(Exception exe){
           exe.printStackTrace();
       }
        return null;
    }
    public BusModel searchId(BusModel bus){
       try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            BusModel buss = (BusModel) ss.get(BusModel.class, bus.getBusId());
            return buss;
       }catch(Exception exe){
           exe.printStackTrace();
       }
        return null;
    }
    
}
