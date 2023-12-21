/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.DriverModel;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Gertrude
 */
public interface DriverIntrf extends Remote{
      String registerDrivers(DriverModel drives) throws RemoteException;
    String updateDrivers (DriverModel drives) throws RemoteException;
    String deleteDrivers (DriverModel drives) throws RemoteException;
    List<DriverModel> allDrivers() throws RemoteException;
    DriverModel searchId(DriverModel drives) throws RemoteException;
}
