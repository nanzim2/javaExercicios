package br.com.poo.aula4;

public class Main {
    public static void main(String[] args) {
        /*
        ContaCorrente[] minhasContas = new ContaCorrente[10];

        ContaCorrente novaConta = new ContaCorrente();
        novaConta.deposita(100);

        minhasContas[0] = novaConta;

        System.out.println(minhasContas[0].getSaldo());
        */

        Agenda agenda = new Agenda();

        Pessoa pessoa1 = new Pessoa("Davi", 18, 1.70);
        Pessoa pessoa2 = new Pessoa("Ana", 21, 1.62);
        Pessoa pessoa3 = new Pessoa("Bruno", 18, 1.66);

        agenda.armazenarPessoa(pessoa1);
        agenda.armazenarPessoa(pessoa2);
        agenda.armazenarPessoa(pessoa3);

        agenda.imprimirAgenda();

        Pessoa encontrada = agenda.buscarPessoa("Ana");
        if (encontrada != null){
            System.out.println("Encontrei: " + encontrada.getNome());
        }

        agenda.removerPessoa("Bruno");

        agenda.imprimirAgenda();


    }
}