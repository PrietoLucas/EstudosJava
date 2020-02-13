package ExemploInterface;

public class MainExemploInterface {
    public static void main(String[] args) {
        Ivo ivo = new Ivo();
        Superman superman = new Superman();
        Batman batman = new Batman();

        ivo.salvarPessoas();
        superman.salvarPessoas();
        batman.salvarPessoas();
    }
}
