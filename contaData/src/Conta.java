import javax.swing.JOptionPane;

public class Conta {
    private String titular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataAbertura;

    public Conta(String titular, int numero, String agencia, double saldo, Data dataAbertura){
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataAbertura = dataAbertura;
    }

    public void sacar(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso\nValor Saque R$" + valor + "\nSaldo R$" + this.saldo);
            return;
        }

        JOptionPane.showMessageDialog(null, "Saldo insuficiente!");
        return;
    }

    public void depositar(double valor){
        if (valor>0){
            this.saldo += valor;
            JOptionPane.showMessageDialog(null, "R$"+valor+" depositado!\nSaldo R$" + this.saldo);
            return;
        }
        JOptionPane.showMessageDialog(null, "Valor invalido!");
        return;
    }

    public double rendimento(){
        return this.saldo * 0.1;
    }

    public void recuperaDadosParaImpressao(){
        JOptionPane.showMessageDialog(null, "Titular: "+this.titular+"\nNumero: "+this.numero+"\nAgencia: "+this.agencia+"\nSaldo: "+this.saldo+"\nRendimento: "+rendimento()+"\nData de abertura: "+this.dataAbertura.FormatarData());
        return;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
