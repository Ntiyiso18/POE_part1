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
public class TaskIT {
    
   

    /**
     * Test of gettaskName method, of class Task.
     */
    @Test
    public void testGettaskName() {
        System.out.println("gettaskName");
        Task instance = new Task();
        String expResult = "";
        String result = instance.gettaskName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gettaskNumber method, of class Task.
     */
    @Test
    public void testGettaskNumber() {
        System.out.println("gettaskNumber");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.gettaskNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gettaskDescription method, of class Task.
     */
    @Test
    public void testGettaskDescription() {
        System.out.println("gettaskDescription");
        Task instance = new Task();
        String expResult = "";
        String result = instance.gettaskDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getdeveloperDetails method, of class Task.
     */
    @Test
    public void testGetdeveloperDetails() {
        System.out.println("getdeveloperDetails");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getdeveloperDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gettaskDuration method, of class Task.
     */
    @Test
    public void testGettaskDuration() {
        System.out.println("gettaskDuration");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.gettaskDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String taskDescription = "create add task featurecreate add task featurecreate add task featurecreate add task featureVVVcreate add task featurecreate add task featurecreate add task featurecreate add task featurecreate add task featurecreate add task featurecreate add task featurecreate add task featurecreate add task featurecreate add task featurecreate add task feature";
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.checkTaskDescription(taskDescription);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String taskName = "login feature";
        int taskNumber = 1;
        String taskDescription = "create login to authenticate users";
        String developerDetails = "Robyn Harrison";
        int taskDuration = 8;
        Task instance = new Task();
        String expResult = "LO:1:SON";
        String result = instance.createTaskID(taskName, taskNumber, taskDescription, developerDetails, taskDuration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");
    }

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        String taskName = "";
        int taskNumber = 0;
        String taskDescription = "";
        String developerDetails = "";
        int taskDuration = 0;
        String taskStatus = "";
        Task instance = new Task();
        String expResult = "";
        String result = instance.printTaskDetails(taskName, taskNumber, taskDescription, developerDetails, taskDuration, taskStatus);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnHours");
        int[] totalHrs = new int []{10,11,12,55,1};
        String taskName = "login feature";
        int taskNumber = 5;
        String taskDescription = "create login to authenticate users";
        String developerDetails = "Robyn Harrison";
        int taskDuration = 10+11+12+55+1;
        Task instance = new Task();
        int expResult = 89;
        int result = instance.returnTotalHours(totalHrs, taskName, taskNumber, taskDescription, developerDetails, taskDuration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
}
