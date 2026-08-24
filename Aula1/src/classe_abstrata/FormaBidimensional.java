package classe_abstrata;

public abstract class FormaBidimensional {

    private int lados;

    //metodos abstratos
    public abstract double area();
    public abstract double perimetro();


    //metodos concretos
    public String toString() {
        return String.valueOf(this.lados);
    }

}
