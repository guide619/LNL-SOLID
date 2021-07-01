package com.company.S;

import java.awt.print.Book;

public class Invoice {
    Book book;
    Integer quantity;
    Double discount;
    Double taxRate;
    private Double total;

    public Invoice(Book book, Integer quantity, Double discount, Double taxRate) {
        this.book = book;
        this.quantity = quantity;
        this.discount = discount;
        this.taxRate = taxRate;
    }

    public Double calculateTotal(){
        Double totalPrice = 0.0;
        //cal
        this.total = totalPrice;
        return  totalPrice;
    }

    public void printInvoice(){
        //print invoice
    }

    public void saveToFile(String filename){
        //create file and print invoice
    }

}
