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
    
    public boolean checkUserName(){
        System.out.println("ENTER USERNAME:");
        username = poe.next();
        System.out.println(username.contains("_"));
        System.out.println(username.length() <= 5);
        
        
        return true;
    }
    
}
