/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Model.Route;
import java.util.List;
import org.hibernate.*;

/**
 *
 * @author Gertrude
 */
public class RouteDao {
    public void registerRoute(Route route){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.save(route);
            tr.commit();
            ss.close();
        }catch(Exception exe){
            exe.printStackTrace();
        }
    }
    
    public void updateRoute(Route route){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.update(route);
            tr.commit();
            ss.close();
        }catch(Exception exe){
            exe.printStackTrace();
        }
    }
    
    public void deleteRoute(Route route){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            ss.delete(route);
            tr.commit();
            ss.close();
        }catch(Exception exe){
            exe.printStackTrace();
        }
    }
    public List<Route> allRoutes(){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Transaction tr = ss.beginTransaction();
            List<Route> routeList = ss.createQuery("select route from Route route").list();
            ss.close();
            return routeList;
        }catch(Exception exe){
            exe.printStackTrace();
            
        }
        return null;
    }
    public Route searchId(Route route){
        try{
            Session ss = HibernateUtil.getSessionFactory().openSession();
            Route routes = (Route) ss.get(Route.class, route.getId());
            return routes;
        }catch(Exception exe){
            exe.printStackTrace();
        }
        return null;
    }
    
    
}
