public class Demo {

    public static void main(String[] args) {
        CarroFactory carroFactory = new CarroFactory();
        System.out.println(carroFactory.exibirInformacoes());
        System.out.println(carroFactory.exibirHistoricoDaMarca());

        Carro tesla = carroFactory.criarCarro();
        Motor motorEletrico = carroFactory.criarMotor();

        System.out.println(tesla.montar());
        System.out.println(motorEletrico.ligar());
        System.out.println(motorEletrico.informarTipoDeCombustivel());

        if (Boolean.parseBoolean(((MotorEletrico) motorEletrico).regenerarEnergia())) {
            System.out.println("Energia regenerada com sucesso pelo motor elétrico.");
        }

        System.out.println(carroFactory.verificarQualidade());
        System.out.println(carroFactory.calcularCustoProducao());
        System.out.println(carroFactory.definirPreco());

        if (((Tesla) tesla).carregarBateria()) {
            System.out.println("Bateria do Tesla carregada com sucesso.");
        }

        CompanyAutoFactory companyAutoFactory = new CompanyAutoFactory();
        System.out.println(companyAutoFactory.exibirInformacoes());
        System.out.println(companyAutoFactory.listarMarcasDoConglomerado());

        Carro chevrolet = companyAutoFactory.criarCarro();
        Motor motorCombustao = companyAutoFactory.criarMotor();

        System.out.println(chevrolet.montar());
        System.out.println(motorCombustao.ligar());
        System.out.println(motorCombustao.informarTipoDeCombustivel());

        if (Boolean.parseBoolean(((MotorCombustao) motorCombustao).liberarGasesDeEscape())) {
            System.out.println("Gases liberados com sucesso pelo motor a combustão.");
        }

        if (((Chevrolet) chevrolet).abastecerCombustivel()) {
            System.out.println("Chevrolet abastecido com sucesso.");
        }

        Carro cadillac = companyAutoFactory.criarCarroPorMarca("Cadillac");
        System.out.println(cadillac.montar());

        if (((Cadillac) cadillac).ativarModoLuxo()) {
            System.out.println("Modo luxo do Cadillac ativado com sucesso.");
        }

        System.out.println(companyAutoFactory.verificarQualidade());
        System.out.println(companyAutoFactory.calcularCustoProducao());
        System.out.println(companyAutoFactory.definirPreco());
    }
}