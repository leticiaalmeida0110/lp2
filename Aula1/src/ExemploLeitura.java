import java.util.Scanner;

public class ExemploLeitura {
	
	public static void main(String[] args) {
		String nome;
		char sexo;
		int idade;
		double nota;
		boolean aprovado;
		
		Scanner scan = new Scanner(System.in);
		
		// next - lê palavra
		// nextline -lê a frase
		sexo = scan.next().charAt(0);
		idade = scan.nextInt();
		nota = scan.nextDouble();
		aprovado = scan.nextBoolean();
		scan.nextLine();
		nome = scan.nextLine();
		
		scan.close();
		
		System.out.println(nome+", "+sexo+", "+idade+", "+nota+", "+aprovado);
	
		System.out.printf("%s, %c, %d, %.2f, %b\n", nome, sexo, idade, nota, aprovado);
	}

}
