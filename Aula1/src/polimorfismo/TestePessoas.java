package polimorfismo;

public class TestePessoas {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Maria","123.456.789-12");
		Pessoa p2 = new Cliente(1, "Joao","123.456.789-66");
		Pessoa p3 = new Funcionario("123", "Jose","123.456.789-00", 2500.5);
		Cliente p21 = new Cliente(1, "Joao","123.456.789-66");
		Funcionario p31 = new Funcionario("123", "Jose","123.456.789-00", 2500.5);
		
		p1.mostrarDados();
		p21.mostrarDados();
		p31.mostrarDados();

		CadastroPessoas cad = new CadastroPessoas();
		cad.cadastrar(p1);
		cad.cadastrar(p21);		
		cad.cadastrar(p31);
		cad.mostrarCadastro();
	}

}
