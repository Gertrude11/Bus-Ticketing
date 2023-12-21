/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Model.CustomerModel;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 *
 * @author Gertrude
 */
public interface CustomerIntrf extends Remote{
    String registerCustomer(CustomerModel Customers) throws RemoteException;
    String updateCustomer(CustomerModel Customers) throws RemoteException;
    String deleteCustomer(CustomerModel Customers) throws RemoteException;
    List <CustomerModel> allCustomer() throws RemoteException;
    CustomerModel selectedBus(CustomerModel customers) throws RemoteException;
    CustomerModel searchId(CustomerModel customers) throws RemoteException;
    
}
