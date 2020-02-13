package ExercicioVoador;

import ExercicioInterface.Imprimivel;

import java.util.ArrayList;
import java.util.List;

public class TorreDeControle {
    List<Voador> lista = new ArrayList<>();

    public void adicionarVoador(Voador umVoador){
        lista.add(umVoador);
    }

    public void voemTodos(){
        for(int i=0; i < lista.size(); i++){
            lista.get(i).voar();
        }
    }
}
