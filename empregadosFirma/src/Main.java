public class Main {
    public static void main(String[] args){
        Empregado empregado1 = new Empregado("Julia", "Sanfona", 1200);
        Empregado empregado2 = new Empregado("Joao", "Trony", 950);

        empregado1.imprimirDados();
        empregado2.imprimirDados();

        empregado1.aumento10();
        empregado2.aumento10();

        System.out.println();
        System.out.println("Salario anual pos aumento do empregado1: " + empregado1.salarioAnual());
        System.out.println();
        System.out.println("Salario anual pos aumento do empregado2: " +empregado2.salarioAnual());
        System.out.println();


    }
}
