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
  
    //declarations
  private  String username;
   private String password;
    
    
    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
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
        
       if(checkUserName(username)==true && checkPasswordComplexity(password)==true){
            System.out.println("The username and password are successfully captured ");
           return "true ";
        }
        else{
            System.out.println("The username is not correctly formatted please ensure your username contains an under and is no more than 5 characters in length or password is not correctly formatted please ensure that the password contains atleast 8 characters, a capital, a number and a special character");
           // return "The username is not correctly formatted please ensure your username contains an under and is no more than 5 characters in length or password is not correctly formatted please ensure that the password contains atleast 8 characters, a capital, a number and a special character";
        return "false";
       }
        
        
       
        
    }
//   
      public boolean loginUser(String username , String password){
          
         
          return this.username.equals(username) && this.password.equals(password);
          
        
       
      }
      public String returnLoginStatus(String Username , String Password , String Name , String lastname){
        if(loginUser(Username, Password)){
            
         // System.out.println("welcome " + Name + " " + lastname + " " + "it is great to see you again" );
           // return "login";
                  return  "welcome " + Name + " " + lastname + " " + "it is great to see you again";
        }
        else{
            // System.out.println("username or password incorrect, please try again");
      // return "login unsuccessful";
                return "username or password incorrect, please try again";
            
        }
       // return null;
       
        
       
        
    }

       public void display(String Name, String lastname , String Username , String Password){
           System.out.println("entered name = " + Name);
           System.out.println("entered lastname = " + lastname);
           System.out.println("entered username = " + Username );
           System.out.println("entered password = " + Password);
           
}
}
