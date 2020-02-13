package ExercicioInterface;

public class MainInterface {
    public static void main(String[] args) {
        Contrato cont1 = new Contrato("Aluguel", "PDF");
        Foto foto = new Foto("Dia", "PNG");
        Documento doc1 = new Documento("H","word");
        Impressora imp1 = new Impressora();

        imp1.adicionarImprimivel(cont1);
        imp1.adicionarImprimivel(foto);
        imp1.adicionarImprimivel(doc1);
        imp1.imprimirTudo();
    }
}
