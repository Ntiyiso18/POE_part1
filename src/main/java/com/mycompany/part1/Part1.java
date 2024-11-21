/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part1;
import java.util.Scanner;
import java.util.ArrayList;
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
        
        //arrays
         ArrayList<String> developers = new ArrayList<>();
        ArrayList<String> taskNames = new ArrayList<>();
        ArrayList<String> taskIDs = new ArrayList<>();
        ArrayList<Integer> taskDurations = new ArrayList<>();
        ArrayList<String> taskStatuses = new ArrayList<>();

        
       
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
       login ll = new login();
        
        
        //calling register user method
         System.out.println(ll.registerUser(username , password,Name,lastname));
         
         //if statement to stop code if the password and username do not meet requirements
         if (!ll.checkUserName(username) || !ll.checkPasswordComplexity(password)) {
           
            return; 
         }
         System.out.println("=====login=====");
         
             System.out.println("enter username to login");
         String Username = poe.next();
         System.out.println("enter password to login");
         String Password = poe.next();
         
         //calling the reurn login status method
         boolean LOGIN = ll.loginUser(Username, Password);
         System.out.println(ll.returnLoginStatus(LOGIN));
             
         if(LOGIN){
    
 final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        
       
    
        JOptionPane.showMessageDialog(dialog, "Welcome to EasyKanBan");
        
        //Task status options
        String[] optionsToChoose = {"To Do", "Doing", "Done"};
    while(ll.loginUser(username, password)){
        //calling the task classs
         Task tt = new Task();
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
       int[] totalHrs = new int[taskNumber1];
      int totalHours;

        for (int i = 0;  i < taskNumber1; i++) {
            
             tasknumber[i] = new Task();
            // prompt for task name
             taskName = JOptionPane.showInputDialog( "Enter Task name");
      do {
                taskDescription = JOptionPane.showInputDialog("Enter Task description");
                boolean isValid = tt.checkTaskDescription(taskDescription);
                 } while (taskDescription.length() > 50);

        
            
             
             //prompt for developer details
             developerDetails = JOptionPane.showInputDialog( " Enter Task developer details");
             
             //prompt for task duration
            taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Enter Task duration  in hours:"));
            
            totalHrs[i] = taskDuration;
           JOptionPane.showMessageDialog(dialog, tt.createTaskID(taskName, i, developerDetails));
String taskStatus = (String) JOptionPane.showInputDialog(dialog, "Choose task status","Select task status",JOptionPane.QUESTION_MESSAGE,null,optionsToChoose, optionsToChoose[2]);
 String taskID = tt.createTaskID(taskName, taskNumber, developerDetails);
                            taskIDs.add(taskID);
                            developers.add(developerDetails);
                            taskNames.add(taskName);
                            taskDurations.add(taskDuration);
                            taskStatuses.add(taskStatus);

tasknumber [i] = new Task ();
  
JOptionPane.showMessageDialog(dialog, tt.printTaskDetails(taskName, i, taskDescription, developerDetails, taskDuration, taskStatus)+ "\n" + tt.createTaskID(taskName, i, developerDetails));
}

totalHours =tt.returnTotalHours(totalHrs, taskName, taskNumber, taskDescription, developerDetails, taskDuration);



JOptionPane.showMessageDialog(dialog, "total hours is: " + totalHours);
   
       break;    
    
       
    case "2":

                       //options to perform an activity
                String[] reportOptions = { "Display 'Done' Tasks","Search for a task", "Delete a task","Show full list of tasks","Search for tasks assign to a developer","Display task with the longest duration" ,"Back to main menu", };
                String Choices = (String) JOptionPane.showInputDialog(dialog, "What would you like to do next?", "Select an option", JOptionPane.QUESTION_MESSAGE, null, reportOptions, reportOptions[0]);

   if ("Search for a task".equals(Choices)) {
                String searchName = JOptionPane.showInputDialog(dialog, "Enter the task name to search for:");
                searchTaskByName(searchName, taskNames, developers, taskStatuses);
    }
    else if("Search for tasks assign to a developer".equals(Choices)){
                String searchDeveloper = JOptionPane.showInputDialog(dialog, "Enter Developer Name to search:");
                searchTaskByDeveloper( searchDeveloper, taskNames, developers,  taskStatuses);
    }
   else if ("Delete a task".equals(Choices)) {
                String deleteName = JOptionPane.showInputDialog(dialog, "Enter the task name to delete:");
                deleteTaskByName(deleteName, taskNames, developers,taskDurations, taskIDs, taskStatuses);
                        }else if ("Show full list of tasks".equals(Choices)){
                            allTasks(taskNames,  developers,taskIDs,taskDurations, taskStatuses) ;
                        }else if ("Display 'Done' Tasks".equals(Choices)) {
                            displayDoneTasks(taskNames, developers,taskDurations,  taskStatuses);
                        }else if ("Display task with the longest duration".equals(Choices)){
                            displayLongestTask(developers,taskDurations);
                        }

    break;
    
    case "3":
        JOptionPane.showMessageDialog(dialog, "Quitting...");
        System.exit(0);
    break;
                 
}
         dialog.dispose();
    }       
    }
    }
   // Method to search task by name
    public static void searchTaskByName(String searchName, ArrayList<String> taskNames, ArrayList<String> developers, ArrayList<String> taskStatuses) {
       
        boolean found = false; 
        for (int i = 0; i < taskNames.size(); i++) {
            if (taskNames.get(i).equalsIgnoreCase(searchName)) {
                JOptionPane.showMessageDialog(null, "Task Name: " + taskNames.get(i) + "\nDeveloper: " + developers.get(i) + "\nStatus: " + taskStatuses.get(i));
                found = true; 
                break; 
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Task entered not found.");
        }
    }
    //Method to display all tasks with the done status
    public static void displayDoneTasks(ArrayList<String> taskNames, ArrayList<String> developers,ArrayList<Integer> taskDurations, ArrayList<String> taskStatuses) {
        StringBuilder doneTasks = new StringBuilder("Status: 'Done':\n");
        boolean found = false;  
        for (int i = 0; i < taskStatuses.size(); i++) {
            if ("done".equalsIgnoreCase(taskStatuses.get(i))) {
                doneTasks.append("Developer: ").append(developers.get(i))
                              .append("\nTask Name: ").append(taskNames.get(i))
                              .append("\nDuration: ").append(taskDurations.get(i)).append(" hours\n\n");
                found = true;
            }
        }
        if (found) {
            JOptionPane.showMessageDialog(null, doneTasks.toString());
        } else {
            JOptionPane.showMessageDialog(null, "No tasks with status 'Done' found.");
        }
    }
 
    // Method to delete task by name
   public static void deleteTaskByName(String taskName, ArrayList<String> taskNames,  ArrayList<String> developers, ArrayList<Integer> taskDurations, ArrayList<String> taskIDs, ArrayList<String> taskStatuses) {
    int indexToDelete = taskNames.indexOf(taskName); // Find the index of the task name
    if (indexToDelete != -1) { // Ensure the task exists
        taskNames.remove(indexToDelete);
        developers.remove(indexToDelete);
        taskDurations.remove(indexToDelete);
        taskStatuses.remove(indexToDelete);
        if (!taskIDs.isEmpty()) {
            taskIDs.remove(indexToDelete); // Only if taskIDs is used
        }
       // System.out.println("Task '" + taskName + "' successfully deleted."); // Confirmation message
         JOptionPane.showMessageDialog(null, "Task " + taskName + "\n" + " successfully deleted.");
    } else {
      //  System.out.println("Task not found: " + taskName);
         JOptionPane.showMessageDialog(null, "Task not found:" + taskName);
    }
}
    //method to display task with the most hours
    public static void displayLongestTask(ArrayList<String> developers, ArrayList<Integer> taskDurations) {
          if (taskDurations.isEmpty()) {
        JOptionPane.showMessageDialog(null, "No tasks available.");
        return;
    }
             int maxDurationIndex = 0; 
             int maxDuration = taskDurations.get(0);  

    for (int i = 1; i < taskDurations.size(); i++) {
        if (taskDurations.get(i) > maxDuration) {
            maxDuration = taskDurations.get(i);
            maxDurationIndex = i;
        }
    }

    String developerWithLongestTask = developers.get(maxDurationIndex);
    JOptionPane.showMessageDialog(null, "Developer: " + developerWithLongestTask + 
                                          "\nTask Duration: " + maxDuration + " hours");
    }
    
    //method to display all tasks recorded
    public static void allTasks(ArrayList<String> taskNames, ArrayList<String> developers, ArrayList<String> taskIDs, ArrayList<Integer> taskDurations ,ArrayList<String> taskStatuses) {
        StringBuilder all = new StringBuilder("Full Task Report:\n");
                        for (int i = 0; i < taskNames.size(); i++) {
                            all.append("Task Name: ").append(taskNames.get(i))
                                  .append("\nDeveloper: ").append(developers.get(i))
                                  .append("\nTask ID: ").append(taskIDs.get(i))
                                  .append("\nDuration: ").append(taskDurations.get(i))
                                  .append("\nStatus: ").append(taskStatuses.get(i)).append("\n\n");
                        }
                        JOptionPane.showMessageDialog(null, all.toString());
    }
    
    //Method to search for tasks using the developers name
    public static void searchTaskByDeveloper(String searchDeveloper,ArrayList<String> taskNames,ArrayList<String> developers, ArrayList<String> taskStatuses) {
          boolean found = false; 
        for (int i = 0; i < developers.size(); i++) {
            if (developers.get(i).equalsIgnoreCase(searchDeveloper)) {
                JOptionPane.showMessageDialog(null, "Task Name: " + taskNames.get(i) + "\nStatus: " + taskStatuses.get(i));
                found = true;  
                break;  
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "Task not found.");
        }
    }
   
    }
    
