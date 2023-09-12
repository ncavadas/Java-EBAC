import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    //Exercício módulo 8 EBAC Média com 4 notas
        double nota1 = 10;
        double nota2 = 7;
        double nota3 = 6;
        double nota4 = 9;
        double mediaSemestre = ((nota1+nota2+nota3+nota4)/4);
        System.out.println(mediaSemestre);
    }

    void gaveta() {
        /*//exercício soma
        System.out.println("Chocolate");
        int var;
        var = 20;
        System.out.println(var);
        int soma;
        soma = 100 + 100;
        System.out.println(soma);
        double real = 200;
        System.out.println("20% de " + real + " é igual a " + real * 0.2);

        //testando tipos de variaveis float-resto
        float f;
        f = 101.0f;
        int a = 10;
        int b = 3;
        System.out.println(a % b);
        a += 3;//a=a+3;
        System.out.println(++a);
        System.out.println(++a);
        System.out.println(++a);
        System.out.println(++a);
        System.out.println(--a);
        System.out.println(--a);

        //exercicio cinema
        double ingresso=2;
        double deslocamento=3;
        double pipoca=4;
        double refrigerante=5;
        System.out.println ("O gasto total foi de: "+(ingresso+deslocamento+pipoca+refrigerante));

        //exercicio média com pesos nas notas
        double nota1=8;
        double nota2=3;
        double trabalho=7;
        double media=(((nota1*2+nota2*2)+trabalho)/5);
        System.out.println ("A média do semestre foi: "+media);

        //exercício conversão dólar-real real-dolar
        double valorDolar=24;
        double valorReal=30;
        double dolar=5.50;
        double realDolar=valorReal/dolar;
        double dolarReal=valorDolar*dolar;
        System.out.printf (valorDolar+" dolares custam: "+dolarReal+" reais.");
        System.out.printf ("Com "+valorReal+" reais, poderei comprar: %.2f", realDolar );

        //exercicio petshop
        double banho=40;
        double tosa=50;
        double desconto=0.1;
        boolean socio = false;
        if (socio) {
            System.out.println("O total com desconto é:" + (banho + tosa) * (1 - desconto));
        }
        else {
            System.out.println("O total é:" + (banho + tosa));
        }
        //identificar se é magali, monica, cascão ou cebolinha. (apenas if)
        boolean vermelho =false;
        char sexo ='F';
        String resposta="";
        if (vermelho && sexo == 'F'){
            resposta = "monica";
        }
        if (!vermelho && sexo == 'F'){
            resposta = "magali";
        }
        if (vermelho && sexo != 'F'){
            resposta = "cascao";
        }
        if (!vermelho && sexo != 'F'){
            resposta = "cebolinha";
        }
        System.out.println("O personagem é "+resposta);

        //identificar se é magali, monica, cascão ou cebolinha. (else if)
        boolean vermelho =false;
        char sexo ='F';
        String resposta="";
        if (vermelho && sexo == 'F'){
            resposta = "monica";
        }
        else if (!vermelho && sexo == 'F'){
            resposta = "magali";
        }
        else if (vermelho && sexo != 'F'){
            resposta = "cascao";
        }
        else {
            resposta = "cebolinha";
        }
        System.out.println("O personagem é "+resposta);

        //Exercício mônica de if encadeado com leitura de teclado.
        Scanner teclado= new Scanner(System.in);
        String cor;
        String sexo;
        System.out.print("O personagem usa vermelho s/n?");
        cor =teclado.nextLine();
        System.out.print("O personagem é menina s/n?");
        sexo =teclado.nextLine();
        if (cor.equals("s")){
            //se usa vermelho, pode ser monica ou cascao
            if(sexo.equals("s")){
                System.out.println("monica");
            }
            else {
                System.out.println("cascão");
            }
        }
        else {
            //não usa vermelho, magali ou cebolinha
            if(sexo.equals("s")){
                System.out.println("magali");
            }
            else {
                System.out.println("cebolinha");
            }
        }

        //exercicio com variavel auxiliar para fazer trocas de valores entre variaveis
        int a = 10;
        int b = 5;
        int aux;
        if (a>b){
           aux=a;
           a=b;
           b=aux;
       }
        System.out.println(a+"'"+b);

        // Este programa encontra o maior de 3 números
       int a = 10;
       int b = 5;
       int c = 6;
       int maior=0;
       if (a>b && a>c ){
           maior = a;
       }
       else if (b>c){
               maior = b;
       }
       else {
           maior = c;
       }
       System.out.println(maior);

        //Ecercício verificação de febre
        double temperatura= 36.5;
        double febre =36.5;

        if (temperatura>=febre){
            System.out.println("Está com febre");
        }
        else {
            System.out.println("Não está com febre");
        }

        //Exercício cinema 2 (combo estudante)
        boolean estudante =false;
        int entrada =30;
        int pipoca =24;
        int bebida =10;
        int comboInt =(entrada+pipoca+bebida);
        int comboMei =((entrada/2)+pipoca+bebida);
        if (estudante) {
            System.out.println (comboMei);
        }
        else {
            System.out.println (comboInt);
        }

        // lê 3 números e organiza em ordem crescente
        Scanner teclado= new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("digite o primeiro número");
        a=teclado.nextInt();
        System.out.print("digite o segundo número");
        b=teclado.nextInt();
        System.out.print("digite o terceiro número");
        c=teclado.nextInt();
        if (a<b && a<c){
            //o A é o maior
            System.out.print(a);
            if(b<c){
                System.out.print(" - "+b+" - "+c);
            }
            else {
                System.out.print(" - " + c + " - " + b);
            }
        }
        else if (b<c){
            //o B é maior
            System.out.print(b);
            if(a<c){
                System.out.print(" - "+a+" - "+c);
            }
            else {
                System.out.print(" - " + c + " - " + a);
            }
        }
        else {
            // o C é o maior
            System.out.print(c);
            if(b<a){
                System.out.print(" - "+b+" - "+a);
            }
            else {
                System.out.print(" - " + a + " - " + b);
            }
        }
        }

        // tecnica de Borbulhamento
        Scanner teclado= new Scanner(System.in);
            int a;
            int b;
            int c;
            int aux;
            System.out.print("digite o primeiro número");
            a=teclado.nextInt();
            System.out.print("digite o segundo número");
            b=teclado.nextInt();
            System.out.print("digite o terceiro número");
            c=teclado.nextInt();
            System.out.println(a+" "+b+" "+c);
            if (a>b) {
                aux=a;
                a=b;
                b=aux;
            }
            System.out.println(a+" "+b+" "+c);
            if (b>c) {
                aux=c;
                c=b;
                b=aux;
            }
            System.out.println(a+" "+b+" "+c);
            if (a>b) {
                aux=a;
                a=b;
                b=aux;
            }
            System.out.println(a+" "+b+" "+c);*/

        }
}


