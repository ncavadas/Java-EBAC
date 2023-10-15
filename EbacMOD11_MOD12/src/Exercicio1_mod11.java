import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1_mod11 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite os nomes separando pessoas por , :");
        String nomes = teclado.next();

        String[] cadastro = nomes.split(",");
        //trim para retirar espaços em branco e coloquei em minusculo para não ficar fora de ordem caso tivessem nomes em maiusculo e minusculo na mesma entrada.
        for (int i = 0; i < cadastro.length; i++) {
            cadastro[i] = cadastro[i].trim().toLowerCase();
        }
        Arrays.sort(cadastro);
        for (String s : cadastro) System.out.println(s);
        teclado.close();
    }

}
