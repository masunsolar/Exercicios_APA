package Linear;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class E3SimuladorLoteria {
    public static void executar() {
        System.out.println("\n\n\n\n");
        Scanner scanner = new Scanner(System.in);
        Random gerador = new Random();

        // 1. Gerar 6 números sorteados (1 a 60)
        int[] sorteados = new int[6];
        for (int i = 0; i < sorteados.length; i++) {
            int novoNumero = gerador.nextInt(60) + 1;

            // "Enquanto o número for repetido, gere um novo"
            boolean repetido = true;
            while (repetido) {
                repetido = false; // Assume que é único
                for (int j = 0; j < i; j++) {
                    if (sorteados[j] == novoNumero) {
                        repetido = true; // achou um igual
                        novoNumero = gerador.nextInt(60) + 1; // Gera outro
                        break; // Sai do loop 'j' para testar o novoNumero desde o início
                    }
                }
            }
            sorteados[i] = novoNumero;
        }

        // 2. Entrada do usuário (6 números)
        int[] aposta = new int[6];
        System.out.println("--- SIMULADOR DE LOTERIA ---");
        System.out.println("Digite os seus 6 números (entre 1 e 60):");
        for (int i = 0; i < aposta.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            aposta[i] = scanner.nextInt();
        }

        // 3. Verificação com Busca Linear
        int acertosContador = 0;
        String numerosAcertados = "";

        // Para cada número da aposta
        for (int i = 0; i < aposta.length; i++) {
            int numeroAtual = aposta[i];

            // fazendo uma busca linear no vetor de sorteados
            for (int j = 0; j < sorteados.length; j++) {
                if (sorteados[j] == numeroAtual) {
                    acertosContador++;
                    numerosAcertados += numeroAtual + " ";
                    break; // Para não contar o mesmo número duas vezes se houver duplicata no sorteio
                }
            }
        }

        // 4. Exibição dos Resultados
        System.out.println("\n==============================");
        System.out.println("       RESULTADO FINAL");
        System.out.println("==============================");
        System.out.println("Números Sorteados: " + Arrays.toString(sorteados));
        System.out.println("Sua Aposta:       " + Arrays.toString(aposta));

        System.out.println("\nQuantidade de acertos: " + acertosContador);

        if (acertosContador > 0) {
            System.out.println("Números que você acertou: " + numerosAcertados);
        } else {
            System.out.println("Infelizmente você não acertou nenhum número.");
        }

        scanner.close();
    }
}