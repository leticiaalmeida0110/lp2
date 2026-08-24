import java.util.Scanner;

public class ExemploVetor {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int i;
		int vetor[] = new int[10];
		
		for (i=0; i<vetor.length; i++) {
			vetor[i] = entrada.nextInt();
		}
		entrada.close();
		for (int valor : vetor) {
			System.out.println(valor);
		}
	}

}
