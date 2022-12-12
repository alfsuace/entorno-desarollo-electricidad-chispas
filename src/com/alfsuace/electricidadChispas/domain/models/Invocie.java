package com.alfsuace.electricidadChispas.domain.models;
import java.util.ArrayList;
import java.util.List;

public class Invocie {
    //-invoiceCode: String
    //-invoiceDate: String
    //-cilent: Client
    //-product: List<Product>
    //-service: List<Service>
    //-totalPrice: Integer
    //-totalPriceVat: Integer

    private String invoiceCode;
    private String invoiceDate;
    private Client client;
    private List<Product> product= new ArrayList<>();
    private List<Service> service = new ArrayList<>();
    private Integer totalPrice;
    private Integer totalPriceVat;

    //se necesita un indice, le dejo publico para que pueda hacer la búsqueda
    private Integer index = 0;

    public void addProduct(Product product){
        this.product.add(product);
    }
    public Product getProduct(){
        return product.get(index);
    }
    public Integer getProductSize(){
        return product.size();
    }

    public void addService(Service service){
        this.service.add(service);
    }

    public Service getService(){
        return service.get(index);
    }
    public Integer getServiceSize(){
        return service.size();
    }

    public String getInvoiceCode () {
        return invoiceCode;
    }

    public void setInvoiceCode (String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public String getInvoiceDate () {
        return invoiceDate;
    }

    public void setInvoiceDate (String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public Client getClient () {
        return client;
    }

    public void setClient (Client client) {
        this.client = client;
    }

    //getters y setters de precios
    public Integer getTotalPrice () {
        return totalPrice;
    }

    public void setTotalPrice (Integer totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getTotalPriceVat () {
        return totalPriceVat;
    }

    public void setTotalPriceVat (Integer totalPriceVat) {
        this.totalPriceVat = totalPriceVat;
    }
}
