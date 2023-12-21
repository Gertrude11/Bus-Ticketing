/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;

/**
 *
 * @author Gertrude
 */
public class NewManagerModel implements Serializable{
    private static final long serialVersionUID = 1L;
    private String newManagerId;
    private String fullNames;
    private String phone_number;
    private String username;
    private String password;
    
    //no args contructor

    public NewManagerModel() {
    }

    public NewManagerModel(String newManagerId, String fullNames, String phone_number, String username, String password) {
        this.newManagerId = newManagerId;
        this.fullNames = fullNames;
        this.phone_number = phone_number;
        this.username = username;
        this.password = password;
    }

    

    public String getNewManagerId() {
        return newManagerId;
    }

    public void setNewManagerId(String newManagerId) {
        this.newManagerId = newManagerId;
    }

    public String getFullNames() {
        return fullNames;
    }

    public void setFullNames(String fullNames) {
        this.fullNames = fullNames;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    
    
    
    
}
