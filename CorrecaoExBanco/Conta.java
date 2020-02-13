package CorrecaoExBanco;

public class Conta {
    private double saldo;
    private Cliente cliente;

    public Conta(){

    }

    public Conta(double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void sacar(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Novo Saldo: "+this.saldo);
        } else {
            System.out.println("Saldo Insuficiente!");
        }
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito realizado com sucess!");
        } else {
            System.out.println("Valor Invalido!");
        }
    }

    public void consultarSaldo(){
        System.out.println("Total: "+this.saldo);
    }
}
