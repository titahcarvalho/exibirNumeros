import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com o número de posições:");
        int posicoes = entrada.nextInt();

        int[] dados = new int[posicoes];

        for (int i = 0; i < dados.length; i++) {
            System.out.println("Entre com o próximo número:");
            dados[i] = entrada.nextInt();
        }

        System.out.println("Entre com a operação:");
        System.out.println("1-Listar em ordem");
        System.out.println("2-Listar invertido");
        System.out.println("3-Exibir números menores que 5");
        System.out.println("4-Exibir até o primeiro número menor que 5");
        System.out.println("5-Exibir em ordem crescente");
        System.out.println("6-Exibir em ordem decrescente");

        int operacao = entrada.nextInt();

        switch (operacao) {
            case 1:
                for (int i = 0; i < dados.length; i++) {
                    System.out.println(dados[i]);
                }
                break;
            case 2:
                for (int i = dados.length - 1; i >= 0; i--) {
                    System.out.println(dados[i]);
                }
                break;
            case 3:
                for (int i = 0; i < dados.length; i++) {
                    if (dados[i] < 5) {
                        System.out.println(dados[i]);
                    }
                }
                break;
            case 4:
                boolean encontrouMenorQue5 = false;
                for (int i = 0; i < dados.length; i++) {
                    if (dados[i] < 5) {
                        System.out.println(dados[i]);
                        encontrouMenorQue5 = true;
                        break;
                    }
                }
                if (!encontrouMenorQue5) {
                    System.out.println("Nenhum número menor que 5 encontrado.");
                }
                break;
            case 5:
                for (int i = 0; i < dados.length - 1; i++) {
                    for (int j = 0; j < dados.length - i - 1; j++) {
                        if (dados[j] > dados[j + 1]) {
                            int temp = dados[j];
                            dados[j] = dados[j + 1];
                            dados[j + 1] = temp;
                        }
                    }
                }
                System.out.println("Números ordenados:");
                for (int i = 0; i < dados.length; i++) {
                    System.out.println(dados[i]);
                }
                break;
            case 6:
                for (int i = 0; i < dados.length - 1; i++) {
                    for (int j = 0; j < dados.length - i - 1; j++) {
                        if (dados[j] < dados[j + 1]) {
                            int temp = dados[j];
                            dados[j] = dados[j + 1];
                            dados[j + 1] = temp;
                        }
                    }
                }
                System.out.println("Números ordenados:");
                for (int i = 0; i < dados.length; i++) {
                    System.out.println(dados[i]);
                }
                break;
            default:
                System.out.println("Comando inválido");
                break;
        }

        entrada.close();
    }
}
