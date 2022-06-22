package SelfPractice.day17_customClass;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }// we did not set balance because it will be set after user deposit

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }


    public void checkBalance(){
        System.out.println("Your available balance is: $"+ balance);
    }

    // we just need the increase the value of balance so we do not need to return any value so we set return type as void method
    public void deposit(double amount ){

        if(amount<1){
            System.out.println("Insufficient amount: " +amount);
            return;//exit/terminate the method
        }
        System.out.println("Depositing "+amount+" to "+accountHolder);
        balance+=amount;
    }

    public void withdrawl(double amount){
        if (amount>balance){
            System.out.println("Insufficient withdrawl amount: "+amount);
            return;
        }
        System.out.println("Withdrawing "+amount+" from "+accountHolder);
        balance-=amount;
    }



}
/*
Create a custom class named BankAccount:
            Attributes:
                1. accountHolder
                2. accountNumber
                3. balance

            Actions:
                1. setInfo(): sets the accountHolder and accountNumber attributes

                2. toString(): displays the full account info

                3. checkBalance():displays the available balance

                4. deposit(amount): increases the balance by the specified amount

                5. withdraw(amount): decreases the balance by the specified amount
 */