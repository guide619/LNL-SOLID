package com.company.O;

import com.company.S.Invoice;

public class InvoicePersistence {
    Invoice invoice;

    public InvoicePersistence(Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToFile(String filename){
        //create file and print invoice
    }

    public void saveToDB(String filename){
        //print invoice DB
    }
}
