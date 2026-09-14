public class MotorCombustao extends Motor {

    @Override
    public String ligar() {
        return "Motor a combustão ligado com partida a explosão.";
    }

    @Override
    public String informarTipoDeCombustivel() {
        return "Este motor utiliza gasolina ou etanol.";
    }

    public String liberarGasesDeEscape() {
        return "Liberando gases pelo escapamento.";
    }
}