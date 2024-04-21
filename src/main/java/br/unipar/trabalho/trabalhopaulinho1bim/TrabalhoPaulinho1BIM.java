package br.unipar.trabalho.trabalhopaulinho1bim;

import br.unipar.trabalho.trabalhopaulinho1bim.model.Ordenador;
import java.util.Arrays;
import java.util.Scanner;

public class TrabalhoPaulinho1BIM {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de elementos que contém o vetor: ");
        int tamanho = scanner.nextInt();
        int[] vetor = new int[tamanho];
        System.out.println("Insira os elementos do vetor:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Elementos do vetor: " + Arrays.toString(vetor));
        System.out.println("Selecione o método de ordenação:");
        System.out.println("1. Ordenação Inserção");
        System.out.println("2. Ordenação Seleção");
        System.out.println("3. Ordenação Bolha");
        int alternativa = scanner.nextInt();

        long startTime = System.nanoTime();

        if (alternativa == 1) {
            vetor = Ordenador.bolha(vetor);
        } else if (alternativa == 2) {
            vetor = Ordenador.insercao(vetor);
        } else if (alternativa == 3) {
            vetor = Ordenador.selecao(vetor);
        } else {
            System.out.println("Opção inválida");
            return;
        }

        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
        long endTime = System.nanoTime();
        System.out.println("Tempo de execução do método: " + (endTime - startTime) + " nanosegundos");
    }
}
