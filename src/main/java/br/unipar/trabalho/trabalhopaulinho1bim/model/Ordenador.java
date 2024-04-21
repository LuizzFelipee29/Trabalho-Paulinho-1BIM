package br.unipar.trabalho.trabalhopaulinho1bim.model;

public class Ordenador {

    public static int[] bolha(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
        return vetor;
    }

    public static int[] selecao(int[] vetor) {
        for (int i = 1; i < vetor.length; i++) {
            int atual = vetor[i];
            int j = i - 1;
            while (j >= 0 && vetor[j] > atual) {
                vetor[j + 1] = vetor[j];
                j--;
            }
            vetor[j + 1] = atual;
        }
        return vetor;
    }

    public static int[] insercao(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;}
            }
            int temp = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = temp;
        }
        return vetor;
    }
}
