package tipos_genericos;

public class ImprimeVetores {
	
	public static void imprime(Integer vetor[]) {
		for (Integer valor : vetor) {
			System.out.println(valor);
		}
	}
	
	public static <A extends Comparable<A>> A maior(A valor1, A valor2){
		if(valor1.compareTo (valor2)>=0)
			return valor1;
		else
			return valor2;
	}
	
	public static void main(String[] args) {

		System.out.println(maior(2, 3));
		System.out.println(maior("Z", "I"));

		Integer vetor1[] = new Integer[3];
		vetor1[0]=1;
		vetor1[1]=2;
		vetor1[2]=3;
		
		Double vetor2[] = {1.2, 1.4, 1.6};
		String vetor3[] = {"banana", "maça", "laranja"};
		
		imprime(vetor1);
//		imprimeGenerico(vetor1);
//		imprimeGenerico(vetor2);
//		imprimeGenerico(vetor3);
	}

}
