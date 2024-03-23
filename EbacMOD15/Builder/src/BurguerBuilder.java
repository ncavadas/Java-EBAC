public abstract class BurguerBuilder {
    Burguer burguer = new Burguer();

    abstract void buildPao();
    abstract void buildCarne();
    abstract void buildSalada();
    abstract void buildQueijo();
    abstract void buildMolho();

    Burguer build(){
        return burguer;
    }
}
