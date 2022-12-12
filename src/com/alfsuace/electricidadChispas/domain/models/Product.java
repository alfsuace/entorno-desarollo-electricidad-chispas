package com.alfsuace.electricidadChispas.domain.models;

public class Product implements Sale{
    //-productCode: String
    //-name: String
    //-brand: String
    //-model: String
    //-price: Integer
    //-vatType: Integer

    private String productCode;
    private String name;
    private String brand;
    private String model;
    private Integer price;
    private Integer vatType;


    @Override
    public void setCode (String code) {
        this.productCode = code;
    }

    @Override
    public String getCode () {
        return productCode;
    }

    @Override
    public void setName (String name) {
        this.name = name;
    }

    @Override
    public String getName () {
        return name;
    }

    @Override
    public void setPrice (Integer price) {
        this.price = price;
    }

    @Override
    public Integer getPrice () {
        return price;
    }

    @Override
    public void setVatType (Integer vatType) {
        this.vatType = vatType;
    }

    @Override
    public Integer getVatType () {
        return vatType;
    }

    public String getModel () {
        return model;
    }

    public void setModel (String model) {
        this.model = model;
    }

    public String getBrand () {
        return brand;
    }

    public void setBrand (String brand) {
        this.brand = brand;
    }
}
