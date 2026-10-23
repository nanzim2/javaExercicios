package br.com.poo.ex2210;

public class Animal {

    protected String nome;
    protected float comprimento;
    protected int numeroPatas;
    protected String cor;
    protected String ambiente;
    protected float velocidadeMedia;

    public Animal(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia){
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroPatas = numeroPatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public void relatorioAnimal(){
        System.out.println("#### RELATORIO ####");
        System.out.println("Nome: " + this.nome);
        System.out.println("Comprimento: " + this.comprimento + " cm");
        System.out.println("Numero de Patas: " + this.numeroPatas);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ambiente: " + this.ambiente);
        System.out.println("Velocidade media: " + this.velocidadeMedia + " m/s");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }
}
