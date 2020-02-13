package Banco;

import Banco.Cliente;
import Banco.Conta;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Lucas",33333333,18);

        Conta conta1 = new Conta(cliente1,0.0);

        conta1.depositarConta(200);
    }
}
