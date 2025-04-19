
import java.util.Scanner;

public class code3 {static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        boolean isRunning = true;
        int balance=5000;
        while (isRunning) {
            // Display menu
            String display = "** Showing Contents **\n--> 1. Balance\n--> 2. Deposit\n--> 3. Withdrawal\n--> 4. Exit";
            System.out.println(display);

            System.out.print("Press the number: ");
            int i = sc.nextInt();

            // Handle invalid input
            if (i < 1 || i > 4) {
                System.out.println("Enter a valid number (1-4)");
                continue;
            }

            // Menu options
            switch (i) {
                case 1 -> System.out.println("Your current balance is: ₹" + balance);

                case 2 -> {
                    System.out.print("Enter the amount you want to deposit: ");
                    int amount = dep();
                    balance += amount;
                    System.out.println("Deposit successful. Updated balance: ₹" + balance);
                }

                case 3 -> {
                    System.out.print("Enter the amount you want to withdraw: ");
                    int amount = wedr();
                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawal successful. Updated balance: ₹" + balance);
                    } else {
                        System.out.println("Insufficient balance.");
                    }
                }

                case 4 -> {
                    isRunning = false;
                    System.out.println("Exiting... Thank you!");
                }
            }
        }
    }

    // Deposit method
    static int dep() {
        int d = sc.nextInt();
        while (d <= 0) {
            System.out.print("Cannot deposit negative or zero amount. Enter again: ");
            d = sc.nextInt();
        }
        return d;
    }

    // Withdraw method
    static int wedr() {
        int w = sc.nextInt();
        while (w <= 0) {
            System.out.print("Cannot withdraw negative or zero amount. Enter again: ");
            w = sc.nextInt();
        }
        return w;
    }
}

