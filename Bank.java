import java.util.Calendar;
import java.util.Scanner;


class BankAccount {

    //instances
    private String HolderName;
    private int securityPin;
    private int Age;
    private String AccountNumber;
    private double Balance=0;

    //Methods
    public BankAccount(String name, int pin, int Born){
        long acc = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        AccountNumber = Long.toString(acc);
        HolderName = name;
        securityPin = pin;
        Age = Calendar.getInstance().get(Calendar.YEAR) - Born;
    }

    public boolean Authenticate(int input){
        return input == securityPin;
    }
    public void Display(){
        System.out.println("Account Holder Name: "+HolderName);
        System.out.println("Account Number: "+AccountNumber);
        System.out.println("Age: "+Age);
        System.out.println("Balance: "+Balance);
    }
    public boolean Deposit(Double value){
        if (value <= 0){
            return false;
        }
        Balance += value;
        System.out.println("Successfully Deposited "+value+" Rs.");
        System.out.println("New account balance is :"+Balance+" Rs.");
        return true;
    }
    public void Balance(){
        System.out.println("Balance: "+Balance);
    }
    public boolean Withdraw(double amount){
        if(amount <= 0 || amount > Balance) return false;
        else {
            Balance -= amount;
            System.out.println("Withdrew "+amount+" Rs.\nYou have "+Balance+" Rs. Balance in your account.");
            return true;
        }
    }
    public void ChangePin(int p){
        securityPin = p;
    }
}


public class Bank {
    public static void main(String[] args) {
        BankAccount ayan = new BankAccount("Ayan", 3950, 2003);
        System.out.println("Enter the pin: ");
        Scanner sc = new Scanner(System.in);
        int pin = sc.nextInt();
        if (ayan.Authenticate(pin)) {
            boolean flag = true;
            while (flag) {
                System.out.println("1. Check Balance\t2. Deposit\t3. Display Details\n4. Withdraw\t5. Change Pin\t6. Exit");
                int option = sc.nextInt();
                Double amount;
                switch (option){
                    case 1:
                        ayan.Balance();
                        break;
                    case 2:
                        System.out.println("Enter the amount: ");
                        amount = sc.nextDouble();
                        ayan.Deposit(amount);
                        break;
                    case 3:
                        ayan.Display();
                        break;
                    case 4:
                        System.out.println("Enter the amount: ");
                        amount = sc.nextDouble();
                        if (ayan.Withdraw(amount));
                        else System.out.println("Could not complete your request.");
                        break;
                    case 5:
                        System.out.println("Enter previous pin:");
                        int p = sc.nextInt();
                        if (ayan.Authenticate(p)){
                            System.out.println("Enter you new pin: ");
                            p = sc.nextInt();
                            ayan.ChangePin(p);
                            System.out.println("Pin changed successfully !");
                            break;
                        }
                    case 6:
                        flag = false;
                        break;
                }
            }
        }
        else {
            System.out.println("You entered the wrong security pin.\nPlease try again. Arigato!!");
        }
    }
}
