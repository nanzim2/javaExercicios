import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String titular = JOptionPane.showInputDialog("Criar nova Conta\nTituar da Conta: ");
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta: "));
        String agencia = JOptionPane.showInputDialog("Agencia: ");
        double saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo R$: "));

        int dia = Integer.parseInt(JOptionPane.showInputDialog("Data Abertura\nDia: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes: "));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano: "));

        Data dataAbertura = new Data(dia, mes, ano);

        Conta conta1 = new Conta(titular,numero,agencia,saldo, dataAbertura);

        conta1.recuperaDadosParaImpressao();

        double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Valor que deseja sacar R$ "));
        conta1.sacar(valorSaque);

        double  valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Valor para deposito R$ "));
        conta1.depositar(valorDeposito);

        conta1.recuperaDadosParaImpressao();
    }
}