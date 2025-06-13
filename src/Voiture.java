public class Voiture {
    private int id;
    private String name;
    private double price;
    private float maxSpeed;
    private String description;
    private boolean available;


    public Voiture() {
    }


    public Voiture(int id, String name, double price, float maxSpeed, String description, boolean available) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.description = description;
        this.available = available;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }


    void displayMsg() {
        System.out.println("Ceci est une voiture : " + name);
    }


}
