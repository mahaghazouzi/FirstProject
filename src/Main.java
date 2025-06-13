//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        VoitureElectrique tesla = new VoitureElectrique(1, "Tesla Model 3", 45000.0, 250.0f,
                "Voiture électrique performante", true, 75, 500.0f);

        VoitureEssance toyota = new VoitureEssance(2, "Toyota Corolla", 25000.0, 180.0f,
                "Voiture essence fiable", true, 50.0f, "SP95");


        tesla.displayMsg();
        toyota.displayMsg();


    }
}
