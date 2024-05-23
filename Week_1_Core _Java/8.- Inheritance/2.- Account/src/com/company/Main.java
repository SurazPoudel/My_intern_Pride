package com.company;

class Account
{
    private String accNo;
    private String name;
    private String address;
    private  String phno;
    private String dob;
    protected long balance;

    //Constructor
    public Account(String acc, String n, String add, String phno, String dob)
    {
        accNo = acc;
        name = n;
        address = add;
        this.phno = phno;
        this.dob = dob;
        balance = 0;
    }

    //Getters
    public String getAccNo() {
        return accNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhno() {
        return phno;
    }

    public String getDob() {
        return dob;
    }

    //Setters
    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhno(String phno) {
        this.phno = phno;
    }
}

class SavingAccount extends Account
{
    public SavingAccount(String acc, String n, String add, String phno, String dob) {
        super(acc, n, add, phno, dob);
    }

    public void deposit(long amt)
    {
        balance+=amt;
    }

    public  void withdraw(long amt)
    {
        balance-=amt;
    }

}


public class Main {

     public static void main(String[] args) {
	// write your code here
    }
}
