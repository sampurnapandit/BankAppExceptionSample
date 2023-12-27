
import java.util.Scanner;

public class BankAppException{
    public static void main(String[] args) {
        int balance, option; //declaration
        Scanner sc = new Scanner(System.in);//Scanner object creation
        System.out.println("Enter balance to create account");
        balance = sc.nextInt();
        Account acc = new Account(balance); //creating account object
        System.out.println("Enter \n1 to withdraw amount\n2 to deposit amount\n0 to exit");
        option = sc.nextInt();
        while (option == 1 || option == 2) {//only two options available 1.withdraw and 2.deposit
            if (option == 1)
                acc.withdraw();
            else if (option == 2)
                acc.deposit();
            System.out.println("Enter\n1 to withdraw amount\n2 to deposit amount\n0 to exit");
            option = sc.nextInt();
        }
    }

}

class Account {//store the account balance 
    int balance;
    Scanner sc = new Scanner(System.in);
    public Account(int balance){
	this.balance=balance;
	}
    void withdraw() {
        int amount;
        System.out.println("Enter amount to be withdrawn");
        amount = sc.nextInt();
        try {
            if (amount < 1)
                throw new InvalidAmountException();
            else if (amount > balance)
                throw new  InsufficientBalanceException();
            else {
                balance -= amount;
                System.out.println("Amount withdrawn, Current Balance= " + balance);
            }
        } catch (InvalidAmountException i) {
            System.out.println(i.getMessage());
        } catch (InsufficientBalanceException m) {
            System.out.println(m.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
    }

    void deposit() {
        int amount;
        System.out.println("Enter amount to be deposited");
        amount = sc.nextInt();
        try {
            if (amount < 1)
                throw new InvalidAmountException();
	 else {
                balance += amount;
                System.out.println("Amount deposited, Current Balance= " + balance);
            }
	}
         catch (InvalidAmountException i) {
            System.out.println(i.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occured");
        }
    }

}

class InvalidAmountException extends Exception {//thrown when amount<1
    public String getMessage() {
        return "Entered amount is invalid";
    }
}

class InsufficientBalanceException extends Exception { //thrown when amount>balance
    public String getMessage() {
        return "Entered amount is more than current balance, amount withdraw failed";
    }
}