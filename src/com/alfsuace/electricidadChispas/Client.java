package com.alfsuace.electricidadChispas;

public interface Client {

    void setClientCode (String cifOrDni);

    public String getClientCode();

    void setMailingAddress (String mailingAddress);

    public String getMailingAddress();
    public void setTown(String town);
    public String getTown();
    public void setProvince(String province);
    public String getProvince();
    public void setEmail(String email);
    public String getEmail();
    public void setPhoneNumber(String phoneNumber);
    public String getPhoneNumber();
}
