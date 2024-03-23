//10:51
public class FabricaComContrato extends Fabrica{

    @Override
    Carro pegarCarro(String requerNota) {
        if ("A".equals(requerNota)) {
            return new FabricaCarro1(100, "cheio", "azul");
        } else {
            return null;
        }
    }
}
