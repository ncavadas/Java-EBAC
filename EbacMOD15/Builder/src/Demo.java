
public class Demo {
    public static void main(String[] args) {
        Gerente burguerRestaurante = new Gerente();
        burguerRestaurante.setBuilder(new XBurguerBuilder());
        buildBurguer(burguerRestaurante);
    }
    private static void buildBurguer(Gerente burguerRestaurante){
        Burguer burguer = burguerRestaurante.buildBurguer();
        burguer.print();

    }
}
