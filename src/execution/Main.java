package execution;
import base.Person;
import fils.Student;
import fils.Teacher;
public class Main {
    public static int somme (int a, int b){
        return a + b;
    }
    public static int somme(int a, int b, int c){
        return a + b+c;
    }
public static void main(String[] args) {


    System.out.println("le min = "+Person.min(5,10));
    Person p = new Student("Maha", 25, "1", 15.5);
    p.parle();
    Student maha = new Student("Maha",25,"1",15.5);
    maha.displayInfo();
    maha.study();
    Teacher billel = new Teacher("Billel", 30, "Java Programming", 10);
    billel.displayInfo();
    billel.teach();


    System.out.println("before changes to maha's information");
    Main m = new Main();
    System.out.println(somme(5,15));
    System.out.println(somme(5,15,10));



    maha.displayInfo();
    maha.setName("Amal");
    maha.setAge(26);
    maha.setStudentId("2");
    maha.setAverageScore(17.0);

    System.out.println("/********************************/");
    System.out.println("after changing maha's information");
    maha.displayInfo();



    System.out.println("before changing the teacher informations");
    billel.displayInfo();
    billel.setName("Ahmed");
    billel.setCourseName("Python Programming");
    billel.setYearsOfExperience(12);
    billel.setAge(32);
    System.out.println("/********************************/");
    System.out.println("after changing the teacher informations");
    billel.displayInfo();



}
}
