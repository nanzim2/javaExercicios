import javax.swing.JOptionPane;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String FormatarData(){
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public void imprimirData(){
        JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
        return;
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }

    public int getMes(){
        return mes;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }
}
