public class Account {
  private double balance = 0.00;
  
  public Account() {
    System.out.println("New Account Created Successfully.");
    inquire();
  }
  
  public Account(double balance) {
    this.balance = balance;
    System.out.println("New Account Created Successfully.");
    inquire();
  }
  
  public void inquire() {
    System.out.printf("Current Balance = %f$\n", this.balance);
  }
  
  public void add(double amount) {
    this.balance += amount;
    System.out.println("balance added successfully.");
    inquire();
    
  }
  
  public boolean withdraw(double amount) {
    if (amount > this.balance) {
      this.balance -= 5.00;
      System.out.println("Unable to withdraw, withdrawal amount is greater than current balance. 5$ has been deducted as penalty.");
      inquire();
      return false;
    } else {
      this.balance -= amount;
      System.out.println("Withdrawal successful.");
      inquire();
      return true;
    }
  }
  //interest computation method
}
