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
        login ll = new login();
        //declarations
        String Name;
        String lastname;
        
        //ll.prompts();
        System.out.println("Enter your Name:");
        Name = poe1.next();
        
        System.out.println("Enter your lastname:");
        lastname = poe1.next();
        
         // ll.checkUserName(username);
          System.out.println("Enter your username:");
          String username = poe.next();
          ll.setUsername(username);
          
          
        // ll.checkPasswordComplexity();
         System.out.println("Enter your password:");
        String password = poe.next();
        ll.setPassword(password);
        
        
         ll.registerUser(username , password);
         
        
         System.out.println("enter username");
         String Username = poe.next();
         System.out.println("enter password");
         String Password = poe.next();
         
          ll.loginUser(username , password);
          boolean loginUser = ll.loginUser(Username, Password);
         
         
        ll.returnLoginStatus(username , password , Name , lastname);
        if(ll.loginUser(Username, Password)== true){
            System.out.println("welcome " + Name + " " + lastname + " " + "it is great to see you again");
            
        }
        else{
            System.out.println("username or password incorrect, please try again");
        }
         ll.display(Name , lastname);
    }
}
