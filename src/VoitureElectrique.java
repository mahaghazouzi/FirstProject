public class VoitureElectrique extends Voiture {
    private int capaciteBatterie;
    private float autonomie;


    public VoitureElectrique(int id, String name, double price, float maxSpeed, String description,
                             boolean available, int capaciteBatterie, float autonomie) {
        super(id, name, price, maxSpeed, description, available);
        this.capaciteBatterie = capaciteBatterie;
        this.autonomie = autonomie;
    }


    public int getCapaciteBatterie() {
        return capaciteBatterie;
    }

    public void setCapaciteBatterie(int capaciteBatterie) {
        this.capaciteBatterie = capaciteBatterie;
    }

    public float getAutonomie() {
        return autonomie;
    }

    public void setAutonomie(float autonomie) {
        this.autonomie = autonomie;
    }
    void displayMsg() {
        System.out.println("ID: " + getId() +
                ", Nom: " + getName() +
                ", Prix: " + getPrice() +
                ", Vitesse Max: " + getMaxSpeed() +
                ", Description: " + getDescription() +
                ", Disponible: " + isAvailable());
        System.out.println("Capacité de la batterie: " + capaciteBatterie + " kWh");
}}
