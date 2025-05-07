import java.util.Comparator;

public class ComparadorDni implements Comparator<String>{
    @Override
    public int compare(String dni1, String dni2) {
        // Si son iguales, comparar las letras
        return dni1.compareTo(dni2);
    }
}
