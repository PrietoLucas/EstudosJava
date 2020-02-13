package ExercicioVoador;

public class Superhomem implements Voador {
    private int experiencia;

    public Superhomem(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public void voar() {
        this.experiencia += 3;
        System.out.println("Estou voando como um heroi!");
    }
}
