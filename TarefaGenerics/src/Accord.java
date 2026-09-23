public class Accord extends Carro {

    private final String volumeMotor;
    private final String tipoCambio;

    public Accord(String placa, int anoFabricacao, String cor, String volumeMotor, String tipoCambio) {
        super(placa, anoFabricacao, cor);
        this.volumeMotor = volumeMotor;
        this.tipoCambio = tipoCambio;
    }

    public String getMotorizacao() {
        return volumeMotor;
    }

    public String getTipoCambio() {
        return tipoCambio;
    }
}