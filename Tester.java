public class Tester {
  public static void main(String args[]) {
    BankAccount test = new BankAccount(100, "pswd");

    System.out.println(test.getBalance());    //0.0

    System.out.println(test.getAccountID());  //100

    test.setPassword("newpswd");

    System.out.println(test.deposit(0));      //true
    System.out.println(test.getBalance());    //0.0

    System.out.println(test.deposit(-27.5));  //false
    System.out.println(test.getBalance());    //0.0

    System.out.println(test.deposit(38.5));    //true
    System.out.println(test.getBalance());     //38.5

    System.out.println(test.withdraw(-564));   //false
    System.out.println(test.getBalance());     //38.5

    System.out.println(test.withdraw(0));      //true
    System.out.println(test.withdraw(54));     //false
    System.out.println(test.withdraw(38));     //true
    System.out.println(test.getBalance());     //0.5

    System.out.println(test.toString());       // return 100    0.5
  }
}
