package Map;

import java.util.HashMap;
import java.util.Map;

public class MapExemplo {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(4,"Fizemos 4 gols contra você");
        mapa.put(2,"Fizemos 3 gols contra você");
        mapa.put(1,"Fizemos 1 gols contra você");

        for (Integer chave :mapa.keySet()){
            String valor = mapa.get(chave);
            System.out.println(valor);
        }
    }
}
