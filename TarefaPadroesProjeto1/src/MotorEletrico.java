public class MotorEletrico extends Motor {

    @Override
    public String ligar() {
        return "Motor elétrico ligado silenciosamente.";
    }

    @Override
    public String informarTipoDeCombustivel() {
        return "Este motor utiliza energia elétrica armazenada em bateria.";
    }

    public String regenerarEnergia() {
        return "Recuperando energia através da frenagem regenerativa.";
    }
}