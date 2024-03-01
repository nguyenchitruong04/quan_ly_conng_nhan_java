/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author nguye
 */
public class database {
    public String linkdb = "jdbc:mysql://127.0.0.1:3306/new_schema";
    public String user= "root";
    public String password= "231204";

    public database() {
        super();
    }

    public database(String linkdb, String user, String password) {
        super();
        this.linkdb = linkdb;
        this.user = user;
        this.password = password;
        
    }

    public String getLinkdb() {
        return linkdb;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

  
    
}
