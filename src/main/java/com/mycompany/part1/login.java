/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author RC_Student_lab
 */
public class login {
      //importing object scanner
    Scanner poe = new Scanner(System.in);
    //Matcher pt = pt.matcher(regex);
    
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
        
        
        
        
    }
    
    
    public boolean checkUserName(){
        System.out.println("Enter your username:");
        username = poe.next();
       
        System.out.println(username.contains("_"));
        System.out.println(username.length() <= 5);
        if(username.contains("_") && username.length() <= 5){
           // return true;
        }
        return true;
    
       
    }
     public  boolean checkPasswordComplexity(){
         System.out.println("Enter your password:");
        password = poe.next();
        
        //Regex to validate password
        String regex =  "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=]).{8,}$";
        //Compiling regex
        Pattern p = Pattern.compile(regex);
        //if password is empty return false
        if( password == null){
            return false;
        }
        //outputs for password and length
      System.out.println(password.length()>= 8);
      System.out.println(password.matches(regex));
       
      //to match password with the given parameters
       Matcher m = p.matcher(password);
    
          return m.matches();
                       
     }  
 
      public String registerUser(){
        
        if(checkUserName()== true && checkPasswordComplexity() == true ){
            System.out.println("The username is correctly formatted and password meets complexity requirements");
        }
        else{
            System.out.println("The username is incorrectly formatted and password does not meet complexity requirements"); 
        }
        return null;
       
        
}

       public void display(){
        System.out.println("entered username = " + username );
        System.out.println("entered password = " + password);
           System.out.println("entered name = " + Name);
           System.out.println("entered lastname = " + lastname);
}
}
