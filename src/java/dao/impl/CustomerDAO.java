/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.ConnectToDatabase;
import dao.ICustomerDAO;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Address;
import model.Customer;

/**
 *
 * @author admin
 */
public class CustomerDAO implements ICustomerDAO{

    @Override
    public List<Customer> findAll() {
        List<Customer> results = new ArrayList<>();
         try{
            ResultSet rs = new ConnectToDatabase().selectData("select * from Account");
            while (rs.next()){
                Customer customer = new Customer();
                customer.setId(rs.getInt("id"));
                customer.setPoints(rs.getInt("points"));
                customer.setAge(rs.getInt("age"));
                customer.setGender(rs.getString("gender"));
                customer.setName(rs.getString("name"));
                customer.getAdrress().setId(rs.getInt("adress_id"));
                customer.getContact().setId(rs.getInt("contact_id"));
                
                results.add(customer);
                
            }
            return results;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    
}
