/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KAUBookStoreSystem;

/**
 *
 * @author Nora
 */
public class Employee extends Person {

    private int ID;
    private int salary;

    public Employee(String firstName, String lastName, String birthdate, String phoneNum, String email) {
        super(firstName, lastName, birthdate, phoneNum, email);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void addBook() {

    }

    public void updateBook() {

    }

    public void deleteBook() {

    }
}
