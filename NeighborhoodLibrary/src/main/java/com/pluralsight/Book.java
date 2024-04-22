package com.pluralsight;

import java.io.InputStream;

public class Book {
    // private variables to store book information
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;


    // Constructor to initialize a Book object with provided parameters
    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public int getId() {
        return id;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    public String toString() {
        return "Book{" +
                "id = " + id +
                ", isbn = " + isbn +
                ", title = " + title +
                ", checked out = " + isCheckedOut +
                ", to recipient = " + checkedOutTo +
                '}';

        }

    public void checkOut(String name) {
        if(!isCheckedOut){
            isCheckedOut = true;
            checkedOutTo = name;
            System.out.println("Sorry! This book is reserved or checked out to " + checkedOutTo);
        } else {
            System.out.println("This book is now checked out.");
        }


        }
    }