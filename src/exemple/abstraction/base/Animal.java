package exemple.abstraction.base;

public abstract class Animal {
    protected String nom;
    public Animal(String nom) {
        this.nom = nom;
    }
    public void dormir(){
        System.out.println(nom+" dort...");
    }
    public abstract void crier();

}
