package tr.edu.maltepe.OOP;


public class main  {
    public static void main(String[] args) {
        Books booka, bookb, bookc;
        Library library = new Library();

        Professor professor  = new Professor("Ensar","GUL",2,2022);
        Student student = new Student("Saeed","Tariq",2,190704801);

        booka = new Books("Java");
        bookb = new Books("C programming");
        bookc = new Books("Python");

        library.addBook(booka);
        library.addBook(bookb);
        library.addBook(bookc);

        System.out.println("Available books in the library:");

        library.list_Books();
        System.out.println(" ");

        library.loanBook(professor,booka);
        library.loanBook(student,bookb);

        library.loanBook(student,booka);

        library.give_Back_Book(professor,booka);
        library.loanBook(professor,bookc);

        library.loanBook(student,booka);
        library.give_Back_Book(student,bookb);


        System.out.println("Library Now:");
        library.list_Books();
        professor.ShowPersonBooks();
        student.ShowPersonBooks();
    }

}


















