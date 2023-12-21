/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;



/**
 *
 * @author Gertrude
 */
public class DriverModel implements Serializable {
    private static final long serialVersionUID = 1L;
    
    private String driverId;
    private String FirstName;
    private String LastName;
    private Date DOB;
    private String phone_number;
    private BusModel bus;

    public DriverModel() {
    }

    public DriverModel(String driverId) {
        this.driverId = driverId;
    }

    public DriverModel(String driverId, String FirstName, String LastName, Date DOB, String phone_number, BusModel bus) {
        this.driverId = driverId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.DOB = DOB;
        this.phone_number = phone_number;
        this.bus = bus;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public BusModel getBus() {
        return bus;
    }

    public void setBus(BusModel bus) {
        this.bus = bus;
    }

  

   

}
