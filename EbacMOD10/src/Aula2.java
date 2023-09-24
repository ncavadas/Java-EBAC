import java.util.Scanner;
public class Aula2 {
// Exercícios com for
public static void main(String[] args) {


//1. Imprima os números de 1 a 10.

    /*for (int i = 1; i <= 10; i++) {
        System.out.println(i);*/


//2. Calcule e imprima a soma dos números de 1 a 100.

    /*int soma = 0;

    for (int i = 1; i <= 100; i++) {
        soma += i;
    }

    System.out.println("A soma dos números de 1 a 100 é: " + soma);*/

//3. Imprima os números pares de 2 a 20.

    /*for (int i = 2; i <= 20; i++){
        if (i%2 == 0){
            System.out.println(i);
        }
    }
    //ou
    for (int i = 2; i <= 20; i += 2) {
        System.out.println(i);
    }*/


//4. Imprima os números ímpares de 1 a 19.

    /*for (int i = 1; i <= 19; i++) {
        if (i % 2 != 0) {
            System.out.println(i);
        }
    }
    //ou
    for (int i = 1; i <= 19; i += 2) {
        System.out.println(i);
    }*/


//5. Calcule e imprima a tabuada do 7 (de 1 a 10). **entrar com numero desejado**

    /*Scanner teclado = new Scanner(System.in);
    System.out.println("Número da tabuada a ser realizada");
    double numero = teclado.nextDouble();

    for (int i = 1; i <= 10; i++) {
        double resultado = numero * i;
        System.out.println(numero + " x " + i + " = " + resultado);

    }
    teclado.close();*/

//6. Imprima os números de 10 a 1 em ordem decrescente.

    /*for (int i = 10; i >= 1; i--) {
        System.out.println(i);
    }*/


//7. Calcule e imprima a média de 5 números inseridos pelo usuário.

  /*  Scanner scanner = new Scanner(System.in);
    int totalNumeros = 5;
    double soma = 0;

    System.out.println("Digite " + totalNumeros + " números");

    for (int i = 0; i < totalNumeros; i++) {
        System.out.print("Número " + (i + 1) + ": ");
        double numero = scanner.nextDouble();
        soma += numero;
    }

    double media = soma / totalNumeros;
    System.out.println("A média dos números é: " + media);

    scanner.close();*/
//8. Imprima os primeiros 10 números da sequência de Fibonacci.
//9. Imprima os números primos de 1 a 50.
//10. Imprima os múltiplos de 3 de 3 a 30.


}
}
