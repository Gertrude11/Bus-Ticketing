/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Implementation;

import DAO.DriverDao;
import Model.DriverModel;
import Services.DriverIntrf;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Gertrude
 */
public class DriverImpl extends UnicastRemoteObject implements DriverIntrf{

    public DriverImpl()throws RemoteException{
        super();
    }
    private DriverDao dao = new DriverDao();

    @Override
    public String registerDrivers(DriverModel drives) throws RemoteException {
        try{
            dao.registerDrivers(drives);
            return "Data Saved";
        }catch(Exception exe){
            exe.printStackTrace();
        }
        return "Data not Saved";
    }

    @Override
    public String updateDrivers(DriverModel drives) throws RemoteException {
        try{
            dao.updateDrivers(drives);
            return "Data Updated";
        }catch(Exception exe){
            exe.printStackTrace();
        }
        return "Data not Updated";
    }

    @Override
    public String deleteDrivers(DriverModel drives) throws RemoteException {
        try{
            dao.deleteDrivers(drives);
            return "Data Deleted";
        }catch(Exception exe){
            exe.printStackTrace();
        }
        return "Data not Deleted";
    }

    @Override
    public List<DriverModel> allDrivers() throws RemoteException {
        return dao.alldrivers();
    }

   

    @Override
    public DriverModel searchId(DriverModel drives) throws RemoteException {
        return dao.searchId(drives);
    }


   
   

  
    
}
