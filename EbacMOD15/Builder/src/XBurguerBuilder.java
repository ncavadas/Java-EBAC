public class XBurguerBuilder extends BurguerBuilder {
    @Override
    public void buildPao() {
        burguer.setPao("Pão Branco");
    }

    @Override
    public void buildCarne() {
        burguer.setCarne("Bovina");
    }

    @Override
    public void buildSalada() {
        burguer.setSalada("Salada padrão");
    }

    @Override
    public void buildQueijo() {
        burguer.setQueijo("Queijo suiço");
    }
    @Override
    public void buildMolho() {
        burguer.setMolho("Molho secreto");
    }

}
