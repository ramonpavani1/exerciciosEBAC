import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        PessoaFisica fisica = new PessoaFisica(
                "Ramon Pavani", "Rua A, 123", "11999999999",
                "123.456.789-00", "Programador Fullstack");

        PessoaJuridica juridica = new PessoaJuridica(
                "Empresa Ebac", "Av. B, 456", "1112345678",
                "12.345.678/0001-00", "Educação");

        PessoaFisica.imprimirPessoaFisica(fisica);
        PessoaJuridica.imprimirPessoaJuridica(juridica);
    }
}