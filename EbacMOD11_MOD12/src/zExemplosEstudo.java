import java.util.*;
import java.util.Map.Entry;
public class zExemplosEstudo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        TreeMap<String, Integer> grupoMenor45 = new TreeMap<>();
        TreeMap<String, Integer> grupoMaior45 = new TreeMap<>();

        System.out.print("Digite os nomes separando pessoas por , : ");
        String entrada = scanner.nextLine();

        String[] partes = entrada.split(",");

        for (String parte : partes) {
            String[] dados = parte.split("-");
            if (dados.length == 2) {
                String nome = dados[0].trim();
                int idade = Integer.parseInt(dados[1].trim());

                if (idade < 45) {
                    grupoMenor45.put(nome, idade);
                } else {
                    grupoMaior45.put(nome, idade);
                }
            } else {
                System.out.println("Formato inválido para: " + parte);
            }
        }


        System.out.println("Pessoas com menos de 45 anos:");
        for (Entry<String, Integer> entradaMenor : grupoMenor45.entrySet()) {
            String nome = entradaMenor.getKey();
            int idade = entradaMenor.getValue();
            System.out.println(nome + "-" + idade);
        }

        System.out.println("Pessoas com 45 anos ou mais:");
        for (Entry<String, Integer> entradaMaior : grupoMaior45.entrySet()) {
            String nome = entradaMaior.getKey();
            int idade = entradaMaior.getValue();
            System.out.println(nome + "-" + idade);
        }

        scanner.close();
    }
}

