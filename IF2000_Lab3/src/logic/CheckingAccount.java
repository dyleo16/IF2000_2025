package logic;

/**
 *
 * @author dylan
 */

public class CheckingAccount extends Account{
    private double interestRate;
    
    public CheckingAccount(String accountNumber, double balance, Client client, String bank, double interestRate){
           super(accountNumber, balance, client, bank);
           this.interestRate = interestRate;
    }
    
public double getInterestRate(){
return interestRate;
}

public void setInterestRate(double interestRate){
this.interestRate = interestRate;
}

@Override
public void deposit(double amount){
if(amount > 0){
  setBalance(getBalance() + amount);
}
}

@Override
public void withdraw(double amount){
if(amount > 0 && amount <= getBalance()){
   setBalance(getBalance()- amount);
}else {
   System.out.println("Saldo insuficiente o monto invalado");
}
}

@Override
public void interestCalculation(){
double interest = (getBalance()* interestRate) / 12;
setBalance(getBalance() + interest);
}

@Override
public String toString(){
   return super.toString()+ ", interestRate=" + interestRate;
}
}
