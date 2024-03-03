import java.util.Scanner;
public class Henrique {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] numeros = new int[5782];

        for (int i = 0; i < 5782; i++) {
            System.out.print("Digite um número inteiro positivo: ");
            numeros[i] = scanner.nextInt();
        }

        int menorDiferenca = Integer.MAX_VALUE;
        int posicao1 = 0;
        int posicao2 = 0;

        for (int i = 0; i < 5781; i++) {
            int diferenca = Math.abs(numeros[i] - numeros[i + 1]);
            if (diferenca < menorDiferenca) {
                menorDiferenca = diferenca;
                posicao1 = i;
                posicao2 = i + 1;
            }
        }
        
        System.out.println("Os números com a menor diferença absoluta são " + numeros[posicao1] + " e " + numeros[posicao2] +
                ", nas posições " + posicao1 + " e " + posicao2 + ".");
    }


}
