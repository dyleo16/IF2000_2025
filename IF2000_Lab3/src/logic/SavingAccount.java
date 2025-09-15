package logic;
import java.time.LocalDate;

/**
 *
 * @author dylan
 */
public class SavingAccount extends Account {
    private LocalDate startDate;
    private int termMonths;
    private double interestRate;
    
public SavingAccount(String accountNumber, double balance, Client client,
String bank, LocalDate startDate, int termMonths, double interestRate){

super(accountNumber, balance, client, bank);
        this.startDate = startDate;
        this.termMonths = termMonths;
        this.interestRate = interestRate;
}

public LocalDate getStartDate(){
    return startDate;
}

public void setStartDate(LocalDate startDate){
    this.startDate = startDate;
}

public int getTermMonths(){
    return termMonths;
}

public void setTermMonths(int termMonths){
    this.termMonths = termMonths;
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
    setBalance(getBalance() - amount);
}else{
    System.out.println("Saldo insuficiente o monto invalido");
}
}

@Override
public void interestCalculation(){
double interest = getBalance() * interestRate * termMonths;
     setBalance(getBalance() + interest);
}

@Override
public String toString(){
return super.toString() + 
        ", startDate=" + startDate +
        ", termMonths=" + termMonths +
        ", interestRate=" + interestRate;
}


}
