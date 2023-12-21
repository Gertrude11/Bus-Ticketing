/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services.Implementation;

import DAO.CustomerDao;
import Model.CustomerModel;
import Services.CustomerIntrf;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

/**
 *
 * @author Gertrude
 */
public class CustomerImpl extends UnicastRemoteObject implements CustomerIntrf{

    private CustomerDao dao = new CustomerDao();

    public CustomerImpl() throws RemoteException{
        
        super();
    }
    
    
    @Override
    public String registerCustomer(CustomerModel Customers) throws RemoteException {
        
         try{
            dao.registerCustomer(Customers);
            return "Data Saved";
        }catch(Exception exe){
            exe.printStackTrace();
        }
        return "Data not Saved";
    }

    @Override
    public String updateCustomer(CustomerModel Customers) throws RemoteException {
          try{
            dao.updateCustomer(Customers);
            return "Data Saved";
        }catch(Exception exe){
            exe.printStackTrace();
        }
        return "Data not Saved";
    }

    @Override
    public String deleteCustomer(CustomerModel Customers) throws RemoteException {
          try{
            dao.deleteCustomer(Customers);
            return "Data Saved";
        }catch(Exception exe){
            exe.printStackTrace();
        }
        return "Data not Saved";

    }

    @Override
    public List<CustomerModel> allCustomer() throws RemoteException {
        return dao.allCustomer();
    }

    @Override
    public CustomerModel selectedBus(CustomerModel customers) throws RemoteException {
        return dao.selectedBus(customers);
    }

    @Override
    public CustomerModel searchId(CustomerModel customers) throws RemoteException {
        return dao.searchId(customers);
    }
    
}
