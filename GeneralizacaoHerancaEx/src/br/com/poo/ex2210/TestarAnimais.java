package br.com.poo.ex2210;

public class TestarAnimais {
    public static void main(String[] args) {

        Animal camelo = new Animal("Camelo", 150, 4, "Amarelo", "Terra", 2);
        camelo.relatorioAnimal();

        System.out.println();

        Peixe tubarao = new Peixe("Tubarao", 300, 0, "Cinzento", "Mar", 1.5f, "Barbatanas e cauda");
        tubarao.relatorio();

        System.out.println();

        Mamifero ursocanada = new Mamifero("Urso-do-Canada", 180, 4, "Vermelho", "Terra", 0.5f, "Mel");
        ursocanada.relatorio();
    }
}