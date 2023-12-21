/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.Route;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Gertrude
 */
public interface RouteIntrf extends Remote{
    //method signature
    String registerRoute(Route routes) throws RemoteException;
    String updateRoute(Route routes) throws RemoteException;
    String deleteRoute(Route routes) throws RemoteException;
    List<Route> allRoutes() throws RemoteException;
    
}
