package exemple.abstraction.execution;

import exemple.abstraction.Chien;
import exemple.abstraction.base.Animal;
import exemple.abstraction.fils.Chat;

public class Main {
    public static void main (String []args){

        Animal chat = new Chat("MIMI");
        Animal chien = new Chien("REX");
        chat.crier();
        chien.crier();







    }
}
