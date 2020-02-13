package ExercicioJogador;

public class SessaoDeTreinamento {
    private int experiencia;

    public SessaoDeTreinamento(){

    }

    public SessaoDeTreinamento(int experiencia){
        this.experiencia = experiencia;
    }

    public void treinarA(JogadorFutebol jogadorFutebol){
        System.out.println("Experiencia Inicial: "+jogadorFutebol.getExperiencia());
        this.experiencia = jogadorFutebol.getExperiencia();

        jogadorFutebol.correr();
        jogadorFutebol.fazerGol();
        jogadorFutebol.correr();

        this.experiencia ++;
        jogadorFutebol.setExperiencia(this.experiencia);

        System.out.println("Experiencia Final: " +jogadorFutebol.getExperiencia());
    }
}
