package br.com.poo;

public class Main {
    public static void main(String[] args) {
        // Criando pontos
        Ponto ponto1 = new Ponto();
        Ponto ponto2 = new Ponto(10, 7);

        ponto1.imprimirPonto();
        ponto2.imprimirPonto();

        Circulo circulo1 = new Circulo(3, 4, 5);
        Circulo circulo2 = new Circulo(3, ponto2);

        System.out.println("raio: " + circulo1.getRaio());
        System.out.println("Area: %.2f%n" + circulo1.calculaArea());
        System.out.println("Area: %.2f%n" + circulo1.calcularCircunferencia());

        System.out.println("Coordenada X da origem: " + circulo1.getOrigem().getX());
        System.out.println("Coordenada Y da origem: " + circulo1.getOrigem().getY());

        System.out.printf("Círculo 1 - Origem: (%d, %d)%n", circulo1.getOrigem().getX(), circulo1.getOrigem().getY());

        System.out.printf("Círculo 2 - Origem: (%d, %d)%n", circulo2.getOrigem().getX(), circulo2.getOrigem().getY());

    }
}