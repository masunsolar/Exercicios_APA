package Binaria;

public class DiscursivaBi {
    public static void executar() {
        System.out.println("\n\n\n\n");
        System.out.println("Exercício 2 – Questão discursiva");
        System.out.println("Explique por que a busca binária não pode ser utilizada em vetores não\n" +
                "ordenados.\n" +
                "\n" +
                "Compare esse fato com a busca linear e justifique qual algoritmo é\n" +
                "melhor para:\n");
        System.out.println("a) Dados desordenados: ");
        System.out.println("A melhor escolha é o linear. Porquê a busca binaria se baseia no tamnho do termo central do vetor, caso seja maior ele vai para direita e divide ao meio novamente até chegar no resultado, o mesmo serve para quando o número é menor. Com isso, caso não tenha uma ordem não adianta nada ele ir pra esquerda ou direita, pois o número pode estar em qualquer um dos lados sem uma ordem.\n\n");
        System.out.println("b) Dados ordenados com muita busca");
        System.out.println("A melhor escolha é a binária. Porquê sua complexidade de tempo é O(log n), o que significa que mesmo em um vetor com milhões de itens, ela achará a resposta em pouquíssimas comparações. Quando o sistema precisa realizar muitas buscas repetidas, a economia de processamento da busca binária em relação à busca linear (que poderia olhar milhões de itens a cada busca) torna o sistema drasticamente mais rápido e eficiente.\n\n");

        System.out.println("Exercício 3 – Interprete o código\n" +
                "\n" +
                "Dado o seguinte código:\n" +
                "\n" +
                "for(int i = 0; i < vetor.length; i++) {\n" +
                "    if(vetor[i] == valor) {\n" +
                "        return i;\n" +
                "   }" +
                "}\n");
        System.out.println("Qual é a complexidade no pior caso?");
        System.out.println("O(n)\n\n");
        System.out.println("E no melhor caso?");
        System.out.println("O(1)\n\n");
        System.out.println("O que muda se o vetor for ordenado?");
        System.out.println("Continua sendo O(n), porquê esse código pouco importa a ordem\n\n");

        System.out.println("Exercício 4 - Apresente a fórmula para cálculo de complexidade de cada exercício elaborado.");
        System.out.println("1 - Busca Linear: O(n) | Busca Binária: O(log2 n)\n" +
                "2-a - O(n) (pois a melhor opção é a Busca Linear)\n" +
                "2-b - O(log2 n) (pois a melhor opção é a Busca Binária)\n" +
                "3 (Pior caso) - O(n)\n" +
                "3 (Melhor caso) - O(1)\n" +
                "3 (Se ordenado) - O(log2 n) (pois permite trocar o algoritmo para Busca Binária)");
    }
}
