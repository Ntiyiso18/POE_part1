/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    public Task(String taskName, int taskNumber,String taskDescription, String developerDetails, int taskDuration){
        this. taskName =  taskName;
this.taskNumber = taskNumber;
this. developerDetails =  developerDetails;
this.taskDuration = taskDuration;
this.taskDescription = taskDescription;
    }
    
   private String taskName;
   private int taskNumber;
   private String taskDescription;
   private String developerDetails;
   private int taskDuration;
   
  
   
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
        
        return taskDescription.length()>=50;
  
    }
    public String createTaskID(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration ){
     
        return ("TaskID " + taskName.charAt(0) + taskName.charAt(1) + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length()-3)).toUpperCase();
     
    
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
    public String printTaskDetails(String taskName, int taskNumber,String taskDescription, String developerDetails, int taskDuration){
        return "TaskName: " + taskName + "\n" + "TaskNumber: "+ taskNumber + "\n" + "TaskDescription: " + taskDescription + "\n" + " DeveloperDetails: " + developerDetails + "\n" + "TaskDuration: " + taskDuration;
    }
    
}
