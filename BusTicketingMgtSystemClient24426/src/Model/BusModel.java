/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gertrude
 */
public class BusModel implements Serializable{
    private static final long serialVersionUID = 1L;
    private String busId;
    private String model;
    private String route;
    private Double price;
    private Date departure_date;
    private String departure_time;
    private String arrival_time;
    private Integer seats;
    private List<CustomerModel> customer  = new ArrayList<>();
    private List<DriverModel> driven = new ArrayList<>();


    public BusModel() {
    }

    public BusModel(String busId) {
        this.busId = busId;
    }

    public BusModel(String busId, String model, String route, Double price, Date departure_date, String departure_time, String arrival_time, Integer seats) {
        this.busId = busId;
        this.model = model;
        this.route = route;
        this.price = price;
        this.departure_date = departure_date;
        this.departure_time = departure_time;
        this.arrival_time = arrival_time;
        this.seats = seats;
    }

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Date getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(Date departure_date) {
        this.departure_date = departure_date;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }

    public List<CustomerModel> getCustomer() {
        return customer;
    }

    public void setCustomer(List<CustomerModel> customer) {
        this.customer = customer;
    }

    public List<DriverModel> getDriven() {
        return driven;
    }

    public void setDriven(List<DriverModel> driven) {
        this.driven = driven;
    }

}
