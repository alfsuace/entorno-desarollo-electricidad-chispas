package com.alfsuace.electricidadChispas;

public class Service implements Sale{
    //-ServiceCode: String
    //-name: String
    //-price: Integer
    //-vatType: Integer
    private String serviceCode;
    private String name;
    private Integer price;
    private Integer vatType;


    @Override
    public void setCode (String code) {
        this.serviceCode = code;
    }

    @Override
    public String getCode () {
        return serviceCode;
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
}
