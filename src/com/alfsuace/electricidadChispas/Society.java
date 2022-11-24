package com.alfsuace.electricidadChispas;

public class Society implements Client{
    //-businessName: String
    //-cif: String
    //-mailingAddress: String
    //-town: String
    //-province: String
    //-email: String
    //-phoneNumber: String
    private String businessName;
    private String cif;
    private String mailingAddress;
    private String town;
    private String province;
    private String email;
    private String phoneNumber;

    @Override
    public void setClientCode (String cif) {
        this.cif=cif;
    }

    @Override
    public String getClientCode () {
        return cif;
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

    public String getBusinessName () {
        return businessName;
    }

    public void setBusinessName (String businessName) {
        this.businessName = businessName;
    }
}
