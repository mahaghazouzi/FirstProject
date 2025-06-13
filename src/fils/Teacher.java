package fils;
import base.Person;
public class Teacher extends Person {

        private String courseName;
        private int yearsOfExperience;
        public Teacher(String name,int age,String courseName,int yearsOfExperience){
            super(name,age);
            this.courseName = courseName;
            this.yearsOfExperience = yearsOfExperience;


        }
        public String getCourseName(){
            return courseName;

        }
        public void setCourseName(String courseName){
            this.courseName = courseName;

        }
        public double getYearsOfExperience(){
            return yearsOfExperience;
        }
        public void setYearsOfExperience(int yearsOfExperience){
            this.yearsOfExperience = yearsOfExperience;
        }

        public void displayInfo() {

            System.out.println("Nom : " + getName() + ", age : " + getAge() +" ,Course name: " + courseName + ", Years of experience : " + yearsOfExperience);
        }
        public void teach(){
            System.out.println("I am "+getName()+" and i am teaching Java right now!");
            System.out.println("/********************************/");
        }
    }

