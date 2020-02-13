package ExercicioVoador;

public class MainVoadores {
    public static void main(String[] args) {
        Pato pato = new Pato(5);
        Aviao aviao = new Aviao(0);
        Superhomem sp1 = new Superhomem(0);
        TorreDeControle torre1 = new TorreDeControle();

        torre1.adicionarVoador(pato);
        torre1.adicionarVoador(aviao);
        torre1.adicionarVoador(sp1);

        torre1.voemTodos();
    }
}
