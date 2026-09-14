public class Tesla extends Carro {

    @Override
    public void montarChassi() {
        System.out.println("Montando chassi de fibra de carbono do Tesla.");
    }

    @Override
    public void instalarMotor() {
        System.out.println("Instalando motor elétrico do Tesla.");
    }

    @Override
    public void instalarRodas() {
        System.out.println("Instalando rodas aro 19 do Tesla.");
    }

    @Override
    public void pintar() {
        System.out.println("Pintando Tesla na cor branco pérola.");
    }

    public boolean carregarBateria() {
        System.out.println("Carregando bateria do Tesla.");
        return false;
    }
}