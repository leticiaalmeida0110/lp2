package interfaces;

public class FilaEncadeada<T> implements Fila<T> {

    private No<T> inicio, fim;

    public FilaEncadeada(){
        this.inicio = null;
        this.fim = null;
    }

    @Override
    public void add(T valor){
        No<T> novo = new No<T>(valor);

        if(isEmpty()){
            this.inicio = novo;
            this.fim = novo;
        } else{
            this.fim.setProx(novo);
            this.fim = novo;
        }
        //TODO Auto-generated method stub
    }

    @Override
    public T remove (){
        T valor = null; // retorno

        if(this.isEmpty()){
            System.out.println("Impossivel remover.");
            
        } else if(this.inicio == this.fim){
            valor = this.inicio.getValor();
            this.inicio = null;
            this.fim = null;
           
        } else{
            No<T> noRemovido = this.inicio;
            this.inicio = this.inicio.getProx();
            valor = noRemovido.getValor();
            noRemovido.setProx(null);
        }
        //TODO Auto-generated method stub
        return valor;
    }

    @Override
    public T get (int index){
        //TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEmpty(){
        boolean flag = false;

        if(this.inicio == null && this.fim == null)
            flag = true;

        return flag;
    }

    @Override
    public void mostra(){
        if (this.isEmpty()){
            System.out.println("[]");
        } else if (this.inicio == this.fim) {
            System.out.println(this.inicio.getValor());
        } else{
            No<T> aux = this.inicio;
            while(aux!=null){
                System.out.println(aux.getValor());
                aux = aux.getProx();
            }
        }
    }

    public static void main(String[] args) {
        Fila<Integer> f1 = new FilaEncadeada<>();
        FilaEncadeada<Integer> f2 = new FilaEncadeada();

        System.out.println("Vazia?" + f2.isEmpty());

        f2.add(10);
        f2.add(20);
        f2.add(30);
        f2.mostra();

        System.out.println("Vazia?" + f2.isEmpty());

        System.out.println("Remocao:");

        f2.remove();
        f2.remove();
        f2.remove();
        f2.remove();

        f2.mostra();

        //FilaEncadeada f3 = new FilaEncadeada();
        //FilaDeValor f4 = new FilaDeVetor();

        
     
    }

}
