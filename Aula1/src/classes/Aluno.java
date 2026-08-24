package classes;

public class Aluno {
	// atributos
	public int num_matricula;
	public String nome;
	public double nota1, nota2, nota3;
	
	//construtor
	public Aluno() {
		System.out.println("Inicializando ...");
	}
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	public Aluno(String nome, int num_matricula, double nota1, double nota2, double nota3) {
		this.nome = nome;
		this.num_matricula = num_matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
	}
	
	//métodos
	public void fazerExercicios() {
		System.out.println("Fazendo exercícios ...");
	}
	
	public void mostra() {
		System.out.println(this.num_matricula+","+this.nome);
	}
	
	public double calcularMedia() {
		return (this.nota1+this.nota2+this.nota3)/3;
	}
	
	public boolean isAprovado() {
		if (this.calcularMedia() > 6)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.num_matricula = 1;
		a1.nome = "João";
		a1.nota1 = 10;
		a1.mostra();
		a1.fazerExercicios();
		System.out.println("Média: " + a1.calcularMedia());
		System.out.println("Aprovado? " + a1.isAprovado());
		
		Aluno a2 = new Aluno("Maria", 2, 7, 8, 9);
		a2.mostra();
	
	
	}
}
