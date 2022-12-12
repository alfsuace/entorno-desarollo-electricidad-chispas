package com.alfsuace.electricidadChispas.presentation;

import com.alfsuace.electricidadChispas.domain.models.Invocie;

public class InvoicePrinter {

    public void printInvoice(Invocie invoice) {
        for (int i = 0; i < invoice.getProductSize(); i++) {
            System.out.println("Producto: " + invoice.getProduct());
        }
        System.out.println("--------------------------------------");
        for (int i = 0; i < invoice.getServiceSize(); i++){
            System.out.println("Servicio: " + invoice.getService());
        }
        System.out.println("--------------------------------------");
        System.out.println("Precio total sin IVA: " + invoice.getTotalPrice() +
                ", Precio total con IVA: " + invoice.getTotalPriceVat());
        System.out.println("--------------------------------------");
    }
}
