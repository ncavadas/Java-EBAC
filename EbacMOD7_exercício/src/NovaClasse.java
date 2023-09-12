public class NovaClasse {
    public static void main(String[] args){
        Bolsa minhaBolsa = new Bolsa();
        minhaBolsa.setCapacidade(8);
        minhaBolsa.setCor("rosa");
        System.out.println("Cor da bolsa: " + minhaBolsa.getCor());
        System.out.println("Capacidade da bolsa: " + minhaBolsa.getCapacidade() + " litros");


        minhaBolsa.abrir();

        minhaBolsa.fechar();

    }
}
