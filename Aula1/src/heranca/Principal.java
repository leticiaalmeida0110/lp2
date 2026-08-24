package heranca;

public class Principal {

	public static void main(String[] args) {
		Funcionario f = new Funcionario("Maria", "123", 2000);
		f.imprime();
		
		Vendedor v = new Vendedor("João", "124", 1500);
		//Funcionario v = new Vendedor("João", "124", 1500);
//		v.acumularVendas(1000);
//		v.acumularVendas(2000);
//		v.acumularVendas(3000);
		v.imprime();
		
	}
	
}
