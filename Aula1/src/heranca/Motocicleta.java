package heranca;

public class Motocicleta {
	  private int cilindradas;
	    private int kmTrocaPneu;

	    public Motocicleta(String serie, String data,
	                       int cilindradas, int kmTrocaPneu) {
	        super(serie, data);
	        this.cilindradas = cilindradas;
	        this.kmTrocaPneu = kmTrocaPneu;
	    }

	    @Override
	    public String toString() {
	        return "Motocicleta - " + super.toString() +
	               ", Cilindradas: " + cilindradas +
	               ", KM troca pneu: " + kmTrocaPneu;
	    }
}
