public class Book {
    private String bookTitle;
    private String author;
    private String isbn;
    private boolean isAvailable;

    //constructor for book ===========================================================================================================
    public Book(String bookTitle, String author, String isbn, boolean isAvailable){
    this.bookTitle= bookTitle;
    this.author = author;
    this.isbn=isbn;
    this.isAvailable= isAvailable;
    }

    //set======================================================================================================================================
    public void setbookTitle(String bookTitle){
    this.bookTitle=bookTitle;
    }

    public void setauthor(String author){
    this.author=author;
    }

    public void setisbn(String isbn){
    this.isbn=isbn;
    }

    public void setisAvailable(boolean isAvailable){
    this.isAvailable=isAvailable;
    }


    //get====================================================================================================================/
    public String getbookTitle(){
        return bookTitle;
     }
    
     public String getAuthor(){
        return author;
     }
    
     public String getisbn(){
        return isbn;
     }
    
     public boolean getisAvailable(){
        return isAvailable;
     }


    // method printbookInfo=====================================================================================================
    public String printBookInfo(){
   return ("Book title is : " + bookTitle + "Author" + author + " ISBN is : " + isbn + " Is it available ? : " + isAvailable);
 }
    
}
