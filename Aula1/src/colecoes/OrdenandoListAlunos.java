package colecoes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenandoListAlunos {
	
	public static <E> void imprime(List<E> lista) {
		for (E valor: lista) {
			System.out.println(valor);
		}
		
	}
	
	public static void main(String[] args) {
		List<Aluno> listaAlunos = new ArrayList<Aluno>();
		listaAlunos.add(new Aluno(6, "E"));
		listaAlunos.add(new Aluno(1, "B"));
		listaAlunos.add(new Aluno(9, "A"));
		listaAlunos.add(new Aluno(3, "G"));
		listaAlunos.add(new Aluno(8, "Z"));
		Collections.sort(listaAlunos);
		imprime(listaAlunos);
	}

}
