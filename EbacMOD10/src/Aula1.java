import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Aula1 {
    public static void main(String[] args) {
    //Exercícios de if, if else, else

        //    Verificar se um número é divisível por 5 e 7. ****************************

        /*Scanner teclado = new Scanner (System.in);
        System.out.println("Entre com o valor: ");
        double numero = teclado.nextDouble();

        if (numero %7 == 0 && numero %5 == 0){
            System.out.println("É divisível por 5 e 7.");
        }
        else if (numero %7 == 0 && numero %5 != 0) {
            System.out.println("é divisível apenas por 7");
        }
        else if (numero %5 == 0 && numero %7 != 0) {
            System.out.println("é divisível apenas por 5");
        }
        else {
            System.out.println("Não é divisível nem por 7 e nem por 5");
        }*/


        //    Verificar se um caractere é uma vogal ou uma consoante. charAt (contador/índice)****************************

        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a letra:");
        String caractere = teclado.next();

        if (caractere.length() == 1) {
            char letra = Character.toLowerCase(caractere.charAt(0));


            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                System.out.println("A letra " + letra + " é uma vogal");
            } else if (letra>='a' && letra<='z' || letra == 'ç'){
                System.out.println("A letra " + letra + " é uma consoante");
            }
            else {
                System.out.println(letra+" não é uma letra do alfabeto");
            }
        }
        else{
                System.out.println("Por favor, digite apenas um caractere.");
        }
        teclado.close();*/


        //    Verificar se um número é positivo, negativo ou zero. ****************************

        /*Scanner teclado = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = teclado.nextDouble();

        if (numero > 0) {
            System.out.println("O número " + numero + " é positivo.");
        } else if (numero < 0) {
            System.out.println("O número " + numero + " é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        teclado.close();*/


        //    Verificar se um número é par ou ímpar. % para resto// ex: variavel%2 == 0 ****************************

        /*Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double numero = teclado.nextDouble();

        if (numero%2 == 0){
            System.out.println("O número "+numero+" é par.");
        }
        else {
            System.out.println("O número "+numero+" é ímpar.");
        }
        teclado.close();*/


        //    Calcular a soma de dois números e verificar se é positiva, negativa ou zero. ****************************

        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double numero1 = teclado.nextDouble();
        System.out.println("Digite o segundo número:");
        double numero2 = teclado.nextDouble();
        double soma = numero1+numero2;
        if (soma%2 == 0){
            System.out.println(numero1+" + "+numero2+" = "+soma+" Que é um número par.");
        }
        else {
            System.out.println(numero1+" + "+numero2+" = "+soma+" Que é um número ímpar.");
        }
        teclado.close();*/


        //    Determinar o maior de dois números. ****************************

        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double numero1 = teclado.nextDouble();
        System.out.println("Digite o segundo número:");
        double numero2 = teclado.nextDouble();
        if (numero1>numero2) {
            System.out.println("O maior número é: "+numero1);
        }
        else {
            System.out.println("O maior número é: "+numero2);
        }
        teclado.close();*/


        //    Determinar o menor de três números. ****************************

        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        double numero1 = teclado.nextDouble();
        System.out.println("Digite o segundo número:");
        double numero2 = teclado.nextDouble();
        if (numero1<numero2) {
            System.out.println("O menor número é: "+numero1);
        }
        else {
            System.out.println("O menor número é: "+numero2);
        }
        teclado.close();*/


        //    Verificar se um ano é bissexto. **************************** (|| ou) (&& e)

       /* Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o ano:");
        double ano = teclado.nextDouble();

        if (ano%4 == 0 && ano%100 != 0 || ano%400 == 0) {
            System.out.println("O ano "+ano+" é bissexto");
        }
        else {
            System.out.println("O ano "+ano+" não é bissexto");
        }
        teclado.close();*/



        //    Calcular a média de três números e determinar se é maior, igual ou menor que 10. ****************************

       /* Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        double numero1 = teclado.nextDouble();
        System.out.println("Digite o segundo número");
        double numero2 = teclado.nextDouble();
        System.out.println("Digite o terceiro número");
        double numero3 = teclado.nextDouble();

        double media = ((numero1+numero2+numero3)/3);

        if (media > 10) {
            System.out.println("A média é maior que 10 ");
            System.out.println("Média: "+media);
        }
        else if (media < 10) {
            System.out.println("A média é menor que 10 ");
            System.out.println("Média: "+media);
        }
        else {
            System.out.println("A média é 10 ");
            System.out.println("Média: "+media);
        }
        teclado.close();*/


        //    Verificar se um número é primo. **************************** (vai precisar de repetição, esperar aula 2)
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = teclado.nextDouble();*/


    }
}

