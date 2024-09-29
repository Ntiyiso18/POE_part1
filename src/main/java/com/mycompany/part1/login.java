/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class login {
      //importing object scanner
    Scanner poe = new Scanner(System.in);
    //declarations
    String username;
    String password;
    String Name;
    String lastname;
    
    public void prompts(){
        System.out.println("Enter your Name:");
        Name = poe.next();
        
        System.out.println("Enter your lastname:");
        lastname = poe.next();
        
        System.out.println("Enter your username:");
        username = poe.next();
        
        System.out.println("Enter your password:");
        password = poe.next();
    }
    
    
    public boolean checkUserName(){
       
        System.out.println(username.contains("_"));
        System.out.println(username.length() <= 5);
    
        return true;
    }
     public boolean checkPasswordComplexity(){
        
        String regex =  "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])$";
        System.out.println(password.length()>= 8);
                       
                       
                       
        return true;
    
}
      public void registerUser(){
        
        if(checkUserName()== true && checkPasswordComplexity() == true ){
            System.out.println("The username is correctly formatted and password meets complexity requirements");
        }
        else{
            System.out.println("The username is incorrectly formatted and password does not meet complexity requirements");
        }
        
}
}
