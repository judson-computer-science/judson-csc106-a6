// !!!! YOU MUST NOT MODIFY THIS FILE !!!!
import java.util.ArrayList;
import java.util.stream.Stream;

import account.*;

public class Main {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("You must provide an account number");
            System.exit(1);
        }

        ArrayList<Account> accounts = new ArrayList<>();

        AccountManager accountManager = new AccountManager();

        accounts.add(accountManager.createAccount(10001, "John Doe", 7500, 10.0, 4.5));
        accounts.add(accountManager.createAccount(10002, "Jane Doe", 10000, 10.0, false));
        accounts.add(accountManager.createAccount(10003, "Jim Doe", 230000, 5000, 5, 7.5));
        accounts.add(accountManager.createAccount(10004, "James Doe", 1700, 10.0, true));

        int accountNumber = Integer.parseInt(args[0]);

        accounts.stream().forEach(account -> {
            if (account.getAccountNumber() == accountNumber) {
                account.displayAccountDetails();
            }
        });
    }
}
