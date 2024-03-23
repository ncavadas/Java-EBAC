public class FabricaCarro implements IFabricaVeiculo{
    @Override
    public IVeiculo criarVeiculo() {
        return new Carro();
    }
}
