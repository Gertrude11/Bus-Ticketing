/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.BusModel;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Gertrude
 */
public interface BusIntrf extends Remote{
    String registerBus (BusModel buss) throws RemoteException;
    String updateBus (BusModel buss) throws RemoteException;
    String deleterBus (BusModel buss) throws RemoteException;
    List<BusModel> allBus() throws RemoteException;
    BusModel searchId(BusModel bus) throws RemoteException;
    
    
}
