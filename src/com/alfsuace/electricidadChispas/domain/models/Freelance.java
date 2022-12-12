package com.alfsuace.electricidadChispas.domain.models;

public class Freelance implements Client {


    //-name: String
    //-surname1: String
    //-surname2: String
    //-dni: String
    //-mailingAddress: String
    //-town: String
    //-province: String
    //-email: String
    //-phoneNumber: String


    private String name;
    private String surname1;
    private String surname2;
    private String dni;
    private String mailingAddress;
    private String town;
    private String province;
    private String email;
    private String phoneNumber;


    @Override
    public void setClientCode (String dni) {
        this.dni = dni;
    }

    @Override
    public String getClientCode () {
        return dni;
    }

    @Override
    public void setMailingAddress (String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }

    @Override
    public String getMailingAddress () {
        return mailingAddress;
    }

    @Override
    public void setTown (String town) {
        this.town = town;
    }

    @Override
    public String getTown () {
        return town;
    }

    @Override
    public void setProvince (String province) {
        this.province = province;
    }

    @Override
    public String getProvince () {
        return province;
    }

    @Override
    public void setEmail (String email) {
        this.email = email;
    }

    @Override
    public String getEmail () {
        return email;
    }

    @Override
    public void setPhoneNumber (String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getPhoneNumber () {
        return phoneNumber;
    }

    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getSurname1 () {
        return surname1;
    }

    public void setSurname1 (String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2 () {
        return surname2;
    }

    public void setSurname2 (String surname2) {
        this.surname2 = surname2;
    }

    public String getFullName(){
        return name + " " + surname1 + " " + surname2;
    }
}
