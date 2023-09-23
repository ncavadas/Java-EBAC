import java.util.Scanner;

import java.util.Scanner;
public class Aula1_1 {
    public static void main(String[] args) {
        //estruturas de controle if encadeadas

//Calculadora de IMC: Crie um programa que calcula o Índice de Massa Corporal (IMC) com base no peso e na altura da pessoa. Use if encadeados para determinar a faixa de peso (abaixo do peso, peso normal, sobrepeso, etc.).
        /*Scanner teclado = new Scanner(System.in);

        System.out.println("Altura em metros: ");
        double altura = teclado.nextDouble();
        System.out.println("Peso em quilogramas: ");
        double peso = teclado.nextDouble();
        double calculoImc = peso / (altura * altura);
        String faixaPeso;

        if (calculoImc<18.5){
            faixaPeso = "Abaixo do peso";
        }
        else if (calculoImc<24.9){
            faixaPeso = "Dentro do peso normal";
        }
        else if (calculoImc<29.9){
            faixaPeso = "Acima do peso";
        }
        else if (calculoImc<34.9){
            faixaPeso = "Obesidade Grau I";
        }
        else if (calculoImc<39.9){
            faixaPeso = "Obesidade Grau II (Severa)";
        }
        else {
            faixaPeso = "Obesidade Grau III (Móbida)";
        }
        System.out.println("IMC: "+calculoImc);
        System.out.println("Classificação: "+faixaPeso);

        teclado.close();
        //Para usar if no lugar de else if, teria que definir o inicio e o fim de cada classificação. ex: 18,5 até 24,9
        */


//Calculadora de Desconto de Compra: Crie um programa que calcula o preço final de uma compra com base no valor total e em um desconto. O desconto pode variar dependendo do valor total da compra.
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor total: ");
        double valorTotal = teclado.nextDouble();

        double desconto = calcularDesconto(valorTotal);
        double precoFinal = valorTotal - desconto;

        System.out.println("O valor do desconto: R$" + desconto);
        System.out.println("Preço final da compra: R$" + precoFinal);

        teclado.close();
    }
    public static double calcularDesconto(double valorTotal) {
        double desconto = 0;

        if (valorTotal >= 200 && valorTotal< 400){
            desconto = valorTotal * 0.1;
        } else if (valorTotal>= 400) {
            desconto = valorTotal * 0.15;
        }
        return desconto;
    }*/

//Determinar o Tipo de Triângulo: Dado o comprimento dos três lados de um triângulo, escreva um programa que determine se ele é equilátero, isósceles ou escaleno.
        /*Scanner teclado = new Scanner(System.in);
        System.out.println("Tamanho do primeiro lado:");
        double ladoa = teclado.nextDouble();
        System.out.println("Tamanho do segundo lado:");
        double ladob = teclado.nextDouble();
        System.out.println("Tamanho do terceiro lado:");
        double ladoc = teclado.nextDouble();

        if (ladoa == ladob && ladob == ladoc) {
            System.out.println("Triângulo equilátero.");
        } else if (ladoa == ladob || ladoa == ladoc || ladob == ladoc) {
            System.out.println("Triângulo isósceles.");
        } else {
            System.out.println("Triângulo escaleno.");
        }*/


//Calculadora de Juros Compostos: Crie um programa que calcule o montante final de um investimento com base no principal, taxa de juros e tempo de investimento. Use if encadeados para calcular os juros compostos com diferentes taxas de juros.

        /*Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o valor inicial do investimento: ");
        double principal = teclado.nextDouble();
        System.out.print("Informe a taxa de juros anual (%): ");
        double taxaDeJurosAnual = teclado.nextDouble() / 100.0;
        System.out.print("Informe o tempo de investimento (em anos): ");
        int tempoDeInvestimento = teclado.nextInt();

        double montanteFinal = principal;
        for (int ano = 1; ano <= tempoDeInvestimento; ano++) {
            if (ano <= 3) {
                montanteFinal *= (1 + taxaDeJurosAnual);
            } else if (ano <= 5) {
                montanteFinal *= (1 + taxaDeJurosAnual * 1.5);
            } else {
                montanteFinal *= (1 + taxaDeJurosAnual * 2.0);
            }
        }
        teclado.close();
        System.out.println("O montante final após " + tempoDeInvestimento + " anos é: " + montanteFinal);*/
    }
}
