package execution;
import base.Person;
import fils.Student;
import fils.Teacher;
public class Main {
public static void main(String[] args) {
    Student maha = new Student("Maha",25,"1",15.5);
    maha.displayInfo();
    maha.study();
    Teacher billel = new Teacher("Billel", 30, "Java Programming", 10);
    billel.displayInfo();
    billel.teach();


    System.out.println("before changes to maha's information");
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
