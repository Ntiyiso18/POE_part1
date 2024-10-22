/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part1;


import java.util.regex.*;

/**
 *
 * @author RC_Student_lab
 */
public class login {
    public login(String username ,String password){
        this.username = username;
        this.password = password;
    }
  
    //declarations
  private  String username;
  private String password;
    
    //getters and setter
    public String getUsername(){
        return username;
    }
   
    public String getPassword(){
        return password;
    }
    
    
    public boolean checkUserName(String username){
        return username.contains("_") && username.length() <= 5;
 
    }
     public  boolean checkPasswordComplexity(String password){
        
        
        //Regex to validate password
        String regex =  "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[@#$%^&+=]).{8,}$";
        //Compiling regex
        Pattern p = Pattern.compile(regex);
        //if password is empty return false
        if( password == null){
            return false;
        }
        //outputs for password and length
      System.out.println(password.length()>= 8);
      System.out.println(password.matches(regex));
       
      //to match password with the given parameters
       Matcher m = p.matcher(password);
    
          return m.matches();
                       
     }  
 
      public String registerUser(String username, String password){
        
       if(checkUserName(username) && checkPasswordComplexity(password)){
           return "The username and password are successfully captured ";
        }
        else{
          
            return "The username is not correctly formatted please ensure your username contains an under and is no more than 5 characters in length or password is not correctly formatted please ensure that the password contains atleast 8 characters, a capital, a number and a special character";
       
       }
   
    }
   
      public boolean loginUser(String Username , String Password){
          
         
          return this.username.equals(Username) && this.password.equals(Password);
         
        
       
      }
      public String returnLoginStatus(String Username , String Password , String Name , String lastname){
        if(loginUser(Username, Password)){
    
        return  "welcome "+ Name +" "+ lastname+ " " + "it is great to see you again";
        }
        else{
        
        return "username or password incorrect, please try again";
            
        }
      
    }

       public void display(String Name, String lastname , String Username , String Password){
           System.out.println("entered name = " + Name);
           System.out.println("entered lastname = " + lastname);
           System.out.println("entered username = " + Username );
           System.out.println("entered password = " + Password);
           
}
}
