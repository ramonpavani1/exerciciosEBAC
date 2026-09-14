public abstract class Carro {

    public abstract void montarChassi();

    public abstract void instalarMotor();

    public abstract void instalarRodas();

    public abstract void pintar();

    public boolean montar() {
        montarChassi();
        instalarMotor();
        instalarRodas();
        pintar();
        return false;
    }
}