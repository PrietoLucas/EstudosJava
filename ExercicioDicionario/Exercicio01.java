package ExercicioDicionario;

import java.util.HashMap;
import java.util.Map;

public class Exercicio01 {
    public static void main(String[] args) {
        Map<Integer, String> dicionario = new HashMap<>();
        Map<String, String> apelidos = new HashMap<>();

        dicionario.put(0,"Ovos");
        dicionario.put(1,"Água");
        dicionario.put(2,"Escopeta");
        dicionario.put(3,"Cavalo");
        dicionario.put(4,"Dentista");
        dicionario.put(5,"Fogo");
        apelidos.put("João", "Juan, Fissura, Maromba");
        apelidos.put("Miguel","Night Watch, Bruce Wayne, Tampinha");
        apelidos.put("Maria","Wonder Woman, Mary, Marilene");
        apelidos.put("Lucas","Lukinha, Jorge, George");

        for (Integer chave :dicionario.keySet()){
            String valor = dicionario.get(chave);
            System.out.println(valor);
        }

        for (String chave :apelidos.keySet()){
            String valor = apelidos.get(chave);
            System.out.println(valor);
        }
    }
}
