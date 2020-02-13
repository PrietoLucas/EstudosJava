package ExercicioVoador;

public class Aviao implements Voador {
    private int horasV;

    public Aviao(int horasV) {
        this.horasV = horasV;
    }

    public int getHorasV() {
        return horasV;
    }

    public void setHorasV(int horasV) {
        this.horasV = horasV;
    }

    @Override
    public void voar() {
        this.horasV += 13;
        System.out.println("Estou voando como um avião!");
    }
}
