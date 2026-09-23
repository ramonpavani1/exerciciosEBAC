import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Garagem<T extends Carro> {

    private final List<T> carros = new ArrayList<>();

    public void adicionar(T carro) {
        carros.add(carro);
    }

    public List<T> listar() {
        return Collections.unmodifiableList(carros);
    }

    public T buscarPorPlaca(String placa) {
        for (T carro : carros) {
            if (carro.getPlaca().equalsIgnoreCase(placa)) {
                return carro;
            }
        }
        return null;
    }
}