/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Implementation;

import DAO.RouteDao;
import Model.Route;
import Services.RouteIntrf;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Gertrude
 */
public class RouteImpl extends UnicastRemoteObject implements RouteIntrf{

    public RouteImpl() throws RemoteException{
        super();
    }
    private RouteDao dao = new RouteDao();

    
    @Override
    public String registerRoute(Route routes) throws RemoteException {
        try{
            dao.registerRoute(routes);
            return "Data Saved";
        }catch(Exception exe){
            exe.printStackTrace();
        }
        return "Data not Saved";
    }

    @Override
    public String updateRoute(Route routes) throws RemoteException {
        try{
            dao.updateRoute(routes);
            return "Data Updated";
        }catch(Exception exe){
            exe.printStackTrace();
            return "Data not Updated";
        }
    }

    @Override
    public String deleteRoute(Route routes) throws RemoteException {
        try{
            dao.deleteRoute(routes);
            return "Data Deleted";
        }catch(Exception exe){
            exe.printStackTrace();
        }
        return "Data not Deleted";

    }

    @Override
    public List<Route> allRoutes() throws RemoteException {
        return dao.allRoutes();
    }
    
}
