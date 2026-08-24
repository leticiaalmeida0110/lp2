package heranca;

public class Bicicleta extends Veiculo {
	    private TipoBicicleta tipo;

	    public Bicicleta(String serie, String data, TipoBicicleta tipo) {
	        super(serie, data);
	        this.tipo = tipo;
	    }

	    @Override
	    public String toString() {
	        return "Bicicleta - " + super.toString() +
	               ", Tipo: " + tipo;
	    }
	    
}
