package if2000_lab3;
import java.time.LocalDate;

import logic.Client;
import logic.SavingAccount;
import logic.CheckingAccount;
import logic.Binnacle;
import logic.Sinpe;

/*
 * @author dylan
 */

public class IF2000_Lab3 {

public static void main(String[] args) {

        Client client1 = new Client("Dylan", "703050257", "88106173", "Limon");
        Client client2 = new Client("Erik", "102040246", "87776655", "Alajuela");



        SavingAccount sa = new SavingAccount(
                "SA001",
                1000,
                client1,
                "BCR",
                LocalDate.now(),
                12,
                0.05
        );

        CheckingAccount ca = new CheckingAccount(
                "CA001",
                500,
                client2,
                "BN",
                0.03
        );

      
        Binnacle log = new Binnacle();

      
        sa.deposit(300);
        log.registerEvent("Deposit", sa);

        sa.withdraw(150);
        log.registerEvent("Withdrawal", sa);

        ca.deposit(200);
        log.registerEvent("Deposit", ca);

        ca.withdraw(100);
        log.registerEvent("Withdrawal", ca);

        
        sa.interestCalculation();
        ca.interestCalculation();

       
        Sinpe.transfer(sa, ca, 200, log);

        
        System.out.println("\nTransaction Log:");
        log.showEvents();

        
        System.out.println("\nFinal Account States:");
        System.out.println(sa);
        System.out.println(ca);
    }
}
