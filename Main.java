package Trabalho1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Aluno> alunos = gerarAlunos(60000);

        List<Aluno> alunosSort = new ArrayList<>(alunos);
        Collections.sort(alunosSort, new AlunoComparator());
        System.out.println("\nOrdenado com Collections.sort:");
        imprimirLista(alunosSort);

        List<Aluno> alunosBolha = new ArrayList<>(alunos);
        Ordenacoes.bolhaSort(alunosBolha);
        System.out.println("\nOrdenado com o método Bolha:");
        imprimirLista(alunosBolha);

        List<Aluno> alunosSelecao = new ArrayList<>(alunos);
        Ordenacoes.selecaoSort(alunosSelecao);
        System.out.println("\nOrdenado com o método Seleção:");
        imprimirLista(alunosSelecao);

        List<Aluno> alunosInsercao = new ArrayList<>(alunos);
        Ordenacoes.insercaoSort(alunosInsercao);
        System.out.println("\nOrdenado com o método Inserção:");
        imprimirLista(alunosInsercao);
    }

    private static List<Aluno> gerarAlunos(int quantidade) {
        List<Aluno> alunos = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < quantidade; i++) {
            String nome = "Aluno" + (i + 1);
            int idade = 18 + random.nextInt(53);
            alunos.add(new Aluno(nome, idade));
        }
        return alunos;
    }

    private static void imprimirLista(List<Aluno> alunos) {
        int total = alunos.size();
        int limit = 10;

        for (int i = 0; i < Math.min(limit, total); i++) {
            System.out.println(alunos.get(i));
        }

        if (total > limit * 2) {
            System.out.println("...");
        }

        for (int i = Math.max(total - limit, limit); i < total; i++) {
            System.out.println(alunos.get(i));
        }
    }
}