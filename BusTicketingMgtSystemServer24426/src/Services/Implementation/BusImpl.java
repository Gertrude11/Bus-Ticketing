/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Implementation;

import DAO.BusDao;
import Model.BusModel;
import Services.BusIntrf;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Gertrude
 */
public class BusImpl extends UnicastRemoteObject implements  BusIntrf{

    public BusImpl() throws RemoteException{
        super();
    }

    Academi
    
    @Override
    public String registerBus(BusModel buss) throws RemoteException {
         try{
            dao.registerBus(buss);
            return "Data Saved";
        }catch(Exception exe){
            exe.printStackTrace();
        }
        return "Data not Saved";
    }

    @Override
    public String updateBus(BusModel buss) throws RemoteException {
         try{
            dao.updateBus(buss);
            return "Data Updated";
        }catch(Exception exe){
            exe.printStackTrace();
        }
        return "Data not Updated";
    }

    @Override
    public String deleterBus(BusModel buss) throws RemoteException {
         try{
            dao.deleteBus(buss);
            return "Data Deleted";
        }catch(Exception exe){
            exe.printStackTrace();
        }
        return "Data not Deleted";
    }

    @Override
    public List<BusModel> allBus() throws RemoteException {
        return dao.allBus();
    }

    @Override
    public BusModel searchId(BusModel buss) throws RemoteException {
        return  dao.searchId(buss);
    }
}
    
