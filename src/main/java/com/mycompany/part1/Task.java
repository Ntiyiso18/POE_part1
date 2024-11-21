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
   String developerDetails;
   int taskDuration;
  
   
  
   
   
    
    
    
    public boolean checkTaskDescription(String taskDescription){
        
       
       if(taskDescription.length()<=50){
            
            JOptionPane.showMessageDialog(null, "The task description is successfuly captured.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "The task description is too long. It should be not more than 50 characters long.");
            return false;
        }

       }
  
    
    public String createTaskID(String taskName, int taskNumber, String developerDetails ){
     
        return (taskName.substring(0,2) + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length()-3)).toUpperCase();

    }
    
    public String printTaskDetails(String taskName, int taskNumber,String taskDescription, String developerDetails, int taskDuration, String taskStatus){
        return "TaskName: " + taskName + "\n" + "TaskNumber: "+ taskNumber + "\n" + "TaskDescription: " + taskDescription + "\n" + " DeveloperDetails: " + developerDetails + "\n" + "TaskDuration: " + taskDuration + "\n" + "taskStatus:" + taskStatus;
    }

     
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

