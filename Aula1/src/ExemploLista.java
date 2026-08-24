import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ExemploLista {
	
	public static void main(String[] args) {
		int i;
        Scanner entrada = new Scanner(System.in);
		
		List<Integer> lista = new LinkedList<>();
		
		for (i=1; i<=10; i++) {
			lista.add(entrada.nextInt());
		}
		
		entrada.close();		 
		lista.remove(0);
		lista.add(100);
		
		for (int valor: lista) {
			System.out.println(valor);
		}
		
		System.out.println("Quinto elemento: " + lista.get(5));
		
	}

}
