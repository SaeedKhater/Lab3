package tr.edu.maltepe.OOP;

public class Library {

    private int ID;
    private String namebook;
    private String Type;

    public Library(int ID, String namebook){

        this.ID=ID;
        this.namebook=namebook;
        this.Type=Type;
    }

    public Library() {

    }

    public int getID(){
        return ID;
    }
    public String getType(){
        return Type;
    }
    public String getNamebook(){
        String getNamebook = new String();
        return getNamebook;
    }

    public String tookthisbook(String namebook, String Type, int id) {
        return namebook+" "+namebook+" The student took programming book " ;
    }
    public String returnittothelib(String namebook, String Type, int ID){
        return namebook+" "+namebook+" The student return it back to the lib";
    }
    public String cannottakeit(String namebook, String Type, int id){
        return namebook+" "+namebook+" Programming book isnt available in the lib";
    }
}

