package br.com.poo.aula5;

public class Casa {
    private int numero;
    private String rua;
    private int cep;
    private String dono;

    public Casa(int numero, String rua, int cep, String dono){
        this.numero = numero;
        this.rua = rua;
        this.cep = cep;
        this.dono = dono;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
}
