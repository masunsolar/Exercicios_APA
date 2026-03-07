package Linear;

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class BuscaLinearBase {
    public static void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite qual vai ser o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] vetor = new int[tamanho];
        Random gerador = new Random();

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = gerador.nextInt(100) +1;
        }

        System.out.println(Arrays.toString(vetor));

        System.out.print("Digite o número que deseja buscar: ");
        int alvo = scanner.nextInt();

        // Variáveis de controle
        int comparacoes = 0;
        int posicao = -1; // não foi encontrado
        boolean achou = false;

        // Processo de Busca e Contagem de Comparações
        for (int i = 0; i < vetor.length; i++) {
            comparacoes++;
            if (vetor[i] == alvo) {
                posicao = i;
                achou = true;
                break;
            }
        }

        // Exibição dos resultados da busca
        System.out.println("\n--- Resultado da Busca ---");
        if (achou) {
            System.out.println("Status: O número " + alvo + " foi ENCONTRADO.");
            System.out.println("Posição (índice): " + posicao);

            System.out.println("\n--- Análise de Vizinhança ---");

            //  Lógica para valores menores e maiores
            System.out.print("Valores MENORES que o alvo: ");
            int contMenores = 0;
            for (int num : vetor) {
                if (num < alvo) {
                    System.out.print(num + " ");
                    contMenores++; // Aproveita e ja conta os menores
                }
            }
            System.out.print("\nValores MAIORES que o alvo: ");
            int contMaiores = 0;
            for (int num : vetor) {
                if (num > alvo) {
                    System.out.print(num + " ");
                    contMaiores++; // Aproveita e ja conta os maiores
                }
            }

            System.out.println("\nTotal de maiores: " + contMaiores);
            System.out.println("Total de menores: " + contMenores);
        } else {
            System.out.println("Status: O número " + alvo + " NÃO foi encontrado.");
        }
        System.out.println("\nTotal de comparações realizadas: " + comparacoes);


        System.out.println("\nQuantidade total de elementos no vetor: " + vetor.length);

        scanner.close();
    }
}