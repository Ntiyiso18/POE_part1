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
    while(true){
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
        taskNumber = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to enter"));

        // Array to store task names and descriptions of the tasks entered
        String[] newArray = new String[taskNumber];
       

        for (int i = 0; i < newArray.length; i++) {
//             Task tt = new Task(taskName, taskNumber,taskDescription, developerDetails, taskDuration);
//          JOptionPane.showMessageDialog( null, tt.createTaskID(taskName, taskNumber, taskDescription, developerDetails, taskDuration));
            // task number and ask for task name
             taskName = JOptionPane.showInputDialog( "Enter Task name");

            // task description
             taskDescription = JOptionPane.showInputDialog( " Enter Task description");
             
             developerDetails = JOptionPane.showInputDialog( " Enter Task developer details");
            taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter duration In HRS")); 
            Task tt = new Task(taskName, taskNumber,taskDescription, developerDetails, taskDuration);
          JOptionPane.showMessageDialog( null, tt.createTaskID(taskName, taskNumber, taskDescription, developerDetails, taskDuration));
             

            // Store both task name and description with task number
            newArray[i] = "Task " + (i) + ": " + taskName + " - " + taskDescription;
           
        }
        

         
//        String allTasks = "";
//            for (String newArray1 : newArray) {
//                // Display task number, name, and description
//                allTasks += newArray1 + "\n";
//              
//            }
       
            
        //JOptionPane.showMessageDialog(null, allTasks);
          
             while(true){
        String option2 = """
                          ======Options=======
                         1. To do
                         2.Doing
                         3.Done
                        """;
         String opt = JOptionPane.showInputDialog(option2);
    switch (opt){
        case "1":
   JOptionPane.showMessageDialog(null, "To do");
    break;
    
        case "2":
        JOptionPane.showMessageDialog(null, "Doing");
        break;
        
        case "3":
        JOptionPane.showMessageDialog(null, "Done");
        break;
          
    }
             }
        
    
          


    case "2":
        JOptionPane.showMessageDialog(null, "Coming Soon!");
        break;

    case "3":
        JOptionPane.showMessageDialog(null, "Quitting...");
        System.exit(0);
        break;
}

}
}
}
    

