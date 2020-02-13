package ExemploArray;

import java.util.ArrayList;
import java.util.List;

public class ArrayExemplo {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Lucas");
        lista.add("h");
        lista.add("Lk");

        for(int i=0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }
}
