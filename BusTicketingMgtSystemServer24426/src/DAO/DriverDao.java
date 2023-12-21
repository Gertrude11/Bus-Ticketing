/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.DriverModel;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gertrude
 */
public class DriverDao {
    
    public void registerDrivers(DriverModel drive){
        try{
            Session ss  = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(drive);
            tr.commit();
            ss.close();
        }catch(Exception exe){
            exe.printStackTrace();
        }
    }
     public void updateDrivers(DriverModel drive){
        try{
            Session ss  = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(drive);
            tr.commit();
            ss.close();
        }catch(Exception exe){
            exe.printStackTrace();
        }
    }
      public void deleteDrivers(DriverModel drive){
        try{
            Session ss  = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(drive);
            tr.commit();
            ss.close();
        }catch(Exception exe){
            exe.printStackTrace();
        }
    }
   
   
    public List<DriverModel> alldrivers(){
       try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            //create transaction
            Transaction tr = ss.beginTransaction();
            List<DriverModel> driverList = ss.createQuery("select drive from DriverModel drive").list();
            ss.close();
            return driverList;
       }catch(Exception exe){
           exe.printStackTrace();
       }
        return null;
    }
    public DriverModel searchId(DriverModel drive){
       try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            DriverModel drives = (DriverModel) ss.get(DriverModel.class, drive.getDriverId());
            return drives;
       }catch(Exception exe){
           exe.printStackTrace();
       }
        return null;
    }
     public List< DriverModel> selectedBus(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            //create transaction
            Transaction tr = ss.beginTransaction();
            List<DriverModel> carList = ss.createQuery("select bus from BusModel bus ").list();
            ss.close();
            return carList;
       }catch(Exception exe){
           exe.printStackTrace();
       }
        return null;
    }
    
}
