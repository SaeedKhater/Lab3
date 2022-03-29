package tr.edu.maltepe.OOP;

public class Professor {

    private int ID;
    private String Type;
    private String Name;

    public Professor (int ID, String Type, String Name){
        this.ID=ID;
        this.Name=Name;
        this.Type=Type;
    }
    public int getPID(){
        return ID;
    }
    public String getType(){
        return Type;
    }
    public String getName(){
        return Name;
    }

    public String land(String Type, String Name, String bookname){
        return Type +" "+Name+" will be giving back this book =  "+bookname;

    }
}
