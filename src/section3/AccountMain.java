package section3;

import java.util.Scanner;

public class AccountMain {
    public static void main(String[] args) {
        Account account = new Account();
        Scanner sc = new Scanner(System.in);
        System.out.print("입력");
        int amount = sc.nextInt();

        account.deposit(amount);
        account.withdraw(amount);

        account.withdraw(amount);
        account.checkBalance();
    }
}
