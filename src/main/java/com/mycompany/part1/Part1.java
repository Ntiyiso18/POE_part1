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
       System.out.println("Enter your Name:");
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
             System.out.println("enter username to login");
         String Username = poe.next();
         System.out.println("enter password to login");
         String Password = poe.next();
             
         //calling the reurn login status method
         System.out.println(ll.loginUser(username, password));
             System.out.println(ll.returnLoginStatus(Username , Password , Name , lastname));
             ll.display(Name , lastname , Username ,Password);
    }
    
        
 final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        
       
    
        JOptionPane.showMessageDialog(dialog, "Welcome to EasyKanBan");
        
        //Task status options
        String[] optionsToChoose = {"To Do", "Doing", "Done"};
    while(ll.loginUser(username, password)){
        //calling the task classs
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
        //prompt to ask for the number of tasks 
       int taskNumber1 = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to enter"));
       //Array for auto generating the task number
       Task[] tasknumber = new Task [taskNumber1];
       

        for (int i = 0; i < taskNumber1; i++) {
            // prompt for task name
             taskName = JOptionPane.showInputDialog( "Enter Task name");

            // prompt for task description
             taskDescription = JOptionPane.showInputDialog( " Enter Task description");
             
             //prompt for developer details
             developerDetails = JOptionPane.showInputDialog( " Enter Task developer details");
             
             //prompt for task duration
            taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task duration (In Hrs)")); 
          
           //calling the createTaskID from the task class using joption to return the task ID
          JOptionPane.showMessageDialog( dialog, tt.createTaskID(taskName, i, taskDescription, developerDetails, taskDuration));
          
          //creating a drop down menu for task status
            String taskStatus = (String) JOptionPane.showInputDialog(dialog, "Choose task status", "Select task status",
                    JOptionPane.QUESTION_MESSAGE,null,optionsToChoose, optionsToChoose[2]);
            tasknumber [i] = new Task(taskName, i, taskDescription, developerDetails, taskDuration);
            
          // calling the print task details method together with the createTaskID method to display all the details of the tasks
         JOptionPane.showMessageDialog(dialog,tt.printTaskDetails( taskName, i,taskDescription, developerDetails, taskDuration,taskStatus) +
         "\n" + tt.createTaskID(taskName, i, taskDescription, developerDetails, taskDuration) );
           
        }
     
    
    break;


    case "2":
        JOptionPane.showMessageDialog(dialog, "Coming Soon!");
        break;

    case "3":
        JOptionPane.showMessageDialog(dialog, "Quitting...");
        System.exit(0);
        break;
        
        
}
}
    dialog.dispose();
    
}
}
    

