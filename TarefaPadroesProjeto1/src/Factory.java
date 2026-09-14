public abstract class Factory {

    public abstract Carro criarCarro();

    public abstract Motor criarMotor();

    public abstract String verificarQualidade();

    public abstract String calcularCustoProducao();

    public abstract String definirPreco();

    public String exibirInformacoes() {
        return "Fábrica pronta para iniciar a produção.";
    }
}