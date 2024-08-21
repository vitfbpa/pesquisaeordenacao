package Aula1;

public class Reflexoes {
    void bolha(int vetor[], int n) {
        int i, aux;
        boolean houveTroca;
        do {
            houveTroca = false;
            for (i = 0; i < n - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    houveTroca = true;
                }
            }
        } while (houveTroca);
    }

    void selecao(int vetor[], int n) {
        int i, j, posMenor, aux;

        for (i = 0; i < n - 1; i++) {
            posMenor = i;
            for (j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[posMenor]) {
                    posMenor = j;
                }
            }
            if (posMenor != i) {
                aux = vetor[i];
                vetor[i] = vetor[posMenor];
                vetor[posMenor] = aux;
            }
        }
    }
}