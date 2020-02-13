package ExercicioInterface;

public class Documento implements Imprimivel {
    private String nomeD;
    private String tipoD;

    public Documento(String nomeD, String tipoD) {
        this.nomeD = nomeD;
        this.tipoD = tipoD;
    }

    public String getNomeD() {
        return nomeD;
    }

    public void setNomeD(String nomeD) {
        this.nomeD = nomeD;
    }

    public String getTipoD() {
        return tipoD;
    }

    public void setTipoD(String tipoD) {
        this.tipoD = tipoD;
    }

    @Override
    public void imprimir() {
        System.out.println("---------------DOCUMENTO----------------");
        System.out.println("Nome: "+getNomeD()+" Sou um documento do "+getTipoD());
    }
}
