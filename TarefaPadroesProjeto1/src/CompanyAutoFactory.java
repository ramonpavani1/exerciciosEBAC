public class CompanyAutoFactory extends Factory {

    @Override
    public Carro criarCarro() {
        return new Chevrolet();
    }

    @Override
    public Motor criarMotor() {
        return new MotorCombustao();
    }

    @Override
    public String verificarQualidade() {
        return "Verificando qualidade em todas as marcas do conglomerado.";
    }

    @Override
    public String calcularCustoProducao() {
        return "Custo de produção variável entre as marcas do conglomerado.";
    }

    @Override
    public String definirPreco() {
        return "Preços definidos por faixa: popular, intermediária e luxo.";
    }

    public String listarMarcasDoConglomerado() {
        return "Conglomerado possui as marcas: Chevrolet, Cadillac, Buick e GMC.";
    }

    public Carro criarCarroPorMarca(String marca) {
        if (marca.equalsIgnoreCase("Cadillac")) {
            return new Cadillac();
        }
        return new Chevrolet();
    }
}