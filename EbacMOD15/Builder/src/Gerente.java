public class Gerente {
    private BurguerBuilder burguerBuilder;
    public void setBuilder(BurguerBuilder burguerBuilder){
        this.burguerBuilder = burguerBuilder;
    }
    public Burguer buildBurguer() {
        burguerBuilder.buildPao();
        burguerBuilder.buildCarne();
        burguerBuilder.buildSalada();
        burguerBuilder.buildQueijo();
        burguerBuilder.buildMolho();

        return burguerBuilder.build();
    }
}
