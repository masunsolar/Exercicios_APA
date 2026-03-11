package Linear;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class E2BuscaLinear {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();

        System.out.print("Digite o número que deseja buscar nos 3 vetores: ");
        int alvo = scanner.nextInt();

        // Array para guardar quantas comparações cada busca fez
        int[] resultadosComparacoes = new int[3];

        // Laço para processar os 3 vetores
        for (int v = 0; v < 3; v++) {
            int[] vetor = new int[20];
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = gerador.nextInt(100) + 1;
            }

            System.out.println("\n--- VETOR " + (v + 1) + " ---");
            System.out.println(Arrays.toString(vetor));

            int comparacoes = 0;
            int posicao = -1;
            boolean achou = false;

            // Busca Linear
            for (int i = 0; i < vetor.length; i++) {
                comparacoes++;
                if (vetor[i] == alvo) {
                    posicao = i;
                    achou = true;
                    break;
                }
            }

            // Guarda o resultado para comparar no final
            resultadosComparacoes[v] = comparacoes;

            if (achou) {
                System.out.println("Status: ENCONTRADO na posição: " + posicao);
            } else {
                System.out.println("Status: NÃO ENCONTRADO.");
            }
            System.out.println("Comparações neste vetor: " + comparacoes);
        }

        // --- ANÁLISE FINAL ---
        System.out.println("\n==============================");
        System.out.println("       ANÁLISE DE EFICIÊNCIA");
        System.out.println("==============================");

        int melhorVetor = 0;
        for (int i = 1; i < 3; i++) {
            if (resultadosComparacoes[i] < resultadosComparacoes[melhorVetor]) {
                melhorVetor = i;
            }
        }

        scanner.close();
    }
}