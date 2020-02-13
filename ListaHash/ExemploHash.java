package ListaHash;

import java.util.HashSet;
import java.util.Set;

public class ExemploHash {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>();

        conjunto.add("Fácil");
        conjunto.add("Dificil");
        conjunto.add("Normal");

        for (String valor :conjunto){
            System.out.println(valor);
        }
    }
}
