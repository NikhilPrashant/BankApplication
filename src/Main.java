import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name, Password and Balance to create an account");

        //Create User
        String name = scanner.nextLine();
        String password = scanner.nextLine();
        double balance = scanner.nextDouble();
        SBIUser user = new SBIUser(name, balance, password);

        //Add Money
        System.out.println("Enter amount you want to add");
        int moneyToBeAdded = scanner.nextInt();
        System.out.println(user.addMoney(moneyToBeAdded));

        //Withdraw Money
        System.out.println("Enter amount you want to withdraw");
        int money = scanner.nextInt();
        System.out.println("Enter your password");
        String pass = scanner.next();
        System.out.println(user.withdrawMoney(money, pass));

        //Rate Of Interest
        System.out.println("Enter duration in years for interest to be calculated");
        int years = scanner.nextInt();
        System.out.println(user.calculateInterest(years));
    }
}