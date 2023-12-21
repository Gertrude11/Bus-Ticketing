/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Implementation;

import DAO.NewManagerDao;
import Model.NewManagerModel;
import Services.NewManagerIntrf;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Gertrude
 */
public class NewManagerImpl extends UnicastRemoteObject implements NewManagerIntrf{

    public NewManagerImpl() throws RemoteException{
        super();
    }

    private NewManagerDao dao = new NewManagerDao();
    @Override
    public String registerNewManager(NewManagerModel mans) throws RemoteException {
         try{
            dao.registerNewManager(mans);
            return "Data Saved";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "Data Not Saved";
    }

    @Override
    public String updateNewManager(NewManagerModel mans) throws RemoteException {
         try{
            dao.updateNewManager(mans);
            return "Data updated";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "Data Not updated";
    }

    @Override
    public String deleteNewManager(NewManagerModel mans) throws RemoteException {
        try{
            dao.deleteNewManager(mans);
            return "Data deleted";
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return "Data Not deleted";
    }

    @Override
    public List<NewManagerModel> allManagers() throws RemoteException {
        return dao.allManagers();
    }

    @Override
    public NewManagerModel loginSearch(NewManagerModel mans) throws RemoteException {
        try{
           
            return dao.logInSearch(mans);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

    @Override
    public NewManagerModel searchId(NewManagerModel mans) throws RemoteException {
        try{
            dao.deleteNewManager(mans);
            return dao.searchId(mans);
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }

  
    
}
