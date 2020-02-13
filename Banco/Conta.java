package Banco;

import Banco.Cliente;

public class Conta {
    private Cliente cliente;
    private double saldoConta;

    public Conta(){
    }

    public Conta (Cliente cliente, double saldo){
        this.saldoConta = saldo;
        this.cliente = cliente;
    }

    public void sacarConta(double valor){
        if(saldoConta>=valor){
            this.saldoConta-=valor;
            System.out.println("Seu saldo = " +saldoConta);
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }

    public void depositarConta(double valor) {
        if (valor > 0) {
            this.saldoConta += valor;
            System.out.println("Dinheiro depositado!" +saldoConta);
        } else {
            System.out.println("Deposito Invalido");
        }
    }
}
