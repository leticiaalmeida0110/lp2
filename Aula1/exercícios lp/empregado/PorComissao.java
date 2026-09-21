package empregado;

public class PorComissao extends Empregado{

    private double salario;
    private double comissao;
    private int venda;

    public PorComissao(String nome, double salario,
                       double comissao, int venda) {
        super(nome);
        this.salario = salario;
        this.comissao = comissao;
        this.venda = venda;
    }

    @Override
    public double ganhar() {
        return salario + (comissao * venda);
    }

    @Override
    public String toString() {
        return "Funcionário por Comissão\n" +
               "Nome: " + nome +
               "\nSalário fixo: R$ " + String.format("%.2f", salario) +
               "\nComissão por venda: R$ " + String.format("%.2f", comissao) +
               "\nVendas: " + venda +
               "\nSalário: R$ " + String.format("%.2f", ganhar());
    }
    
}
