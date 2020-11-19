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
public class Bookstore {
    private String bookstoreName;
private String bookstoreAddress;
private Book bookName;

    public Bookstore(String bookstoreName, String bookstoreAddress, Book bookName) {
        this.bookstoreName = bookstoreName;
        this.bookstoreAddress = bookstoreAddress;
        this.bookName = bookName;
    }

    public String getBookstoreName() {
        return bookstoreName;
    }

    public void setBookstoreName(String bookstoreName) {
        this.bookstoreName = bookstoreName;
    }

    public String getBookstoreAddress() {
        return bookstoreAddress;
    }

    public void setBookstoreAddress(String bookstoreAddress) {
        this.bookstoreAddress = bookstoreAddress;
    }

    public Book getBookName() {
        return bookName;
    }

    public void setBookName(Book bookName) {
        this.bookName = bookName;
    }

}
