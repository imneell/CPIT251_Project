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
public class cart_linkedlist {

    private Cart cart;
    private Book head;

    public cart_linkedlist() {
        cart = null;
    }

    public boolean isEmpty() {
        //to check if the linked list is empty
        return cart == null;
    }

    //linked list
    public void addToCart(Book newBook) {

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

    public double price(int q, String Bname) {
        Book helpPtr = head;
        double tot = 0;
        if (head != null) {
            while (helpPtr.getNext() != null) {
                //tot = tot + (helpPtr.getPrice() * q);
                //Integer.valueOf(helpPtr.getPrice());
                if (helpPtr.getBookName().equalsIgnoreCase(Bname)) {

                    tot = Integer.valueOf(helpPtr.getPrice()) * q;
                    helpPtr = helpPtr.getNext();
                }
            }
        }
        return tot;
    }

    public Book getBook(String name) {
        Book helpPtr = head;

        if (head.getBookName().equalsIgnoreCase(name)) {
            return head;
        } else {
            while (helpPtr != null) {
                if (helpPtr.getBookName().equalsIgnoreCase(name)) {
                    return helpPtr;
                }
                helpPtr = helpPtr.getNext();
            }
        }

        return helpPtr;

    }

    public void delete(Book b) {
        if (lookup(b).equals(true)) {
            if (head == b) {
                head = head.getNext();
            } else {
                Book helpPtr = head;
                while (helpPtr.getNext() != null) {
                    if ((helpPtr.getNext()) == b) {
                        //  helpPtr.getNext() = helpPtr.getNext().getNext();
                        helpPtr.setNext(helpPtr.getNext().getNext());
                    } else {
                        helpPtr = helpPtr.getNext();
                    }
                }
            }

        }
    }

    public Object lookup(Book b) {
        Book helpPtr = head;
        Boolean search = false;

        if (head == b) {
            search = true;
        }

        while (helpPtr.getNext() != null) {
            if (helpPtr == b) {
                search = true;
            } else {
                helpPtr = helpPtr.getNext();
            }
        }

        return search;
    }

    @Override
    public String toString() {
        return "cart_linkedlist{" + ", head=" + head + '}';
    }

}
