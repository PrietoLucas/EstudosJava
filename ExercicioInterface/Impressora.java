package ExercicioInterface;

import java.util.ArrayList;
import java.util.List;

public class Impressora {
    List<Imprimivel> lista = new ArrayList<>();

    public Impressora() {
    }

    public void imprimirTudo(){
        for(int i=0; i < lista.size(); i++){
            lista.get(i).imprimir();
        }
    }
    public void adicionarImprimivel(Imprimivel umImprimivel){
        lista.add(umImprimivel);
    }
}
