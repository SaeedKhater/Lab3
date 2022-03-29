package tr.edu.maltepe.OOP;


public class Main {



    public static void main(String[] args) {

        Professor prf1 = new Professor(1, "Teacher",  "1:");
        Professor prf2 = new Professor(2, "Teacher",  "2:");
        Student std1 = new Student(1, "Student",  "Student 1", "This");
        Student std2 = new Student(2, "Student",  "Student 2", "This");
        Books bk1 = new Books(1,"Mathematics" );
        Books bk2 = new Books(2,"Science");
        Books bk3 = new Books(3, "Programming");
        Library lib1 = new Library(1,"Mathmatics"  );
        Library lib2 = new Library(2,"Programming");
        Library lib3 = new Library(3, " DATA");
        System.out.println(std1.giveback(std1.getType() , std1.getName(), bk1.getBooKname()));
        System.out.println(prf1.land(prf1.getType() , prf1.getName(),bk2.getBookName()));
        System.out.println(std2.notAvailable(std2.getType() , std2.getName(), bk3.getBookName()));
        System.out.println(lib1.tookthisbook(lib1.getNamebook() , lib1.getType() , lib1.getID()));
        System.out.println(lib2.cannottakeit(lib2.getNamebook() , lib2.getType() , lib2.getID()));
        System.out.println(lib3.returnittothelib(lib3.getNamebook(), lib3.getType(), lib3.getID()));



    }

    private static class println extends Library {
        public println(String giveback) {
            super();
        }
    }
}
