/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KAUBookStoreSystem;

import java.util.Date;

/**
 *
 * @author manar
 */
public class cash extends Purchase {
    
    private long phoneNumber;

    public cash() {
    }

    public cash(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public cash(long phoneNumber, double amount, String paymentMethod, Date date) {
        super(amount, paymentMethod, date);
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    
    public boolean isPhoneNoConfirmed(long phoneNumber) {
        return true;
    }
    
    
    
}
