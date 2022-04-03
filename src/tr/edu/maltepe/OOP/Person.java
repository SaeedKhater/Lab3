package tr.edu.maltepe.OOP;

import java.util.Vector;

public class Person {
    private Vector<Books> Books = new Vector<Books>();
    private int id;
    private String name;


    public Person(String name, String surname, int classroom, int id){
        this.id = id;
        this.name= name;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void takeBook (Books bbook){
        Books.add(bbook);
    }


    public void loanbook(Books lbook){
        Books.remove(lbook);
    }
    public void ShowPersonBooks(){
        System.out.println("");
        System.out.println(name+" took these books :  ");
        for (int i = 0; i< Books.size();i++)
        {
            System.out.println(Books.get(i).getBookname());
        }
    }


}



