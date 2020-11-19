/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KAUBookStoreSystem;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Nora
 */
public class Student extends Person {
    private Student next;
 private String address;
    private Order order;

public Student (){
    super();
}
    public Student(String firstName, String lastName, String birthdate, String phoneNum, String email,String address) {
        super(firstName, lastName, birthdate, phoneNum, email);
        this.address=address;
    }
    
    public int calAge (String date1) throws ParseException{
     
  //using Calendar Object

  String s = date1;

  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

  Date d = sdf.parse(s);

  Calendar c = Calendar.getInstance();

  c.setTime(d);

  int year = c.get(Calendar.YEAR);

  int month = c.get(Calendar.MONTH) + 1;

  int date = c.get(Calendar.DATE);

  LocalDate l1 = LocalDate.of(year, month, date);

  LocalDate now1 = LocalDate.now();

  Period diff1 = Period.between(l1, now1);

  System.out.println("age:" + diff1.getYears() );
        return diff1.getYears();
    }
    public Student getNext() {
        return next;
    }

    public void setNext(Student next) {
        this.next = next;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
   

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
    
    
}
