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
        String choice =JOptionPane.showInputDialog(options);
               switch (choice){
        case "1": JOptionPane.showInputDialog("how many tasks" );
                     String response;
    response =JOptionPane.showInputDialog("Enter Task name");
    taskName = response;
    
   // response = JOptionPane.showInputDialog("Enter Task number");
    taskNumber = Integer.parseInt(response);
    int newArray [] = new int [taskNumber];
    for (int i = 0; i< newArray.length; i++){
        response = JOptionPane.showInputDialog(taskNumbr);
        
    }
    
    response = JOptionPane.showInputDialog("Enter Task description");
    taskDescription = response;

      break;
        case "2":
              JOptionPane.showInputDialog(null, "Coming Soon!");
         break;
          case "3": 
               JOptionPane.showInputDialog(null, "Quiting...");
               System.exit(0);
               break;
}
}
}
}
