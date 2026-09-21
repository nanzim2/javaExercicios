package br.com.poo;

public class Circulo {
    private int raio;
    private Ponto origem;

    // Construtor 1
    public Circulo(int raio, Ponto origem){
        this.raio = raio;
        this.origem = origem;
    }

    // Construtor 2
    public Circulo(int raio, int x, int y){
        this(raio, new Ponto(x, y));
    }

    public double calculaArea(){
        return Math.PI * Math.pow(this.raio, 2);
    }

    public double calcularCircunferencia(){
        return 2 * Math.PI * this.raio;
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }

    public Ponto getOrigem() {
        return origem;
    }

    public void setOrigem(Ponto origem) {
        this.origem = origem;
    }
}
