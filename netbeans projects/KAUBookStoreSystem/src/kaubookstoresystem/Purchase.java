/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KAUBookStoreSystem;

import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author manar
 */
public class Purchase {

    private Date date; //purchase date
    private String paymentMethod;
    private double amount;
    private String deliveryMethod;
    private boolean isConfiremed;
    private boolean isCancelled;

    public Purchase(double amount,String paymentMethod,Date date) {
        this.date = date;
        this.paymentMethod = paymentMethod;
        this.amount = amount;
    }
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double discount(double amount) throws FileNotFoundException {
        File file = new File("copouns.txt"); //the copoun and its percentage exits in the file
        //amount from a cart object
        double discountedAmount = 0;
            Scanner read = new Scanner(file);
            String line = read.nextLine();
            String[] lines = line.split(",");
         
             String percentage = lines[3];
              int percent = Integer.parseInt(percentage);
               discountedAmount= amount*percent/100;
           
        return discountedAmount;
    }

    public boolean isIsConfiremed() {
        return isConfiremed;
    }

    public void setIsConfiremed(boolean isConfiremed) {
        this.isConfiremed = isConfiremed;
    }

    public boolean isIsCancelled() {
        return isCancelled;
    }

    public void setIsCancelled(boolean isCancelled) {
        this.isCancelled = isCancelled;
    }
    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }

    public Purchase() {
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
  public double calculatePurchaseAmount() {
        return amount;
    }
    
    public String sendConfirmMsg() {
        return "The purchase is completed";
    }
    
    public void displayBill(double amount,Date date) {
        System.out.println("Amount is : " + amount +"\n" + "Date of purchase : " + date);
       
    }
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
