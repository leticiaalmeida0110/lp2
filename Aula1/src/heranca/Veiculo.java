package heranca;

public class Veiculo {
	
	    protected String numeroSerie;
	    protected String dataManutencao;

	    public Veiculo(String numeroSerie, String dataManutencao) {
	        this.numeroSerie = numeroSerie;
	        this.dataManutencao = dataManutencao;
	    }

	    @Override
	    public String toString() {
	        return "Serie: " + numeroSerie +
	               ", Manutenção: " + dataManutencao;
	    }
	

}
