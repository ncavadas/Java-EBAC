import java.util.Scanner;
public class Aula1_2 {
    public static void main(String[] args) {

   //Operador ternário

    //Verificar número positivo ou negativo

        /*Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número desejado: ");
        int numero = teclado.nextInt();

        String resultado = (numero>= 0) ? "positivo" : "negativo";
        System.out.println("O numero é "+resultado);

        teclado.close();*/


    //Determinar se um número é par ou ímpar:

        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o número desejado");

        double numero = teclado.nextDouble();

        String resultado = (numero%2 == 0) ? "par" : "ímpar";
        System.out.println("O número é " +resultado);

        teclado.close();*/


    //Verificar se um ano é bissexto:

        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano: ");
        double ano = teclado.nextDouble();

        String resultado = (ano%4 ==0 && ano%100 != 0) || (ano%400 == 0) ? "Bissexto" : "Não bissexto";
        System.out.println("O ano é "+resultado);

        teclado.close();*/


    //Verificar se um número é múltiplo de outro:

        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro numero");
        double numero1 = teclado.nextDouble();
        System.out.println("Digite o segundo número");
        double numero2 = teclado.nextDouble();

        String resultado = (numero1%numero2 == 0) ? "O número "+ numero1+" é divisível por "+ numero2 : "O número "+ numero1+" não é divisível por "+ numero2;
        System.out.println(resultado);

        teclado.close();*/


    //Determinar o maior de três números:

        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        double numero1 = teclado.nextDouble();
        System.out.println("Digite o segundo número");
        double numero2 = teclado.nextDouble();
        System.out.println("Digite o terceiro número");
        double numero3 = teclado.nextDouble();

        double resultado = (numero1>=numero2) ? ((numero1>=numero3) ? numero1 : numero3) : ((numero2>=numero3) ? numero2 : numero3);
        System.out.println("O maior número é: "+ resultado);

        teclado.close();*/

    //Verificar se um caractere é uma vogal ou consoante:

       /* Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um caractere");
        char caractere = teclado.next().charAt(0);

        String resultado = (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u' ||
                caractere == 'A' || caractere == 'E' || caractere == 'I' || caractere == 'O' || caractere == 'U')
                ? "é uma vogal" : "é uma consoante";

        System.out.println("O caractere " + resultado);
        teclado.close();*/


    }
}
