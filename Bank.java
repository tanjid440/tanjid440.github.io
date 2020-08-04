public class Bank {
  private Account savings = new Account();
  private Account checking = new Account();
  
  public void deposit(double amount, String account) {
    switch (account) {
      case "s":
        this.savings.add(amount);
        break;
      case "c":
        this.checking.add(amount);
        break;
      default:
        System.err.println("Invalid account string!");
        break;
    }
  }
  
  public void withdraw(double amount, String account) {
    switch (account) {
      case "s":
        this.savings.withdraw(amount);
        break;
      case "c":
        this.checking.withdraw(amount);
        break;
      default:
        System.err.println("Invalid account string!");
        break;
    }
  }
  
  public void tranfare(double amount, String account) {
    switch (account) {
      case "s":
        if (this.savings.withdraw(amount)) {
          this.checking.add(amount);
        } else {
          System.err.println("Transfare Failed!");
        }
        break;
      case "c":
        if (this.checking.withdraw(amount)) {
          this.savings.add(amount);
        } else {
          System.err.println("Transfare Failed!");
        }
        break;
      default:
        System.err.println("Invalid account string!");
        break;
    }
  }
  
  public void printBalance() {
    System.out.printf("Savings Account ");
    this.savings.inquire();
    System.out.printf("Checking Account ");
    this.savings.inquire();
  }
}
