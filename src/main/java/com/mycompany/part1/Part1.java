/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part1;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Part1 {

    public static void main(String[] args) {
         //importing object scanner
    Scanner poe = new Scanner(System.in);
    Scanner poe1 = new Scanner(System.in);
        System.out.println();
        login ll = new login();
        //declarations
        String Name;
        String lastname;
        
        //prompts
        System.out.println("Enter your Name:");
        Name = poe1.next();
        
        System.out.println("Enter your lastname:");
        lastname = poe1.next();
        
         // ll.checkUserName()
          System.out.println("Enter your username:");
          String username = poe1.next();
          ll.setUsername(username);
          
          
        // ll.checkPasswordComplexity();
         System.out.println("Enter your password:");
        String password = poe1.next();
        ll.setPassword(password);
        
        
         ll.registerUser(username , password);
         
        
         
         
         if( ll.checkUserName(username) && ll.checkPasswordComplexity(password)){
             System.out.println("enter username");
         String Username = poe.next();
         System.out.println("enter password");
         String Password = poe.next();
             
             System.out.println(ll.returnLoginStatus(Username , Password , Name , lastname));
         ll.display(Name , lastname , Username ,Password);
    }
         
          
         //System.out.println(ll.loginUser(Username , Password));
         // boolean isLoginSuccessful = ll.loginUser(username, password);
         
         
       
       // System.out.println(ll.returnLoginStatus(Username , Password , Name , lastname));
//        if(isLoginSuccessful){
//            System.out.println("welcome " + Name + " " + lastname + " " + "it is great to see you again");
//        }
//        else{
//            
//        }
//        if(ll.loginUser(Username, Password)){
//            //System.out.println("welcome " + Name + " " + lastname + " " + "it is great to see you again");
//             return "welcome " + Name + " " + lastname + " " + "it is great to see you again";
//            
//        }
//        else{
//            System.out.println("username or password incorrect, please try again");
//        }
         
    }
}
