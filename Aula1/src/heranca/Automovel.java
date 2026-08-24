package heranca;

public class Automovel extends Veiculo{
	    private int kmTrocaPneu;
	    private int kmTrocaOleo;

	    public Automovel(String serie, String data,
	                     int kmTrocaPneu, int kmTrocaOleo) {
	        super(serie, data);
	        this.kmTrocaPneu = kmTrocaPneu;
	        this.kmTrocaOleo = kmTrocaOleo;
	    }

	    @Override
	    public String toString() {
	        return "Automóvel - " + super.toString() +
	               ", KM troca pneu: " + kmTrocaPneu +
	               ", KM troca óleo: " + kmTrocaOleo;
	    }
}
