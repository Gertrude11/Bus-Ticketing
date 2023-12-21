/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.NewManagerModel;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author Gertrude
 */
public class NewManagerDao {
    public void registerNewManager(NewManagerModel man){
       try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            //create transaction
            Transaction tr = ss.beginTransaction();
            //save new manager
            ss.save(man);
            //commit
            tr.commit();
            //close session
            ss.close();
       }catch(Exception exe){
           exe.printStackTrace();
       }
    }
    public void updateNewManager(NewManagerModel man){
       try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            //create transaction
            Transaction tr = ss.beginTransaction();
            //save new manager
            ss.update(man);
            //commit
            tr.commit();
            //close session
            ss.close();
       }catch(Exception exe){
           exe.printStackTrace();
       }
    }
    public void deleteNewManager(NewManagerModel man){
       try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            //create transaction
            Transaction tr = ss.beginTransaction();
            //save new manager
            ss.delete(man);
            //commit
            tr.commit();
            //close session
            ss.close();
       }catch(Exception exe){
           exe.printStackTrace();
       }
    }
    public List<NewManagerModel> allManagers(){
       try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            //create transaction
            Transaction tr = ss.beginTransaction();
            List<NewManagerModel> managerList = ss.createQuery("select man from NewManagerModel man").list();
            ss.close();
            return managerList;
       }catch(Exception exe){
           exe.printStackTrace();
       }
        return null;
    }
    public NewManagerModel searchId(NewManagerModel man){
       try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            NewManagerModel mans = (NewManagerModel) ss.get(NewManagerModel.class, man.getNewManagerId());
            return mans;
       }catch(Exception exe){
           exe.printStackTrace();
       }
        return null;
    }
    
    public NewManagerModel logInSearch(NewManagerModel man){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Query query = ss.createQuery("select man from NewManagerModel man where man.newManagerId= :ManagerId AND man.password= :password");
            query.setParameter("ManagerId",man.getNewManagerId() );
            query.setParameter("password", man.getPassword());
            
            NewManagerModel mans = (NewManagerModel ) query.uniqueResult();
            return mans;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
