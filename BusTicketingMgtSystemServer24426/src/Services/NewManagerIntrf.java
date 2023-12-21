/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.NewManagerModel;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Gertrude
 */
public interface NewManagerIntrf extends Remote{
    
    //method signature
    String registerNewManager (NewManagerModel mans) throws RemoteException;
    String updateNewManager (NewManagerModel mans) throws RemoteException;
    String deleteNewManager (NewManagerModel mans) throws RemoteException;
    List<NewManagerModel> allManagers() throws RemoteException;
    NewManagerModel loginSearch (NewManagerModel mans)  throws RemoteException;
    NewManagerModel searchId (NewManagerModel mans)  throws RemoteException;
}
