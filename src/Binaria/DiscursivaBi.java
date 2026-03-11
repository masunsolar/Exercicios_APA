package Binaria;

public class DiscursivaBi {
    public static void executar() {
        System.out.println("Exercício 2 – Questão discursiva");
        System.out.println("Explique por que a busca binária não pode ser utilizada em vetores não\n" +
                "ordenados.\n" +
                "\n" +
                "Compare esse fato com a busca linear e justifique qual algoritmo é\n" +
                "melhor para:");
        System.out.println("a) Dados desordenados: ");
        System.out.println("Porquê a busca binaria se baseia no tamnho do termo central do vetor, caso seja maior ele vai para direita e divide ao meio novamente até chegar no resultado, o mesmo serve para quando o número é menor. Com isso, caso não tenha uma ordem não adianta nada ele ir pra esquerda ou direita, pois o número pode estar em qualquer um dos lados sem uma ordem.");
        System.out.println("b) Dados ordenados com muita busca");
        System.out.println("");
    }
}
