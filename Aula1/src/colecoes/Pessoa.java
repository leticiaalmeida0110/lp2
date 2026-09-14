public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;
    private double altura;
    private double peso;
    private char sexo;

    // Construtor
    public Pessoa(String nome, int idade, double altura, double peso, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    // Getters e Setters

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

    // Método para calcular o IMC
    public double calcularIMC() {
        return peso / (altura * altura);
    }

    // Interpretação do IMC
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

    // Comparable: ordenação pelo nome
    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.nome.compareTo(outraPessoa.nome);
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
               ", Idade: " + idade +
               ", Altura: " + altura +
               ", Peso: " + peso +
               ", Sexo: " + sexo +
               ", IMC: " + String.format("%.2f", calcularIMC()) +
               ", Classificação: " + classificacaoIMC();
    }

}
