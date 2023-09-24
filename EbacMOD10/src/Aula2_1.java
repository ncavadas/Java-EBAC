public class Aula2_1 {
    public static void main(String[] args) {


//Exercícios usando While

//1. Imprima os números de 1 a 10.

        /*int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }*/


//2. Calcule e imprima a soma dos números de 1 a 100.

        /*int i = 1;
        int soma = 0;
        while (i <= 100) {
            soma += i;
            i++;
        }
        System.out.println("A soma dos números de 1 a 100 é: " + soma);*/


//3. Imprima os números pares de 2 a 20.
/*
        int numero = 2;
        while (numero<=20) {
            System.out.println(numero);
            numero += 2;
        }*/
//4. Imprima os números ímpares de 1 a 19.

        /*int numero = 1;
        while (numero <= 19) {
            System.out.println(numero);
            numero += 2;
        }*/


//5. Calcule e imprima a tabuada do 7 (de 1 a 10).

        /*int numero = 7;
        int i = 1;
        while (i <= 10) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
            i++;
        }*/

//6. Imprima os primeiros 10 números da sequência de Fibonacci.

        /*int n = 10;
        int primeiroTermo = 0;
        int segundoTermo = 1;
        int i = 0;

        while (i < n) {
            System.out.println(primeiroTermo);
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
            i++;
        }*/

    }
}
