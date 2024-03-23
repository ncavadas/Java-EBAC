public class VBurguerBuilder extends BurguerBuilder{
    @Override
    public void buildPao() {
        burguer.setPao("Pão vegano");
    }

    @Override
    public void buildCarne() {
        burguer.setCarne("Futuro");
    }

    @Override
    public void buildSalada() {
        burguer.setSalada("Caprese");
    }

    @Override
    public void buildQueijo() {
        burguer.setQueijo("Minas");
    }

    @Override
    public void buildMolho() {
        burguer.setMolho("Pesto");
    }
}
