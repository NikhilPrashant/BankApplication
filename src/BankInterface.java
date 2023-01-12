public interface BankInterface {
    double checkBalance();
    String addMoney(int amount);
    String withdrawMoney(int amount, String Password);
    double calculateInterest(int years);
}
