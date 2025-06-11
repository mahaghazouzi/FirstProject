public class Chemise {
    public static void main(String[] args) {
    int id ;
    String couleur ;
    float prix;
    String description;
    int quantite;

     public Chemise() {
        this.id = 0;
        this.couleur = "";
        this.prix = 0.0f;
        this.description = "";
        this.quantite = 0;}

    void ajouterChemise(int nombre) {
        quantite += nombre;
    }
    void diminierChemise(int nombre) {
        quantite -= nombre;
    }
    void afficherinfoChemise() {
            System.out.println("ID: " + id +
                    ", Couleur: " + couleur +
                    ", Prix: " + prix + ", Description: " + description +
                    ", Quantité: " + quantite);
        }

        Chemise chemise = new Chemise();
        chemise.couleur = "Bleu";
        chemise.id=1;
        chemise.prix = 0;
        chemise.description = "chemise en couton";
        chemise.quantite = 1;
        System.out.println("information initial :");

        chemise.ajouterChemise(5);
        chemise.afficherinfoChemise();
        chemise.diminierChemise(3);
        chemise.afficherinfoChemise();


}}}
