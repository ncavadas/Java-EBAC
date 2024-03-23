public class Main {
    public static void main(String[] args) {


        IFabricaVeiculo fabricaCarro = new FabricaCarro();
        IVeiculo carro = fabricaCarro.criarVeiculo();
        carro.mover();
        IFabricaVeiculo fabricaCaminhao = new FabricaCaminhao();
        IVeiculo caminhao = fabricaCaminhao.criarVeiculo();
        caminhao.mover();
    }
}
