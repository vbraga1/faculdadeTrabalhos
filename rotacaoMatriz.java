import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class RotacaoMatriz {
    // Método para rotação de matriz
    static int[][] rotacaoMatriz(int[][] matriz) {
        int novaMatriz[][] = new int[matriz.length][matriz.length];
        for (int coluna = 0; coluna < matriz.length; coluna++) {
            for (int linha = 0; linha < matriz.length; linha++) {
                novaMatriz[linha][(matriz.length - 1) - coluna] = matriz[coluna][linha];
            }
        }
        return novaMatriz;
    }
    // Método que realiza a iteração de números na matriz
    static int[][] iterandoMatriz(int[][] matriz) {
        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.println("Informe o valor para a posicao " + (j + 1) + " do campo " + (i + 1));
                System.out.print("Valor: ");
                matriz[i][j] = leitor.nextInt();
            }
        }
        leitor.close();
        return matriz;
    }
    // Método random
    static int[][] randomMatriz(int[][] matriz){
        Random gerador = new Random();

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = gerador.nextInt(1, 9);
                }
            }
        return matriz;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o tamanho da matriz quadrada:");
        int tamanhoMatriz = scanner.nextInt();

        int matriz[][] = new int[tamanhoMatriz][tamanhoMatriz];
        int novaMatriz[][] = new int[tamanhoMatriz][tamanhoMatriz];

        System.out.println("Deseja gerar a matriz com numeros aleatorios? ");
        System.out.println("1 -> Sim");
        System.out.println("2 -> Nao");
        int gerar = scanner.nextInt();
        while (gerar > 2) {
                System.out.println("Digite a opcao correta");
                System.out.println("1 -> Sim");
                System.out.println("2 -> Nao");
                gerar = scanner.nextInt();
        }
        if (gerar == 1) {
            matriz = randomMatriz(matriz); 

        }else if (gerar == 2) {
            matriz = iterandoMatriz(matriz); 
        }

        System.out.println("Matriz inicial:");
        for (int i = 0; i < tamanhoMatriz; i++) {
            for (int j = 0; j < tamanhoMatriz; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.print("\n");
        }

        System.out.println("Digite quantos graus deseja realizar a rotacao da matriz:");
        System.out.println("90°");
        System.out.println("180°");
        System.out.println("270°");
        System.out.println("360°");
        int opcao = scanner.nextInt();

        while (opcao % 90 != 0 || opcao > 360) {
                System.out.println("Digite quantos graus deseja rotacionar:");
                System.out.println("90°");
                System.out.println("180°");
                System.out.println("270°");
                System.out.println("360°");
                opcao = scanner.nextInt();
        }

        novaMatriz = matriz;
        if (opcao % 90 == 0 && opcao <= 360) {
            int rotacao = opcao / 90;
            for (int numRotacao = 0; numRotacao < rotacao; numRotacao++) {
                novaMatriz = rotacaoMatriz(novaMatriz);
            }
        }

        System.out.println("A matriz nova:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + novaMatriz[i][j] + "]");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
