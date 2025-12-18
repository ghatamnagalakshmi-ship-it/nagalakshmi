import java.util.*;

class Bank {
  double amount;

  Bank(double amount) {
    this.amount = amount;
  }

  void withdraw(double withdrawalAmount) {
    String message = (withdrawalAmount <= amount) ? "withdrawl successful" : "insufficient balance";
    System.out.println(message);
    amount = (withdrawalAmount <= amount) ? amount - withdrawalAmount : amount;
  }

  void deposit(double depositAmount) {
    amount = amount + depositAmount;
  }

  void print() {
    System.out.println(amount);
  }

}

public class Assexample1 {
  public static void main(String[] args) {
    Bank b = new Bank(10000);
    b.withdraw(12000);
    b.deposit(5000);
    b.print();

  }
}
