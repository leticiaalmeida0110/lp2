<<<<<<< HEAD
=======
package colecoes;

>>>>>>> c1b54d74647adcd01de46afe08b0a914476e8e1f
public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private char sexo;

<<<<<<< HEAD
    // Construtor
=======
    // Construtor vazio
    public Pessoa() {
    }

    // Construtor completo
>>>>>>> c1b54d74647adcd01de46afe08b0a914476e8e1f
    public Pessoa(String nome, int idade, double altura, double peso, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

<<<<<<< HEAD
    // Getters e Setters

=======
>>>>>>> c1b54d74647adcd01de46afe08b0a914476e8e1f
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

<<<<<<< HEAD
    // Método para calcular o IMC
=======
>>>>>>> c1b54d74647adcd01de46afe08b0a914476e8e1f
    public double calcularIMC() {
        return peso / (altura * altura);
    }

<<<<<<< HEAD
    // Interpretação do IMC
=======
>>>>>>> c1b54d74647adcd01de46afe08b0a914476e8e1f
    public String classificacaoIMC() {
        double imc = calcularIMC();

        if (imc <= 18.5) {
            return "Abaixo do peso";
        } else if (imc <= 25) {
            return "Peso normal";
        } else if (imc <= 30) {
            return "Acima do peso";
        } else {
            return "Obesidade";
        }
    }

<<<<<<< HEAD
    // Comparable: ordenação pelo nome
    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareTo(outraPessoa.nome);
=======
    @Override
    public int compareTo(Pessoa outra) {
        return this.nome.compareTo(outra.nome);
>>>>>>> c1b54d74647adcd01de46afe08b0a914476e8e1f
    }

    @Override
    public String toString() {
<<<<<<< HEAD
        return "Nome: " + nome +
               ", Idade: " + idade +
               ", Altura: " + altura +
               ", Peso: " + peso +
               ", Sexo: " + sexo +
               ", IMC: " + String.format("%.2f", calcularIMC()) +
               ", Classificação: " + classificacaoIMC();
=======
        return nome + " - " + idade + " anos - " + peso + " kg";
>>>>>>> c1b54d74647adcd01de46afe08b0a914476e8e1f
    }

}
