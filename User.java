import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//import java.util.*;
//import java.time.Period;

public class User{
    private String name;
    private int age;
    private ArrayList<String> borrowedBooks;
    private Map<String, LocalDate> borrowedBooksDueDates;

//constructor =============================================================================================================================
public User(String name, int age){
    this.name=name;
    this.age=age;
    this.borrowedBooks = new ArrayList<>();
    this.borrowedBooksDueDates = new HashMap<>();
}


//set======================================================================================================================================
 public void setName(String name){
    this.name=name;
 }
 
 public void setAge(int age){
    this.age=age;
 }

 //get====================================================================================================================

 public String getName(){
    return name;
   }
 
 public int getAge(){
    return age;
 }

///method borrowed book title============================================================================================
 public void borrowedBooks(String bookTitle){ 

    borrowedBooks.add(bookTitle);
    LocalDate dueDate = LocalDate.now().plusDays(14);
    borrowedBooksDueDates.put(bookTitle, dueDate);
    System.out.println("Book borrowed: " + bookTitle + "DUe date is : " + dueDate.format(DateTimeFormatter.ofPattern("MMM-dd-yyyy")));
    
 }

 //method return book tittle============================================================================================
 public void returnBooks( String bookTitle) {

    if (borrowedBooks.remove(bookTitle)) {
        System.out.println("Book returned: " + bookTitle);
    } else {
        System.out.println("Not Return it back.");
    }
    
}
//method check due date==========================================================================================
public void checkDueDates(){
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
   
   for (String book:borrowedBooks){
      LocalDate dueDate = borrowedBooksDueDates.get(book);

      System.out.println("Book tittle is : " + book + "Due date is : " + dueDate.format(formatter));
}
}

//method borrowedbooksduedateMap==========================================================================================
public void overDueBooks(){
    }

 //method print borrowed book tittle============================================================================================
 public void printBorrowedBooks(){ 
    System.out.println("Borrowed Books: " + borrowedBooks);
}

}



