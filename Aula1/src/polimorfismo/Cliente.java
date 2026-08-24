package polimorfismo;

public class Cliente extends Pessoa {
	private int codigo;
	
	public Cliente(int codigo, String nome, String cpf) {
		super(nome, cpf);
		this.codigo = codigo;
	}
	
	public void mostrarDados() {
		System.out.println(String.format("%d, %s, %s", this.codigo, super.getNome(), super.getCpf()));
	}
}
