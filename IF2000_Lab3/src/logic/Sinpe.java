package logic;

/**
 *
 * @author dylan
 */
public class Sinpe {
  public static void transfer(Account origin, Account destination, double amount, Binnacle log) {
    // 1. Validate that the accounts belong to different banks
    if (origin.getBank().equalsIgnoreCase(destination.getBank())) {
        System.out.println("Error: Both accounts belong to the same bank. SINPE only applies between different banks.");
        return;
    }

    // 2. Validate sufficient balance
    if (origin.getBalance() < amount) {
        System.out.println("Error: Insufficient balance in the origin account.");
        return;
    }

    // 3. Execute the transfer
    origin.withdraw(amount);
    destination.deposit(amount);

    // 4. Register the transaction in the log
    log.registerEvent("SINPE - Withdrawal", origin);
    log.registerEvent("SINPE - Deposit", destination);

    System.out.println("SINPE transfer completed successfully.");
}
}
