package polimorfismo;

import java.util.LinkedList;
import java.util.List;

public class CadastroPessoas {
    private List<Pessoa> listaPessoas;
    private int qtde;

    public CadastroPessoas(){
        this.listaPessoas = new LinkedList<>();
    }

    public void cadastrar(Pessoa p){
        this.listaPessoas.add(p);
        this.qtde +=1;
    }

    public void mostrarCadastro(){
        System.out.println(this.qtde+" pessoas cadastradas.");
        for (Pessoa p : this.listaPessoas){
            p.mostrarDados();
        }
    }
}
