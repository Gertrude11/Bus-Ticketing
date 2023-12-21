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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Gertrude
 */
@Entity
@Table(name = "customers")
public class CustomerModel implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer CustomerId;
    @Column(name = "first_name")
    private String first_name;
    @Column(name = "last_name")
    private String last_name;
    @Column(name = "address")
    private String address;
    @Column(name = "contact")
    private String contact;
    
    @ManyToOne
    @JoinColumn(name="bus_id_fk")
    private BusModel buse;
    @Column(name = "seat_no")
    private Integer seat_no;
    @Column(name = "payment_method")
    private String payment_method ;

    public CustomerModel() {
    }

    public CustomerModel(Integer CustomerId) {
        this.CustomerId = CustomerId;
    }

    public CustomerModel(Integer CustomerId, String first_name, String last_name, String address, String contact, BusModel buse, Integer seat_no, String payment_method) {
        this.CustomerId = CustomerId;
        this.first_name = first_name;
        this.last_name = last_name;
        this.address = address;
        this.contact = contact;
        this.buse = buse;
        this.seat_no = seat_no;
        this.payment_method = payment_method;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   

    public Integer getCustomerId() {
        return CustomerId;
    }

    public void setCustomerId(Integer CustomerId) {
        this.CustomerId = CustomerId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public BusModel getBuse() {
        return buse;
    }

    public void setBuse(BusModel buse) {
        this.buse = buse;
    }

    public Integer getSeat_no() {
        return seat_no;
    }

    public void setSeat_no(Integer seat_no) {
        this.seat_no = seat_no;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

   
}
