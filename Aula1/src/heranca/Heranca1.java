package heranca;

public class Heranca1{
	    private String nome;
	    private int idade;

	    public Heranca1(String nome, int idade) {
	        this.nome = nome;
	        this.idade = idade;
	    }
	    public String getNome() {
	        return nome;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    class PacienteDeClinica extends Heranca1 {
	    	private String doenca;

	    	public PacienteDeClinica(String nome, int idade, String doenca) {
	    		super(nome, idade);
	    		this.doenca = doenca;
	    	}	
	    }
}
