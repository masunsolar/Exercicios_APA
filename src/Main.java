import java.util.Scanner;
// Importando suas classes dos pacotes
import Binaria.BuscaBinariaBase;
import Binaria.DiscursivaBi;
import Linear.BuscaLinearBase;
import Linear.BuscaLinearE2;
import Linear.SimuladorLoteriaE3;
import Linear.Exercicio4;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        // O loop do-while garante que o menu apareça até você decidir sair
        do {
            System.out.println("\n===== MENU DE ALGORITMOS =====");
            System.out.println("1 - Busca Binária Base");
            System.out.println("2 - Busca Linear Base");
            System.out.println("3 - Exercício 2 (Múltiplos Vetores)");
            System.out.println("4 - Exercício 3 (Loteria)");
            System.out.println("5 - Exercício 4 (Discursiva)");
            System.out.println("6 - Exercícios discursivos binario");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    BuscaBinariaBase.executar(); // Chama o método da sua classe
                    break;
                case 2:
                    BuscaLinearBase.executar();
                    break;
                case 3:
                    BuscaLinearE2.executar();
                    break;
                case 4:
                    SimuladorLoteriaE3.executar();
                    break;
                case 5:
                    Exercicio4.executar();
                    break;
                case 6:
                    DiscursivaBi.executar();
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        scanner.close();
    }
}