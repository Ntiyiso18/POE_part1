/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part1;

/**
 *
 * @author RC_Student_lab
 */
public class Part1 {

    public static void main(String[] args) {
        login ll = new login();
        
        ll.prompts();
          ll.checkUserName();
         ll.checkPasswordComplexity();
         ll.registerUser();
         ll.loginUser();
        
         ll.display();
    }
}
