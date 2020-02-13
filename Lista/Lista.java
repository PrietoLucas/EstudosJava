package Lista;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        lista.add("Alberto");
        lista.add("Lucas");
        lista.add("José");

        for(String valor :lista){
            System.out.println(valor);
        }
    }
}
