package Trabalho1;

import java.util.Collections;
import java.util.List;

public class Ordenacoes {

    // Ordenação Bolha
    public static void bolhaSort(List<Aluno> alunos) {
        int n = alunos.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (alunos.get(j).compareTo(alunos.get(j + 1)) > 0) {
                    Collections.swap(alunos, j, j + 1);
                }
            }
        }
    }

    // Ordenação Seleção
    public static void selecaoSort(List<Aluno> alunos) {
        int n = alunos.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (alunos.get(j).compareTo(alunos.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Collections.swap(alunos, i, minIndex);
        }
    }

    // Ordenação Inserção
    public static void insercaoSort(List<Aluno> alunos) {
        int n = alunos.size();
        for (int i = 1; i < n; i++) {
            Aluno chave = alunos.get(i);
            int j = i - 1;
            while (j >= 0 && alunos.get(j).compareTo(chave) > 0) {
                alunos.set(j + 1, alunos.get(j));
                j--;
            }
            alunos.set(j + 1, chave);
        }
    }
}