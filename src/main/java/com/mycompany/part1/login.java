/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1;

import java.util.Scanner;
import java.util.regex.Matcher;

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
     public boolean checkPasswordComplexity(){
         System.out.println("Enter your password:");
        password = poe.next();
        
        
        String regex =  "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=])$";
        System.out.println(password.length()>= 8);
        System.out.println(password.matches(regex));
        
       // return password.length()> 8 && password.matches(regex);
        return false;
                       
     }   
     public String registerUser(){
        
        if(checkUserName()){
            System.out.println("The username is correctly formatted");
        }
        else{
            System.out.println("The username is incorrectly formatted");
        }
        
        if(checkPasswordComplexity()){
            System.out.println("password meets complexity requirements");
        }
        else{
            System.out.println("password does not meet complexity requirements");
        }
        return null;
     }
                       
       
    

     /* public String registerUser(){
        
        if(checkUserName()== true && checkPasswordComplexity() == true ){
            System.out.println("The username is correctly formatted and password meets complexity requirements");
        }
        else{
            System.out.println("The username is incorrectly formatted and password does not meet complexity requirements"); 
        }
        return null;
       
        
}
*/
       public void display(){
        System.out.println("entered username = " + username );
        System.out.println("entered password = " + password);
           System.out.println("entered name = " + Name);
           System.out.println("entered lastname = " + lastname);
}
}
