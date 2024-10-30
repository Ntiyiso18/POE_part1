/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1;
import javax.swing.*;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    
    
   private String taskName;
   private int taskNumber;
   private String taskDescription;
   private String developerDetails;
   private int taskDuration;
  // private int hours;
   
  
   
    public String gettaskName(){
        return taskName;
    }
    
    public int gettaskNumber(){
        return taskNumber;
    }
    
    public String gettaskDescription(){
        return taskDescription;
    }
   
    public String getdeveloperDetails(){
        return developerDetails;
    }
    
    public int gettaskDuration(){
        return taskDuration;
    }
    
    
    
    public boolean checkTaskDescription(String taskDescription){
        
       // return taskDescription.length()<=50;
       if(taskDescription.length()<=50){
            
            JOptionPane.showMessageDialog(null, "The task description is successfuly captured.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "The task description is too long. It should be not more than 50 characters long.");
            return false;
        }
//           System.out.println("Task successfully captured");
//        return true;
//        
//    }else{
//           System.out.println("Please enter task description of less than 50 characters");
//           return false;
       }
  
    
    public String createTaskID(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration ){
     
        return (taskName.substring(0,2) + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length()-3)).toUpperCase();
     
    
       // Get first 2 letters of task name
//        String taskNamePart = taskName.length() >= 2 ? taskName.substring(0, 2) : taskName;
//        
//        // Get last 3 letters of developer details
//        String developerPart = developerDetails.length() >= 3 ? developerDetails.substring(developerDetails.length() - 3) : developerDetails;
//        
//        // Combine to form task ID
//        return " TaskID: " + taskNamePart.toUpperCase()+ ":" + taskNumber + ":" + developerPart.toUpperCase();
       //use case statemnets not if statements
       //display full details after entering the task details individually
       //suggestion use for loop for task id e.g for(task id){ sout the method
       //for test
       //method should take parameters
      //
    }
    public String printTaskDetails(String taskName, int taskNumber,String taskDescription, String developerDetails, int taskDuration, String taskStatus){
        return "TaskName: " + taskName + "\n" + "TaskNumber: "+ taskNumber + "\n" + "TaskDescription: " + taskDescription + "\n" + " DeveloperDetails: " + developerDetails + "\n" + "TaskDuration: " + taskDuration + "\n" + "taskStatus:" + taskStatus;
    }
//     public int returnHours( int taskDuration){
//       return taskDuration;
//    }
    public int returnTotalHours(int[] totalHrs,String taskName, int taskNumber,String taskDescription, String developerDetails, int taskDuration) {
    int totalHours = 0;
    for (int duration : totalHrs) {
        totalHours += duration;  
    }
     this.taskName =  taskName;
this.taskNumber = taskNumber;
this. developerDetails =  developerDetails;
this.taskDuration = taskDuration;
this.taskDescription = taskDescription;
    return totalHours;
}
     }

