import java.util.Scanner;
//coding hard that learn so mcuh thing todayy yeayy congratss dearselff  2/10/2024 :)

public class Banking {
   String name;
   double balance=9500;
   double amount;


   public double depositing(){ //adding new amount 
    balance =  balance + amount; // if dont hv void need to return value
    System.out.println("Your current balance is : "+ balance);
    return balance;
   }

   public double withdrawing(){  // tolak amount dari bank

    if ( balance>=amount ){
    balance = balance- amount;
    System.out.println("Your current balance is : "+ balance);
    }else {
        System.out.println("You do not have enough money to withdraw");
        
    }
    return amount;

   }

   public void CheckBalance(){
    System.out.println("==================Balance==================");
    System.out.println("Your Balance is :" + balance);

   }


   public static void main (String[]args){

    while(true){
    System.out.println("\n========================What u want to do today?? Choose One Option======================== ");
    System.out.println("a: Check Account Balance");
    System.out.println("b: Withdrawing");
    System.out.println("c:Deposit");
    Scanner scanner = new Scanner(System.in);
    String choice = scanner.nextLine();
    Banking bank= new Banking();  // setiap kali nk guna meyhod kena create new object kat main method, so sbb dh buat ni kau boleh panggilcheck balance method
   
        switch (choice){
            case "a":
                bank.CheckBalance();  // tempat kau create tadii bank tu . kan dengan nama method
                break;

            case "b":
                System.out.println("\n==================Withdraw==================");
                System.out.println("Please Enter Your Amount : ");
                bank.amount= scanner.nextDouble(); // kita guna bank.amount sbb nk bagi nilai amount tu dalam bank balik, so baru dia update balance :>
                bank.withdrawing();
                break;

            case "c":
                System.out.println("\n==================Deposit==================");
                System.out.println("Please Enter Your Amount : ");
                bank.amount= scanner.nextDouble();
                bank.depositing();
                break;
            default:


            }  
            
        } 
   }

   }

 
    

