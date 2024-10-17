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
    
   private String taskName;
   private int taskNumber;
   private String taskDescription;
   private String developerDetails;
   private int taskDuration;
   
  
   
    public String gettaskName(){
        return taskName;
    }
    public void settaskName(String taskName){
        this.taskName = taskName;
    }
    public int gettaskNumber(){
        return taskNumber;
    }
    public void settaskNumber(int taskNumber){
        this.taskNumber = taskNumber;
    }
    public String gettaskDescription(){
        return taskDescription;
    }
    public void settaskDescription(String taskDescription){
        this.taskDescription = taskDescription;
    }
    public String getdeveloperDetails(){
        return developerDetails;
    }
    public void setdeveloperDetails(String developerDetails){
        this.developerDetails = developerDetails;
    }
    public int gettaskDuration(){
        return taskDuration;
    }
    public void settaskDuration(int taskDuration){
        this.taskDuration = taskDuration;
    }
    
    
    public boolean checkTaskDescription(String taskDescription){
        
        return taskDescription.length()>=50;
  
    }
    public String createTaskID(String taskName, int taskNumber, String taskDescription, String developerDetails, int taskDuration ){
     // System.out.println(taskName.charAt(1) + taskName.charAt(0));
     //   System.out.println(taskNumber);
      //  System.out.println(developerDetails.charAt(0) + developerDetails.charAt(1) + developerDetails.charAt(2));
        
        return ("TaskID " + taskName.charAt(0) + taskName.charAt(1) + ":" + taskNumber + ":" + developerDetails.substring(developerDetails.length()-3)).toUpperCase();
       
       //use case statemnets not if statements
       //display full details after entering the task details individually
       //suggestion use for loop for task id e.g for(task id){ sout the method
       //for test
       //method should take parameters
      //
    }
    
}
