/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Services.Implementation.BusImpl;
import Services.Implementation.CustomerImpl;
import Services.Implementation.DriverImpl;
import Services.Implementation.NewManagerImpl;
import Services.Implementation.RouteImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Gertrude
 */
public class ProjectServer {
    public static void main(String[] args) {
        try{
            //set properties
            System.setProperty("java.rmi.server.hostname", "127.0.0.1");
            //create registry
            Registry registry = LocateRegistry.createRegistry(81);
            registry.rebind("NewManager", new NewManagerImpl());
            registry.rebind("Driver", new DriverImpl());
            registry.rebind("Route", new RouteImpl());
            registry.rebind("Bus", new BusImpl());
            registry.rebind("Customer", new CustomerImpl());
            System.out.println("Server is running on port 81");
        }catch(Exception exe){
            exe.printStackTrace();
        }
    }
    
}
