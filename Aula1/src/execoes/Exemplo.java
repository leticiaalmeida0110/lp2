import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Exemplo {

	
	public static void main(String[] args) {
		// excecao nao verificada
		int vetor[] = {1, 2, 3};
		System.out.println(vetor[2]);
		
		int idade;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite sua idade: ");
		idade = entrada.nextInt();
		
		// excecao verificada
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date data = formato.parse("03/10/2013");
			System.out.println(data);
		} catch (ParseException e) {
			System.out.println("Erro!");
			e.printStackTrace();
		}
	}
}
