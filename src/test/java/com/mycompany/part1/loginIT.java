/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.part1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class loginIT {
    
    public loginIT() {
    }
    
    

    /**
     * Test of getUsername method, of class login.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        login instance = null;
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class login.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        login instance = null;
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class login.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        login instance = null;
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class login.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        login instance = null;
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkUserName method, of class login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String username = "kyle!!!!!!!";
        login instance = new login(username,"Ch&&sec@ke99!");
        boolean expResult = false;
        boolean result = instance.checkUserName(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
     
    }

    /**
     * Test of checkPasswordComplexity method, of class login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Password";
        login instance = new login("kyl_1",password);
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of registerUser method, of class login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "kyle!!!!!!!";
        String password = "Password";
        login instance = new login(username,password);
        String expResult = "The username is not correctly formatted please ensure your username contains an under and is no more than 5 characters in length or password is not correctly formatted please ensure that the password contains atleast 8 characters, a capital, a number and a special character";
        String result = instance.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of loginUser method, of class login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String Username = "kyle!!!!!!!";
        String Password = "password";
        login instance = new login("kyl_1","Ch&&sec@ke99!");
        boolean expResult = false;
        boolean result = instance.loginUser(Username, Password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of returnLoginStatus method, of class login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String Username = "kyle!!!!!!!";
        String Password = "password";
        String Name = "Ntiyiso";
        String lastname = "Ndhlovu";
        login instance =  new login("kyl_1","Ch&&sec@ke99!");
        String expResult = "username or password incorrect, please try again";
        String result = instance.returnLoginStatus(Username, Password, Name, lastname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of display method, of class login.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        String Name = "";
        String lastname = "";
        String Username = "";
        String Password = "";
        login instance = null;
        instance.display(Name, lastname, Username, Password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
