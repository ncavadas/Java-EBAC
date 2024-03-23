public class FabricaSemContrato extends Fabrica{

    @Override
    Carro pegarCarro(String requerNota) {
        if ("A".equals(requerNota)) {
            return new FabricaCarro2(100, "cheio", "azul");
        } else {
            return null;
        }
    }
}
