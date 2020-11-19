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
public class Book_linkedlist {
    private Book head;

    public Book_linkedlist() {
        head=null;
    }
    public boolean isEmpty() {
      //to check if the linked list is empty
        return head == null;
    } 
    public void addBook(Book newBook) {
//this method is to add a new student to the linked list
            if (head == null) {
                head = newBook;
            } else {

                Book helpPtr = head;
                while (helpPtr.getNext() != null) {
                    helpPtr = helpPtr.getNext();
                }
                helpPtr.setNext(newBook);
            
        }
    }
    public void PrintBook() throws FileNotFoundException, IOException {
    //printing students
        Book helpPtr = head;
        System.out.println("");
        System.out.printf("\t|%-12s|%-24s|%-46s|%-47s\n", "Book name", "Book quantity", "Book state", "Book price");
        System.out.printf("---------------------------------------------------------------------------------------------------------------------\n");
File file = new File("AddedBooks.txt");
FileWriter fr = new FileWriter(file,true);

        while (helpPtr != null) {
        fr.write("0,"+ helpPtr.getBookName()+","+helpPtr.getPrice()+","+helpPtr.getQuantity()+","+helpPtr.getType()+","+helpPtr.getState());
            helpPtr = helpPtr.getNext(); // to go to the next node

        }
        System.out.println("");

    }
}
