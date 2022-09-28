package day18_garbageCollection;

public class BankAccount {

    public String accountHolder;
    public long accountNumber;
    public double balance;

    //sets the accountHolder and accountNumber attributes
    public void setInfo(String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    //displays the full account info
    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance= $" + balance +
                '}';
    }

    //displays the available balance
    public void checkBalance(){
        System.out.println("Your available balance is: $"+balance);
    }

    //increases the balance by the specified amount
    public void deposit(double amount){

        if(amount<1){
            System.out.println("Insufficient amount "+amount);
            return;
        } else if (amount>5000) {
            System.out.println("Limit for one deposit is 5000");
            return;
        }

        System.out.println("Depositing $"+amount+" to "+accountHolder);
        balance+=amount;
    }

    //decreases the balance by the specified amount
    public void withdraw(double amount){

        if(amount>balance){
            System.out.println("Insufficient withdraw amount "+amount);
            return;
        } else if (amount<1) {
            System.out.println("Insufficient withdraw amount "+amount);
            return;
        }else if(amount>500){
            System.out.println("Limit for one withdraw is 500");
            return;
        }

        System.out.println("Withdrawing $"+amount+" from "+accountHolder);
        balance-=amount;
    }

}

/*
2. Create a custom class named BankAccount:
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