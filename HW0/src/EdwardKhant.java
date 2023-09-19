class EdwardsPerson {
    private String lastName, firstName;
    private int age;
    private char midInitial;

    public void setLastName(String lastName){this.lastName=lastName;}
    public void setFirstName(String firstName){this.firstName=firstName;}
    public void setAge(int age){this.age=age;}
    public void setMidInitial(char midInitial){this.midInitial=midInitial;}

    public String getLastName(){return this.lastName;}
    public String getFirstName(){return this.firstName;}
    public int getAge(){return this.age;}
    public char getMidInitial(){return this.midInitial;}

    public EdwardsPerson(String lastName, String firstName, int age, char midInitial){this.lastName=lastName;this.firstName=firstName;this.age=age;this.midInitial=midInitial;}
    public EdwardsPerson(){this("LAST NAME","FIRST NAME",0,'M');}

    public void getInfo(){System.out.println("Last Name : "+this.lastName); System.out.println("First Name : "+this.firstName); System.out.println("Age : "+this.age); System.out.println("Middle Initial : "+this.midInitial);}
}

interface BioBeing{public void breath();}

interface Entity{public final static int bioMass = 50; public default void letThereBeMass(){System.out.println("This student has masssss!");};}

class Student extends EdwardsPerson implements BioBeing,Entity{
    private int studentID;
    public void setStudentID(int studentID){this.studentID=studentID;}
    public int getStudentID(){return this.studentID;}
    Student(int studentID){super("STUDENT_LAST_NAME","STUDENT_FIRST_NAME",0,'M');this.studentID=studentID;}
    Student(){super("STUDENT_LAST_NAME","STUDENT_FIRST_NAME",0,'M');this.studentID=0;}

    public void breath(){System.out.println("This student is breathing!");}

    public void getInfo(){System.out.println("Student \""+super.getFirstName()+" "+super.getLastName()+"\" has student ID of "+this.getStudentID()+" with "+Entity.bioMass+".");this.breath();this.letThereBeMass();}
}
public class EdwardKhant{
    public static void main(String[] args){
        EdwardsPerson person1 = new EdwardsPerson();
        person1.getInfo();
        EdwardsPerson person2 = new Student();
        person2.getInfo();
    }
}
