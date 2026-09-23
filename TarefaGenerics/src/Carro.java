public abstract class Carro {

    private final String placa;
    private final int anoFabricacao;
    private final String cor;

    protected Carro(String placa, int anoFabricacao, String cor) {
        this.placa = placa;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public String getCor() {
        return cor;
    }
}