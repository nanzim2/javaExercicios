public class Empregado {
    private String nome;
    private String sobrenome;
    private double salario;

    public Empregado(String nome, String sobrenome, double salario){
        this.nome = nome;
        this.sobrenome = sobrenome;

        if(salario < 0){
            salario = 0.0;
        }
        this.salario = salario;
    }

    public void aumento10(){
        this.salario = this.salario * 1.1;
    }

    public double salarioAnual(){
        return 12 * this.salario;
    }

    public void imprimirDados(){
        System.out.println("==== FICHA ====");
        System.out.println("Nome: " + this.nome);
        System.out.println("Sobrenome: " + this.sobrenome);
        System.out.println("Salario mensal: " + this.salario);
        System.out.println("Salario anual: " + salarioAnual());
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
