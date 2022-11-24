package com.alfsuace.electricidadChispas;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {

    //AUTONOMO
    Freelance autonomo1 = new Freelance();
    autonomo1.setName("Alfonso");
    autonomo1.setSurname1("Suárez");
    autonomo1.setSurname2("Aceña");
    autonomo1.setClientCode("12345678X");
    autonomo1.setMailingAddress("calle 1 piso a portal n 05005");
    autonomo1.setTown("Ávila");
    autonomo1.setProvince("Ávila");
    autonomo1.setEmail("alfonso@gmail.com");
    autonomo1.setPhoneNumber("123456789");

    //SOCIEDAD
    Society sociedad1 = new Society();
    sociedad1.setBusinessName("electricidad 1");
    sociedad1.setClientCode("12345678Ñ");
    sociedad1.setMailingAddress(" calle 1 5005");
    sociedad1.setTown("Ávila");
    sociedad1.setProvince("Ávila");
    sociedad1.setEmail("alfonso@gmail.business");
    sociedad1.setPhoneNumber("123456798");

    //PRODUCTO
    //1
    Product producto1 = new Product();
    producto1.setCode("1");
    producto1.setName("cable par trenzado 100m");
    producto1.setBrand("marca1");
    producto1.setModel("modelo 7");
    producto1.setPrice(100);
    producto1.setVatType(21);

    //2
    Product producto2 = new Product();
    producto2.setCode("2");
    producto2.setName("RJ45");
    producto2.setBrand("marca2");
    producto2.setModel("modelo 7");
    producto2.setPrice(5);
    producto2.setVatType(12);

    //SERVICIO
    //1
    Service servicio1 = new Service();
    servicio1.setCode("1");
    servicio1.setName("Instalado");
    servicio1.setPrice(20);
    servicio1.setVatType(21);
    //2
    Service servicio2 = new Service();
    servicio2.setCode("2");
    servicio2.setName("Limpiado");
    servicio2.setPrice(10);
    servicio2.setVatType(4);

    //FACTURA CON AUTONOMO
    Invocie factura1 = new Invocie();
    factura1.setInvoiceCode("1");
    factura1.setInvoiceDate("24/11/2022");
    factura1.setClient(autonomo1);
    factura1.addProduct(producto1);
    factura1.addService(servicio1);
    factura1.setTotalPrice(150);
    factura1.setTotalPriceVat(171);

    //FACTURA CON SOCIEDAD
    Invocie factura2 = new Invocie();
    factura2.setInvoiceCode("2");
    factura2.setInvoiceDate("23/11/2022");
    factura2.setClient(sociedad1);
    factura2.addProduct(producto2);
    factura2.addService(servicio2);
    factura2.setTotalPrice(30);
    factura2.setTotalPriceVat(33);

    InvoicePrinter impresionUno = new InvoicePrinter();
    impresionUno.printInvoice(factura1);

    }
}