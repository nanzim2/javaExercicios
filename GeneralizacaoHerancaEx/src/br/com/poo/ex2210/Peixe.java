package br.com.poo.ex2210;

public class Peixe extends Animal{

    private String caracteristica;

    public Peixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia ,String caracteristica){
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public void relatorio(){
        super.relatorioAnimal();
        System.out.println("Esqueleto: " + this.caracteristica);
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String esqueleto){
        this.caracteristica = caracteristica;
    }
}
