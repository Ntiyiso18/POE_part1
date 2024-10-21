/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part1;
import java.util.Scanner;
import javax.swing.*;


/**
 *
 * @author RC_Student_lab
 */
public class Part1 {

    public static void main(String[] args) {
         //importing object scanner
    Scanner poe = new Scanner(System.in);
    Scanner poe1 = new Scanner(System.in);
    Scanner task = new Scanner(System.in);
 
        //declarations
        String Name;
        String lastname;
        String username;
        String password;
        String taskName = "";
        int taskNumber = 0;
        String taskDescription ="";
        String developerDetails = "";
        int taskDuration = 0;
        
       
        //prompts
       /* System.out.println("Enter your Name:");
        Name = poe1.next();
        
        System.out.println("Enter your lastname:");
        lastname = poe1.next();
        
         // ll.checkUserName()
        System.out.println("Enter your username:");
          username = poe1.next();

        // ll.checkPasswordComplexity();
        System.out.println("Enter your password:");
        password = poe1.next();
      
       //calling the login class
       login ll = new login(username,password);
        
        //calling register user method
         System.out.println(ll.registerUser(username , password));
         
        
         
         //if statement to stop code if the password and username do not meet requirements
         if( ll.checkUserName(username) && ll.checkPasswordComplexity(password)){
             System.out.println("enter username");
         String Username = poe.next();
         System.out.println("enter password");
         String Password = poe.next();
             
         //calling the reurn login status method
             System.out.println(ll.returnLoginStatus(Username , Password , Name , lastname));
         ll.display(Name , lastname , Username ,Password);
    }*/
    
         //ll.loginUser(username, password);
         
//        System.out.println("Enter task name");
//        taskName = task.next();
//        
//        System.out.println("Enter task number");
//        taskNumber = task.nextInt();
//        
//        System.out.println("Enter task Description");
//        taskDescription = task.next();
//        
//        System.out.println("Enter developer Details");
//        developerDetails = task.next();
        
       
    
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanBan");
        
        String[] optionsToChoose = {"To Do", "Doing", "Done"};
    while(true){
         Task tt = new Task(taskName, taskNumber,taskDescription, developerDetails, taskDuration);
        String options =  """
                      ======Options=======
                      1.Add tasks
                      2. Show report
                      3. Quit
                     """;
        String choice = JOptionPane.showInputDialog(options);

switch (choice) {
    case "1":
        // ask for amount of tasks 
       int taskNumber1 = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to enter"));
     // taskNumber = JOptionPane.showInputDialog("How many tasks do you want to enter");
      //  int taskNumber = Integer.parseInt(taskNumberInput);
        // Array to store task names and descriptions of the tasks entered
     // int[] newArray = new int [taskNumber1];
       Task[] taskObjects = new Task [taskNumber1];
       

        for (int i = 0; i < taskNumber1; i++) {
           //  int[] newArray1 = new int [i + 1];
//             Task tt = new Task(taskName, taskNumber,taskDescription, developerDetails, taskDuration);
//          JOptionPane.showMessageDialog( null, tt.createTaskID(taskName, taskNumber, taskDescription, developerDetails, taskDuration));
            // task number and ask for task name
             taskName = JOptionPane.showInputDialog( "Enter Task name");

            // task description
             taskDescription = JOptionPane.showInputDialog( " Enter Task description");
             
             developerDetails = JOptionPane.showInputDialog( " Enter Task developer details");
            taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter duration In HRS")); 
           // Task tt = new Task(taskName, taskNumber,taskDescription, developerDetails, taskDuration);
           
          JOptionPane.showMessageDialog( null, tt.createTaskID(taskName, i, taskDescription, developerDetails, taskDuration));
            String taskStatus = (String) JOptionPane.showInputDialog(null, "Choose task status", "Select task status",
                    JOptionPane.QUESTION_MESSAGE,null,optionsToChoose, optionsToChoose[2]);
            taskObjects [i] = new Task(taskName, i, taskDescription, developerDetails, taskDuration);
// JOptionPane.showMessageDialog(null,tt.printTaskDetails( taskName, taskNumber,taskDescription, developerDetails, taskDuration);
 JOptionPane.showMessageDialog(null,tt.printTaskDetails( taskName, i,taskDescription, developerDetails, taskDuration,taskStatus) + "\n" + tt.createTaskID(taskName, taskNumber, taskDescription, developerDetails, taskDuration) );
            // Store both task name and description with task number
           // newArray1[i] = "Task " + (i + 1) + ": " + taskName + " - " + taskDescription;
           
           
        }
        

         
       // String allTasks = "";
      //     for (String newArray1 : newArray) {
                // Display task number, name, and description
      //         allTasks += newArray1 + "\n";
//              
        //    }
       
            
      //  JOptionPane.showMessageDialog(null, allTasks);
          
//             while(true){
//        String option2 = """
//                          ======Options=======
//                         1. To do
//                         2.Doing
//                         3.Done
//                        """;
//         String opt = JOptionPane.showInputDialog(option2);
//    switch (opt){
//        case "1":
//   JOptionPane.showMessageDialog(null, "To do");
//   
//    
//   JOptionPane.showMessageDialog(null,tt.printTaskDetails( taskName, taskNumber,taskDescription, developerDetails, taskDuration) + "\n" + tt.createTaskID(taskName, taskNumber, taskDescription, developerDetails, taskDuration) +  "\n" +  "taskStatus: To Do" );
//    break;
//    
//        case "2":
//        JOptionPane.showMessageDialog(null, "Doing");
//        
//        JOptionPane.showMessageDialog(null,tt.printTaskDetails( taskName, taskNumber,taskDescription, developerDetails, taskDuration) + "\n" + tt.createTaskID(taskName, taskNumber, taskDescription, developerDetails, taskDuration) +  "\n" +  "taskStatus: Doing" );
//        break;
//        
//        case "3":
//        JOptionPane.showMessageDialog(null, "Done");
//        
//        JOptionPane.showMessageDialog(null,tt.printTaskDetails( taskName, taskNumber,taskDescription, developerDetails, taskDuration) + "\n" + tt.createTaskID(taskName, taskNumber, taskDescription, developerDetails, taskDuration) +  "\n" +  "taskStatus: Done" );
//        //   minutes += tt.returnHours
//        break;
//          
//    }
//             }
        
    
          break;


    case "2":
        JOptionPane.showMessageDialog(null, "Coming Soon!");
        break;

    case "3":
        JOptionPane.showMessageDialog(null, "Quitting...");
        System.exit(0);
        break;
}
// fix the 0
// make second task prompt appear after everything
// calculate the overall hrs
// make it go back to prompts after displaying
// make it go back yo main menu after everthing
//
}
}
}
    

