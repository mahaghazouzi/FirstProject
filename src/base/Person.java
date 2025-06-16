package base;

public class Person {
   private String name;
   int a,b;
   private int age;
   private static int totalPersons =0 ;
   private final int MAX_AGE = 120;

   public Person(String name, int age) {
         this.name = name;
         this.age = age;
   }
    public String getName() {
            return name;
    }
    public void setName(String name) {
            this.name = name;
    }
    public int getAge() {
            return age;
    }
    public int getMaxAge() {
            return MAX_AGE;
    }
    public static int min(int a, int b) {
            if (a < b) {
                return a;
            } else {
                return b;
            }
    }
    public void setAge(int age) {
            this.age = age;
    }

    public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age+"nombre of persons "+totalPersons);
    }
}
