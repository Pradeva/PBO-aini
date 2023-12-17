/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;

/**
 *
 * @author USER
 */
public class Mavenproject1 {
    private static Mavenproject1 instance;
    public int sumOfData = 1;
    Map<Integer, User> userMap = new HashMap<>();
    
    public static void main(String[] args) {
        Login frame = new Login();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
        
        System.out.println("Hello World!");
    }
    
    private Mavenproject1(){
    }
    
    public static Mavenproject1 getInstance() {
        if (instance == null) {
            instance = new Mavenproject1();
        }
        return instance;
    }
    
    public void registrasi(String nama, String username, String password){
        User user = new User(nama, username, password);
        userMap.put(sumOfData, user);
        sumOfData++;
        System.out.println("usermap = " + userMap);
    }
    
    boolean login(String username, String password){
        for (int i = 1; i < sumOfData; i++){
            User retrievedUser = userMap.get(i);
            if (retrievedUser.getUsername().equals(username) && retrievedUser.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
}

class User {
    private String nama;
    private String username;
    private String password;
    
    public User(String nama, String username, String password){
        this.nama = nama;
        this.username = username;
        this.password = password;      
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setUsername(String username){
        this.username = username;
    }
    
    public String getUsername(){
        return username;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getPassword(){
        return password;
    }
}
