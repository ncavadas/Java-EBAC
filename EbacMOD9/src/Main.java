//unboxing
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Exemplo 1 - passo a passo
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double valorPrimitivo = teclado.nextDouble();    
        System.out.println("Valor primitivo inserido: " + valorPrimitivo);
        Double valorWrapper = Double.valueOf(valorPrimitivo);
        System.out.println("Valor wrapper: " + valorWrapper);

        //Exemplo 2 azul
        Character azulWrapper = Character.valueOf('A');
        System.out.println(azulWrapper);
        //Exemplo 3 rosa
        Boolean rosaWrapper = Boolean.valueOf(true);
        System.out.println(rosaWrapper);
        //Exemplo 4 verde
        Long verdeWrapper = Long.valueOf(123456789L);
        System.out.println(verdeWrapper);
        //Exemplo 5 amarelo
        Byte amareloWrapper = Byte.valueOf((byte) 42);
        System.out.println(amareloWrapper);
    }
}


