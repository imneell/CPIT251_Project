/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KAUBookStoreSystem;

/**
 *
 * @author manar
 */

import cpit380practice.Picture;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
public class Order {
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



  private  int OrderNO;
  private    Date OrderDate;
  private   double Total;
  private  String orderId;
  private ArrayList<Book> books;

    public ArrayList<Book> getBooks() {
        return books;
    }
public Order (){
    
}
    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public int getPointer() {
        return pointer;
    }

    public void setPointer(int pointer) {
        this.pointer = pointer;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
//  private  Purchase PaymentMethod;
    private  String PaymentMethod;
  private  String orderStatus;
  int pointer;
    File file =new File("order.txt"); 
 
  public void AddOrder(int OrderNO,Date OrderDate,double Total,ArrayList<Book> books) throws IOException {
      
this.OrderNO=OrderNO;this.OrderDate=OrderDate;this.Total=Total;
    this.books=books;
        FileWriter myorder = new FileWriter(file,true);
      
     myorder.write(OrderNO+", "+OrderDate+","+orderId+", "+Total+","+PaymentMethod+","+"in process,");
      for (int i = 0; i < books.size(); i++) {
            myorder.write(books.get(i).getBookName()+","+books.get(i).getPrice()+","+books.get(i).getBookPic().getFileName()+",");
      }
  
         myorder.close();
       
  
  }
  public void DeleteOrder(String orderId) throws FileNotFoundException, IOException{
this.orderId=orderId;
File inputFile = new File("order.txt"); 
File tempFile = new File("TempFile.txt"); 
BufferedReader r = new BufferedReader(new FileReader(inputFile)); 
BufferedWriter w = new BufferedWriter(new FileWriter(tempFile)); 

String currentLine;  
while((currentLine = r.readLine()) != null) { 
 
// trim newline when comparing with lineToRemove 
    String trimmedLine = currentLine.trim(); 
    if(trimmedLine.contains(orderId)) continue;
    w.write(currentLine + System.getProperty("line.separator")); 
}   
        w.close(); 
        r.close();
     tempFile.renameTo(inputFile);  
  }
  
    public int getOrderNO() {
         return OrderNO;
    }

    public Date getOrderDate() {
        return OrderDate;
      
    }

    public double getTotal() {
        return Total;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderNO(int OrderNO) {
       this.OrderNO = OrderNO;
    }

    public void setOrderDate(Date OrderDate) {
        this.OrderDate = OrderDate;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setPaymentMethod(String PaymentMethod) {
        this.PaymentMethod = PaymentMethod;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

   
}


