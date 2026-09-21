public class teste2 {

        public static void main(String[] args){
            Conta c1 = new Conta();
            c1.setNumero("123");
            c1.setSaldo(100);
    
            Conta c2 = new Conta();
            c2.setNumero("124");
            c2.setSaldo(100);
    
            Conta c3 = new Conta();
            c3.setNumero("125");
            c3.setSaldo(100);
    
            Cadastro cad = new Cadastro();
            cad.add(c1);
            cad.add(c2);
            cad.add(c3);
    
            try {
                cad.debitar("123", 500);
                
                System.out.println("Debito realizado.");
            } catch (Exception e){
                System.out.println(e.getMessage());
                e.printStackTrace();
                
            }catch (SaldoInsuficienteException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }catch (SaldoInexistenteException e) {
                System.out.println(e.getMessage());
                System.out.println("Conta não encontrada: "+e.getNumero());
                e.printStackTrace();
            } finally{
                System.out.println("Sempre sou executado.");
            }
        }
    
    }
