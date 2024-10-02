package Banking;
import java.util.Scanner;

public class Banking {
   String name;
   double balance = 7900;


   public void depositing(double amount){ //adding new amount
    balance =  balance + amount;

   }

   public void withdrawing(double amount){  // tolak amount dari bank

    if ( balance>=amount ){
    amount = balance- amount;

    }else {
        System.out.println("You do not have enough money to withdraw");
        
    }

   }

   public void CheckBalance(double balance){
    System.out.println("You Balance is :" + balance);

   }


   public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("==================Deposit==================");
    System.out.println("\nPlease Enter Your Amount : ");
    double deposit= scanner.nextDouble();

    System.out.println("==================Withdrawal==================");
    System.out.println("\nPlease Enter Your Amount : ");
    double withdraw= scanner.nextDouble();


   }

 
    }

