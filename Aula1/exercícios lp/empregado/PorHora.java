package empregado;

public class PorHora extends Empregado{

    private double valor;
    private double hora;

    public PorHora(String nome, double valor, double hora) {
        super(nome);
        this.valor = valor;
        this.hora = hora;
    }

    @Override
    public double ganhar() {
        return valor * hora;
    }

    @Override
    public String toString() {
        return "Funcionário por Hora\n" + 
        "Nome: " + nome + 
        "\nValor por hora: R$ " + String.format("%.2f", valor) + 
        "\nHoras trabalhadas: " + hora + 
        "\nSalário: R$ " + String.format("%.2f", ganhar());
    }
    
}
