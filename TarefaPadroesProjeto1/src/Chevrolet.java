public class Chevrolet extends Carro {

    @Override
    public void montarChassi() {
        System.out.println("Montando chassi de aço do Chevrolet.");
    }

    @Override
    public void instalarMotor() {
        System.out.println("Instalando motor a combustão do Chevrolet.");
    }

    @Override
    public void instalarRodas() {
        System.out.println("Instalando rodas aro 15 do Chevrolet.");
    }

    @Override
    public void pintar() {
        System.out.println("Pintando Chevrolet na cor vermelho.");
    }

    public boolean abastecerCombustivel() {
        System.out.println("Abastecendo combustível do Chevrolet.");
        return false;
    }
}