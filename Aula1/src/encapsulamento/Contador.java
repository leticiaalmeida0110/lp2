package encapsulamento;

public class Contador {
    private int numero;

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void incrementar() {
        numero++;
    }

    public void desfazerIncremento() {
        numero--;
    }

    public static void main(String[] args) {
        Contador c = new Contador();

        c.setNumero(10);

        c.incrementar();
        System.out.println("Numero após incrementar: " + c.getNumero());

        c.desfazerIncremento();
        System.out.println("Numero após desfazer incremento: " + c.getNumero());
    }
}