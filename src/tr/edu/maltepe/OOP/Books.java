package tr.edu.maltepe.OOP;


public class Books {



    private int bookID;
    private String BookName;

    public Books(int bookID,String BookName){
        this.bookID=bookID;
        this.BookName=BookName;
    }




    public String getBookName() {
        return BookName;
    }
    public int getBookID(){return bookID;}


    public String getBooKname() {

        return BookName;
    }
}
