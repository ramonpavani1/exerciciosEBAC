public class Cadillac extends Carro {

    @Override
    public void montarChassi() {
        System.out.println("Montando chassi reforçado do Cadillac.");
    }

    @Override
    public void instalarMotor() {
        System.out.println("Instalando motor V8 do Cadillac.");
    }

    @Override
    public void instalarRodas() {
        System.out.println("Instalando rodas aro 20 do Cadillac.");
    }

    @Override
    public void pintar() {
        System.out.println("Pintando Cadillac na cor preto fosco.");
    }

    public boolean ativarModoLuxo() {
        System.out.println("Ativando acabamento premium do Cadillac.");
        return false;
    }
}