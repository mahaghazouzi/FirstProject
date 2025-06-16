package tableau;

public class ExerciceTableau {
    int id ;
    String []listeNoms;
    int [] listeNotes;


    public static void main (String []args) {
        ExerciceTableau exercice = new ExerciceTableau();
        exercice.listeNoms = new String[]{"Maha", "Malek", "Sahar"};
        exercice.listeNotes = new int[]{14, 17, 13};
//        System.out.println("Nom : " + exercice.listeNoms[0] + " , Note : " + exercice.listeNotes[0]);
//        System.out.println("Nom : " + exercice.listeNoms[1] + " , Note : " + exercice.listeNotes[1]);
//        System.out.println("Nom : " + exercice.listeNoms[2] + " , Note : " + exercice.listeNotes[2]);
        System.out.println("/*********Affichage du tableau des noms et notes*********/");
        for (int i = 0; i < exercice.listeNoms.length;i++){

            System.out.println("Nom : " + exercice.listeNoms[i]+" - Note : " + exercice.listeNotes[i]);
        }




}}
