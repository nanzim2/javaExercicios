package br.com.poo.aula4;

public class ContaCorrente {
    private double saldo;

    public ContaCorrente(){
        this.saldo = 0;
    }

    public double getSaldo(){
        return saldo;
    }

    public void deposita(double valor){
        this.saldo += valor;
    }
}
