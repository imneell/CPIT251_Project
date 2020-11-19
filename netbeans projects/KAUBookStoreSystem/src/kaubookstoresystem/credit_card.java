/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KAUBookStoreSystem;

import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author manar
 */
public class credit_card {
    private String cvv;
    private String accNo;
    private Date expDate;
    private String cardType;
    private boolean isValid;

    public boolean isIsValid() {
        return isValid;
    }

    public void setIsValid(boolean isValid) {
        this.isValid = isValid;
    }
    public credit_card() {
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }
    public boolean isMatched (String cardNo){
        //the card no must include 12 digits with 2 dashes thus 14 length in total
        return (cardNo.length()==19&&cardNo.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}"));
    }
    public boolean authorizeCard(String cardNo, String cardType, String expDate,String cvv) throws ParseException{
        //check the expirary date and the card no
            // check the expirary date..c compare user's date with current date
            //convert user's string date to Date type
            Date today = new Date();
            Date exp = new SimpleDateFormat("dd/MM/yyyy").parse(expDate);
            if(today.compareTo(exp)>0 || today.compareTo(exp)==0){
                this.isValid=false;
                     UIManager.put("OptionPane.messageFont", new javax.swing.plaf.FontUIResource(new Font(
                    "SF Movie Poster", Font.BOLD, 25)));
            final JOptionPane pane = new JOptionPane("sorry, the card is invalid");
            final JDialog d = pane.createDialog((JFrame)null, "");
            d.setLocation(100,300);
            d.setVisible(true);
            }else{
                  this.isValid=true;
            }
     return this.isValid;
    }
}
