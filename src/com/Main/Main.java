package com.Main;
import com.clientmodule.Client;
import  com.bankAcount.BankAccount;
 

public class Main {

  public static void main(String[] args) {
    
    BankAccount bankAccount = new BankAccount();
    
    Client client = new Client("AAAA");
    
    client.linkAccount(bankAccount);
    client.performingTransaction(55);
    client.performingTransaction(110);
    
    
   client.account();
    
   
  }

}
