package metodos_genericos;

public class Par <A, B>{
    private A valor1;
    private B valor2;

    public Par(A valor1, B valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public A getValor1(){
        return this.valor1;
    }

    public void setValor1(A valor){
        this.valor1 = valor;
    }

    public static void main(String[] args){
        Par<String, Integer> par1 = new Par<> ("Ana", 20);
        System.out.println(par1.getValor1());
        Par<Aluno, Double> par2 = new Par<>(new Aluno(123, "Joao", 8.9));
        System.out.println(par2.getVslor1());
   }

}
