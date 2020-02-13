package ExercicioJogador;

public class MainExJogador {
    public static void main(String[] args) {
        JogadorFutebol jogador1 = new JogadorFutebol("Jose", 100, 100,0,3);
        JogadorFutebol jogador2 = new JogadorFutebol("Pele",100,100,0,1);

        SessaoDeTreinamento treino1 = new SessaoDeTreinamento();

        System.out.println("----Jogador 1----");
        treino1.treinarA(jogador1);

        System.out.println("----Jogador 2----");
        treino1.treinarA(jogador2);
    }
}
