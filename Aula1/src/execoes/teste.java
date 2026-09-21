public class Teste {

    public static void main(String[] args){
        Conta c1 = new Conta();
        c1.setNumero("123");
        c1.setSaldo(100);

        try {
            c1.debitar(50);
            System.out.println("Debito realizado.");
        } catch (SaldoInsuficienteException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } finally{
            System.out.println("Sempre sou executado.");
        }
    }

}
