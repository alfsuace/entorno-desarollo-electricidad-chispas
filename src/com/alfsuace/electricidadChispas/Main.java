package com.alfsuace.electricidadChispas;

public class Main {
    public static void main (String[] args) {
        System.out.println("Hello world!");
    }

    public static interface Sale {
        public void setCode();
        public String getCode();
        public void setName();
        public String getName();
        public void setPrice();
        public Integer getPrice();
        public void setVatType();
        public Integer getVatType();

    }
}