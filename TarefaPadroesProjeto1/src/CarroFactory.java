public class CarroFactory extends Factory {

    @Override
    public Carro criarCarro() {
        return new Tesla();
    }

    @Override
    public Motor criarMotor() {
        return new MotorEletrico();
    }

    @Override
    public String verificarQualidade() {
        return "Verificando qualidade das baterias e do sistema elétrico.";
    }

    @Override
    public String calcularCustoProducao() {
        return "Custo de produção do Tesla: alto, devido à bateria.";
    }

    @Override
    public String definirPreco() {
        return "Preço definido: R$ 350.000,00.";
    }

    public String exibirHistoricoDaMarca() {
        return "Marca fundada em 2003, especializada exclusivamente em veículos elétricos.";
    }
}