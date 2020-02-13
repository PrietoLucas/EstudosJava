package ExercicioInterface;

public class Contrato implements Imprimivel{
    private String nomeC;
    private String tipoC;

    public Contrato(String nomeC, String tipoC) {
        this.nomeC = nomeC;
        this.tipoC = tipoC;
    }

    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }

    public String getTipoC() {
        return tipoC;
    }

    public void setTipoC(String tipoC) {
        this.tipoC = tipoC;
    }

    @Override
    public void imprimir() {
        System.out.println("--------------CONTRATO----------------");
        System.out.println("Nome: "+getNomeC()+" Sou um contrato muito legal do tipo de arquivo "+getTipoC());
    }

}
