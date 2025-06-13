public class VoitureEssance extends Voiture {
    private float capaciteReservoir;
    private String typeCarburant;
    private int id;
    private String name;
    private double price;
    private float maxSpeed;
    private String description;
    private boolean available;

    // Constructeur
    public VoitureEssance(int id, String name, double price, float maxSpeed, String description,
                          boolean available, float capaciteReservoir, String typeCarburant) {
        super(id, name, price, maxSpeed, description, available);
        this.capaciteReservoir = capaciteReservoir;
        this.typeCarburant = typeCarburant;
    }

    // Getters et Setters
    public float getCapaciteReservoir() {
        return capaciteReservoir;
    }

    public void setCapaciteReservoir(float capaciteReservoir) {
        this.capaciteReservoir = capaciteReservoir;
    }

    public String getTypeCarburant() {
        return typeCarburant;
    }

    public void setTypeCarburant(String typeCarburant) {
        this.typeCarburant = typeCarburant;
    }

    // Redéfinition de la méthode displayMsg
    @Override
    void displayMsg() {
        System.out.println("ID: " + getId() +
                ", Nom: " + getName() +
                ", Prix: " + getPrice() +
                ", Vitesse Max: " + getMaxSpeed() +
                ", Description: " + getDescription() +
                ", Disponible: " + isAvailable());
        System.out.println("Capacité du réservoir: " + capaciteReservoir + " litres");}}
