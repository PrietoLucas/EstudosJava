package ExercicioInterface;

public class Foto implements Imprimivel {
    private String nomeF;
    private String tipoF;

    public Foto(String nomeF, String tipoF) {
        this.nomeF = nomeF;
        this.tipoF = tipoF;
    }

    public String getNomeF() {
        return nomeF;
    }

    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }

    public String getTipoF() {
        return tipoF;
    }

    public void setTipoF(String tipoF) {
        this.tipoF = tipoF;
    }

    @Override
    public void imprimir() {
        System.out.println("---------------FOTO----------------");
        System.out.println("Nome: "+getNomeF()+" Sou uma selfie do tipo: "+getTipoF());
    }
}
