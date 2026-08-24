package classes;
//classe, objeto, atributo construtor
public class circulo {
	public double raio;
	public double pi=3.14;
	
	public circulo(){
	}
	
	public circulo(int raio) {
		this.raio = raio;
	}
	
	public double diametro() {
		return(this.raio)*2;
	}
	
	public double comprimento() {
		return(2*pi*this.raio);
	}
	
	public double area() {
		return(pi* this.raio*this.raio);
	}
	
	public static void main(String[] args) {
		//System.out.println("diametro:");
	}

}
