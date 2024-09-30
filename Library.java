import java.util.ArrayList;


public class Library {

   private ArrayList<Book>books = new ArrayList<Book>();
   private ArrayList<User>users= new ArrayList<User>();
   
   
   // method add book to the library========================================================================================
   public void addBooks(Book book){ 
   this.books.add(book);
   }

   //method add user==================================================================================================================
   public void addUser(User user){
    this.users.add(user);
   }

   //method searchByTittle===================================================================================================
   public void searchbyTitle(String bookTitle){

   for (Book book :books){
    if (book.getbookTitle().contains(bookTitle) ){
        System.out.println("The book tittle is :" + bookTitle);
    }else {
        System.out.println("There is no book name :" + bookTitle);
    } 
    }
    
   }

   //method borrowBook===================================================================================================
   public void  borrowedBooks( User user, String bookTitle){
      boolean found = false;
    
        for (Book book: books){
           if(book.getbookTitle().equalsIgnoreCase(bookTitle)){
              found = true;
        if(book.getisAvailable()){
             book.setisAvailable(false);
               user.borrowedBooks(book.getbookTitle());

              System.out.println("Book " + bookTitle + " borrowed successfully" );
          } else{
                  System.out.println("Book " + bookTitle + " is currently unavailable.");
            } break;
        }
      }
        
         if (!found){
            System.out.println("Book " + bookTitle + " not found in the library.");
         }
   }
      public void listAvailableBooks() {
        boolean found =false;
        for (Book book : books) {
          if (book.getisAvailable()) {
            System.out.println(book.printBookInfo());
            found = true;
        }
    }
    if (!found) {
      System.out.println("No books are currently available.");
}

}
}

    
   



