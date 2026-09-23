public class Main {

    public static void main(String[] args) {
        Garagem<Carro> garagem = new Garagem<>();

        garagem.adicionar(new Civic("ABC1D23", 2022, "Preto", "1.5 Turbo", "CVT"));
        garagem.adicionar(new City("DEF2E34", 2021, "Branco", "1.0 Turbo" , "CVT"));
        garagem.adicionar(new Accord("GHI3F45", 2023, "Cinza", "3.0 Turbo", "CVT"));

        for (Carro carro : garagem.listar()) {
            imprimirCarro(carro);
        }
    }

    private static void imprimirCarro(Carro carro) {
        if (carro instanceof Civic civic) {
            imprimirCivic(civic);
        } else if (carro instanceof City city) {
            imprimirCity(city);
        } else if (carro instanceof Accord accord) {
            imprimirAccord(accord);
        }
    }

    private static void imprimirCivic(Civic civic) {
        System.out.println("Civic -> Placa: " + civic.getPlaca()
                + ", Ano: " + civic.getAnoFabricacao()
                + ", Cor: " + civic.getCor()
                + ", Motorização: " + civic.getMotorizacao()
                + ", Câmbio: " + civic.getTipoCambio());
    }

    private static void imprimirCity(City city) {
        System.out.println("City -> Placa: " + city.getPlaca()
                + ", Ano: " + city.getAnoFabricacao()
                + ", Cor: " + city.getCor()
                + ", Motorização: " + city.getMotorizacao()
                + ", Câmbio: " + city.getTipoCambio());
    }

    private static void imprimirAccord(Accord accord) {
        System.out.println("Accord -> Placa: " + accord.getPlaca()
                + ", Ano: " + accord.getAnoFabricacao()
                + ", Cor: " + accord.getCor()
                + ", Motorização: " + accord.getMotorizacao()
                + ", Câmbio: " + accord.getTipoCambio());
    }
}