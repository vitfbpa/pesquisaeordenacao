package Trabalho1;

import java.util.Comparator;

public class AlunoComparator implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        int nomeComp = a1.getNome().compareTo(a2.getNome());
        if (nomeComp != 0) {
            return nomeComp;
        }
        return Integer.compare(a1.getIdade(), a2.getIdade());
    }
}
