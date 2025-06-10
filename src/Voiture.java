public class Voiture {
    private int id;
    private String name;
    private double price;
    private float maxSpeed;
    private String description;
    private boolean available;

    public static void main(String[] args) {
        Voiture voiture = new Voiture();
        voiture.displayMsg();
    }

    void displayMsg() {
        System.out.println("this is my first program in java ");


    }


}
