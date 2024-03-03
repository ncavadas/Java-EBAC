import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Exercicio2_mod11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Map<String, String> grupoFeminino = new TreeMap<>(); colocando a colection map no inicio vc tem maior utilização no codigo numa futura mudança
        TreeMap<String, String> grupoFeminino = new TreeMap<>();
        TreeMap<String, String> grupoMasculino = new TreeMap<>();

        System.out.print("Digite os nomes e sexo separando pessoas por - e , (ex.Nome1-F,Nome2-M): ");
        String entrada = teclado.nextLine();

        String[] grupoGeral = entrada.split(",");

        /* Forma sem simplificar o for
        for (int i = 0; i < grupoGeral.length; i++) {
            String parte = grupoGeral[i];
            String[] dados = parte.split("-");
            */
        for (String parte : grupoGeral) {
            String[] dados = parte.split("-");
            if (dados.length == 2) {
                String nome = dados[0].trim();
                String sexo = dados[1].trim();

                //if (sexo == "F"||sexo == "F") ou
                if (sexo.equals("F") || sexo.equals("f")) {
                    grupoFeminino.put(nome, sexo);

                } else {
                    grupoMasculino.put(nome, sexo);
                }
                //Else para validação do formato a ser utilizado
            } else {
                System.out.println("Formato inválido para: " + parte);
            }
        }
        System.out.println("Feminino:");
        for (Map.Entry<String, String> entradaFeminina : grupoFeminino.entrySet()) {
            String nome = entradaFeminina.getKey();
            System.out.println(nome);
        }

        System.out.println("Masculino:");
        for (Map.Entry<String, String> entradaMasculina : grupoMasculino.entrySet()) {
            String nome = entradaMasculina.getKey();
            System.out.println(nome);
        }

        teclado.close();



    }
}