/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KAUBookStoreSystem;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author manar
 */
public class student_linkedlist {
       private Student head;

    public student_linkedlist() {
        head=null;
    }
    public boolean isEmpty() {
      //to check if the linked list is empty
        return head == null;
    } 
    public void addStudent(Student newStudent) {
//this method is to add a new student to the linked list
            if (head == null) {
                head = newStudent;
            } else {

                Student helpPtr = head;
                while (helpPtr.getNext() != null) {
                    helpPtr = helpPtr.getNext();
                }
                helpPtr.setNext(newStudent);
            
        }
    }
    public void PrintBook() throws FileNotFoundException, IOException {
    //printing students
    File file =  new File("Student.txt");
    FileWriter fr = new FileWriter(file,true);
        Student helpPtr = head;
    
        while (helpPtr != null) {
            
            System.out.printf("\t|%-12s|%-24s|%-46s|%-24s|%-24s|%-24s|", helpPtr.getFirstName(), helpPtr.getLastName(), helpPtr.getBirthdate(),helpPtr.getPhoneNum(),helpPtr.getEmail(),helpPtr.getAddress());
            fr.write(helpPtr.getFirstName()+"," +  helpPtr.getLastName() + "," +helpPtr.getBirthdate()+ "," + helpPtr.getPhoneNum()+ "," +helpPtr.getEmail()+ "," +helpPtr.getAddress()+"\n");
            fr.close();
            helpPtr = helpPtr.getNext(); // to go to the next node

        }
        System.out.println("");

    }
}
