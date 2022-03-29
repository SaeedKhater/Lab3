package tr.edu.maltepe.OOP;

public class Student {

    private String Name;
    private int ID;
    private String Departmant;
    private String Type;

    public Student(int ID,String Departmant, String Name, String Type){

        this.Departmant=Departmant;
        this.ID=ID;
        this.Name=Name;
        this.Type=Type;


    }

    public int getID() {
        return ID;
    }

    public String getDepartmant() {
        return Departmant;
    }

    public String getName() {
        return Name;
    }
    public String getType(){
        return Type;
    }
    public String giveback( String Type, String Name, String bookname ){
        return Type+" "+Name+" is giving this book= "+bookname;

    }
    public String notAvailable( String Type, String Name, String bookname){
        return Type +" "+Name+" this isnt available for that book = "+bookname;


    }












}

