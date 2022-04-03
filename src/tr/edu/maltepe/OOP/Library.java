package tr.edu.maltepe.OOP;

import java.util.Vector;

public class Library {
    private Vector books;
    public Library(){
        books =new Vector();
    }
    public void addBook (Books abook){
        books.add(abook);
    }

    public void removeBook(Books rbook){
        books.remove(rbook);
    }

    public void list_Books (){
        for (int i=0; i< books.size();i++ ){
            Books temp = (Books) books.get(i);
            System.out.println(temp.getBookname());
        }
    }

    public void loanBook(Person person, Books book){
        if (books.contains(book))
        {
            person.takeBook(book);
            removeBook(book);
            System.out.println(person.getName()+ " take the " +book.getBookname()+ " book");
            System.out.println(" ");

        }
        else{
            System.out.println(book.getBookname()+ " is not available in the library now.");
            System.out.println(" ");
        }
    }
    public void give_Back_Book(Person person, Books Book){
        person.loanbook(Book);
        addBook(Book);
        System.out.println( person.getName()+ " return the " + Book.getBookname()+" book to the library.");
        System.out.println(" ");
    }
}


