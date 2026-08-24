package encapsulamento;


	public class Energia {
	    private double salarioMinimo;
	    private double quilowatts;

	    public double getSalarioMinimo() {
	        return salarioMinimo;
	    }

	    public void setSalarioMinimo(double salarioMinimo) {
	        this.salarioMinimo = salarioMinimo;
	    }

	    public double getQuilowatts() {
	        return quilowatts;
	    }

	    public void setQuilowatts(double quilowatts) {
	        this.quilowatts = quilowatts;
	    }

	    public double valorKw() {
	        return (salarioMinimo / 7) / 100;
	    }

	    public double valorPagar() {
	        return quilowatts * valorKw();
	    }

	    public double valorComDesconto() {
	        return valorPagar() * 0.90;
	    }

	    public static void main(String[] args) {
	        Energia casa = new Energia();

	        casa.setSalarioMinimo(1518.00);
	        casa.setQuilowatts(250);

	        System.out.printf("Valor de cada kW: R$ %.2f%n",
	                casa.valorKw());

	        System.out.printf("Valor a pagar sem desconto: R$ %.2f%n",
	                casa.valorPagar());

	        System.out.printf("Valor a pagar com desconto: R$ %.2f%n",
	                casa.valorComDesconto());
	    }
	}

