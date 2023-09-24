import java.util.Scanner;
public class AExercicioMOD10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int totalBimestres = 4;
        double soma = 0;
        System.out.println("Média dos "+totalBimestres+" bimestres");

        for (int i = 0; i < totalBimestres; i++) {
            System.out.print("Nota do " +(i + 1) + "º Bimestre ");
            double numero = teclado.nextDouble();
            soma += numero;
        }
        double media = soma / totalBimestres;
        System.out.println("A média do bimestre é: "+media);

        teclado.close();
        if (media>=7){
            System.out.println("Aprovado!!");
        }
        else if (media>=4) {
            System.out.println("Em recuperação");
        }
        else {
            System.out.println("Reprovado");
        }

    }

}
