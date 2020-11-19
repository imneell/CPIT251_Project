/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KAUBookStoreSystem;
import java.io.FileNotFoundException;

/**
 *
 * @author manar
 */
public class Cart {
  private int productQuantity;
    private String productsName;
    private double price;
    private double total;
    private Book head;

    
  public boolean isEmpty() {
      //to check if the linked list is empty
        return head == null;
    } 

      //linked list
public void addToCart (Book newBook){
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

public double calTotal(int price, int quantity){
   /*  Book helpPtr = head;

        while (helpPtr != null) {
            if(helpPtr.getQuantity()!=0){
         this.total+=(helpPtr.getPrice()*helpPtr.getQuantity());
            System.out.println(helpPtr.getQuantity());}else{
                return this.total;
            }
            helpPtr = helpPtr.getNext(); // to go to the next node

        }
        return this.total;*/
  return 0.0;
   
}
     
    public void PrintCart() throws FileNotFoundException {
    //printing students
        Book helpPtr = head;
        System.out.println("");
        System.out.printf("\t|%-12s|%-24s|%-46s|%-47s\n", "Book name", "Book quantity", "Book state", "Book price");
        System.out.printf("---------------------------------------------------------------------------------------------------------------------\n");

        while (helpPtr != null) {
            System.out.printf("\t|%-12s|%-24s|%-46s|%-24s", helpPtr.getBookName(), helpPtr.getQuantity(), helpPtr.isAvailable(helpPtr.getBookName())==false? "unavailable" : "Aavailable",helpPtr.getPrice());
         //   System.out.printf("-------------------------------------------------------------------------------------------------------------------------------\n");
            System.out.println("total " + this.calTotal());
            helpPtr = helpPtr.getNext(); // to go to the next node

        }
        System.out.println("");

    }

    public Cart(int productQuantity, String productsName, double price, double total) {
        this.productQuantity = productQuantity;
        this.productsName = productsName;
        this.price = price;
        this.total = total;
    }
  
    public Cart() {
           head=null;
    }
    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
   
  
    
}
