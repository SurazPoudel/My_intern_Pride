package com.company;

import javax.swing.text.html.CSS;

class Product
{
    String itemNo;
    String name;
    double price;
    short qty;

    //Constructors
    public Product(String itemno)
    {
        itemNo = itemno;
    }

    public  Product (String itemno, String name)
    {
        itemNo = itemno;
        this.name = name;
    }

    public Product(String itemno, String name, double price, short qty)
    {
        itemNo = itemno;
        this.name = name;
        setPrice(price);
        setQty(qty);
    }


    //Getters
    public String getItemNo()
    {
        return itemNo;
    }

    public String getName()
    {
        return name;
    }

    public double getPrice()
    {
        return price;
    }

    public short getQty()
    {
        return qty;
    }


    //Setters
    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setQty(short qty)
    {
        this.qty = qty;
    }


}

class Customer
{
    private String custId;
    private String name;
    private String address;
    private String phno;

    //Constructors
    public Customer(String custId, String name)
    {
        this.custId = custId;
        this.name = name;
    }

    public Customer(String custId, String name, String address, String phno)
    {
        this.custId = custId;
        this.name = name;

    }

    //Getters
    public String getCustId()
    {
        return custId;
    }

    public String getName()
    {
        return name;
    }

    public String getAddress()
    {
        return address;
    }
    public String getPhno()
    {
        return phno;
    }

    //Setters
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setPhno(String phno)
    {
        this.phno=phno;
    }

}



public class Main {

    public static void main(String[] args) {

    }
}
