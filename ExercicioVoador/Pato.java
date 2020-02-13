package ExercicioVoador;

public class Pato implements Voador {
    private int energia;

    public Pato(int energia) {
        this.energia = energia;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public void voar() {
        if(this.energia>=5){
            this.energia-=5;
            System.out.println("Estou Voando como um Pato!");
        } else {
            System.out.println("Não há energia suficiente!");
        }
    }
}
