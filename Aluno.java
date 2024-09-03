package Trabalho1;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private int idade;

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

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

    @Override
    public String toString() {
        return "Aluno [nome=" + nome + ", idade=" + idade + "]";
    }

    @Override
    public int compareTo(Aluno other) {
        int nomeComp = this.nome.compareTo(other.nome);
        if (nomeComp != 0) {
            return nomeComp;
        }
        return Integer.compare(this.idade, other.idade);
    }
}