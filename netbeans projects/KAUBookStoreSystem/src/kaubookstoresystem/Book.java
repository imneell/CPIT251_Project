/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KAUBookStoreSystem;
import cpit380practice.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author manar
 */
public class Book  {
   private  String bookName;
   private int quantity=0;
   private boolean state;
   private int price;
   private Picture bookPic;
   private Book next;
   private String type;
  
public Book(String bookName,int bookPrice, Picture bookPic){
    this.bookName=bookName;
    this.bookPic=bookPic;
            this.price=bookPrice;
}
    public Book(String bookName) {
        this.bookName = bookName;
    }

    public Book getNext() {
        return next;
    }

    public void setNext(Book next) {
        this.next = next;
    }

    public Picture getBookPic() {
        return bookPic;
    }

    public void setBookPic(Picture bookPic) {
        this.bookPic = bookPic;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isState() {
        return state;
    }
public String getState (){
      if(this.state==true)
          return "available";
      return "unavailable";
}
    public void setState(boolean state) {
        this.state = state;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Book() {
    }
   
 public boolean isAvailable(String bookname) {
     if(bookname.equals("unavailable")){
         state=false;
     }else{
         state=true;
     }

        return state;
 }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Book(String bookName, int price,int quantity,boolean state, String bookType,Picture pic) {
        this.bookName = bookName;
        this.state = state;
        this.price = price;
        this.quantity=quantity;
        this.bookPic=pic;
        this.type=bookType;
    }
      public Book(String bookName, int price,int quantity,boolean state, String bookType,Picture pic,Book next) {
        this.bookName = bookName;
        this.state = state;
        this.price = price;
        this.bookPic=pic;
        this.quantity=quantity;
        this.type=bookType;
        this.next=next;
    }
}
