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
        
       /* 
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
        
        //calling the task class
       // Task tt = new Task();
        
       // System.out.println(tt.createTaskID(taskName, taskNumber, taskDescription, developerDetails, taskNumber));
    
        String message = JOptionPane.showInputDialog("Welcome to EasyKanBan");
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
        String taskCountInput = JOptionPane.showInputDialog("How many tasks?");
        int taskCount = Integer.parseInt(taskCountInput); 

        // Array to store task names and descriptions of the tasks entered
        String[] newArray = new String[taskCount];

        for (int i = 0; i < newArray.length; i++) {
            // task number and ask for task name
             taskName = JOptionPane.showInputDialog("Task Number " + (i + 1) + ": Enter Task name");

            // task description
             taskDescription = JOptionPane.showInputDialog("Task Number " + (i + 1) + ": Enter Task description");

            // Store both task name and description with task number
            newArray[i] = "Task " + (i + 1) + ": " + taskName + " - " + taskDescription;
        }

         
        String allTasks = "";
        for (int i = 0; i < newArray.length; i++) {
             // Display task number, name, and description
            allTasks += newArray[i] + "\n"; 
        }
        JOptionPane.showMessageDialog(null, allTasks);
        break;

    case "2":
        JOptionPane.showInputDialog(null, "Coming Soon!");
        break;

    case "3":
        JOptionPane.showInputDialog(null, "Quitting...");
        System.exit(0);
        break;
}

}
}
}
