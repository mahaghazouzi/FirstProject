package exemple.abstraction;

import exemple.abstraction.base.Animal;

public class Chien extends Animal {
    public Chien(String nom) {
        super(nom);
    }

    @Override
    public void crier() {
        System.out.println(nom+" : Aboie , HabHab");
    }


}
