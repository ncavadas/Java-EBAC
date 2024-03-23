public class FabricaCaminhao implements IFabricaVeiculo{
    @Override
    public IVeiculo criarVeiculo() {
        return new Caminhao();
    }
}
