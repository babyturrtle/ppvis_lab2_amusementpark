package model;

import java.util.Date;


public class CreditCard {
    private String fullName;
    private int id;
    private Date dateOfExpiring;
    private int CVV;
    private int password;

    public CreditCard(String fullName, int id, Date dateOfExpiring, int CVV, int password){
        this.fullName=fullName;
        this.id=id;
        this.dateOfExpiring=dateOfExpiring;
        this.CVV=CVV;
        this.password=password;
    }

    public void setFullName(String fullName)
    {this.fullName = fullName;}

    public void setId(int id)
    {this.id = id;}

    public void setDateOfExpiring(Date dateOfExpiring)
    {this.dateOfExpiring = dateOfExpiring;}

    public void setCVV(int CVV)
    {this.CVV = CVV;}

    public void setPassword(int password)
    { this.password = password;}

    public String getFullName()
    {return fullName;}

    public int getId()
    {return id;}

    public Date getDateOfExpiring()
    {return dateOfExpiring;}

    public int getCVV()
    {return CVV;}

    public int getPassword()
    {return password;}
}