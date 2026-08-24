package classe_abstrata;

public class Circulo extends FormaBidimensional{
    private double raio;

    public Circulo(double raio){
        this.raio;
    }

    public double area(){
        return Math.PI*this.raio*this.raio;
    }
    public double perimetro(){
        return 2*Math.PI*this.raio;
    }

}
