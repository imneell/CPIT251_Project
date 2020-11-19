/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KAUBookStoreSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author manar
 */
public class Login {
    private String email ;
    private String password;
    private String ID;
    

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Login() {
    }

    public Login(String email, String password, String ID) {
        this.email = email;
        this.password = password;
        this.ID = ID;
    }
    public boolean isKAUemail(String email){
        this.email=email;
        boolean checkKAU = email.contains("stu.kau.edu.sa");
    return checkKAU;
    }
    public boolean isCorrectPasswordSTD(String password){
        this.password=password;
        boolean checkPass;
        System.out.println(password.charAt(0));
        checkPass = password.charAt(0) =='A' && password.charAt(1)=='a';
            return checkPass;
    }
     public boolean isCorrectPasswordEmp(String password, String ID) throws FileNotFoundException{
        this.password=password;
        this.ID=ID;
   boolean check = false;
           File output = new File("Employee.txt");
           Scanner read = new Scanner(output);
      while(read.hasNext()){
          switch(read.next()){
              case "1" : 
                 String info [] = read.next().split(",");
                 if(password.equals(info[2])){
            check=true;
                 }
            break;
              case "2": 
                 String info2 [] =read.next().split(",");
                 if(password.equals(info2[2])){
            check=true; }break;
              case "3":
                      String info3 [] = read.next().split(",");
                 if(password.equals(info3[2])){
            check=true;}
              break;
              case "4":
                      String info4 [] = read.next().split(",");
                 if(password.equals(info4[2])){
            check=true;}
            break;
            case "5" : 
                              String info5 [] = read.next().split(",");
                 if(password.equals(info5[2])){
            check=true;
                      break;
      }
    
    }
 
    }
       return check;
    }
     
    public boolean isEmployee(String ID) throws FileNotFoundException{
        this.ID=ID;
        boolean check = false;
           File output = new File("Employee.txt");
           Scanner read = new Scanner(output);
   
      while(read.hasNext()){
          switch(read.next()){
              case "1" : 
                 String info [] = read.next().split(",");
                 if(ID.equals(info[1])){
            check=true;
                 }
            break;
              case "2": 
                             String info2 [] =read.next().split(",");
                 if(ID.equals(info2[1])){
            check=true; }break;
              case "3":
                      String info3 [] = read.next().split(",");
                 if(ID.equals(info3[1])){
            check=true;}
              break;
              case "4":
                      String info4 [] = read.next().split(",");
                 if(ID.equals(info4[1])){
            check=true;}
            break;
            case "5" : 
                              String info5 [] = read.next().split(",");
                 if(ID.equals(info5[1])){
            check=true;
                      break;
      }
    
    }
 
    }
       return check;
}
}
