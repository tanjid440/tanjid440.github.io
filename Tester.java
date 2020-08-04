
public class Tester {
  
  public static void main(String[] args) {
    Bank b1 = new Bank();
    b1.printBalance();
    b1.deposite(50.00, "c");
    b1.withdraw(40.00, "c");
    b1.transfare(30.00, "c");
  }
  
}
