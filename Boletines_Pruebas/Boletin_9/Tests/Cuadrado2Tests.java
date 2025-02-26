import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Cuadrado2Tests {
    @Test
    @DisplayName("Test de la clase Cadrado2Test")
    void testCuadrado2() {
        Cadrado2 cadrado2 = new Cadrado2(5);
        assertEquals(5, cadrado2.getLado());
    }
    @ParameterizedTest
    @CsvSource({"5, -5"
            , "0, 0"
            , "100, 100"
    })
    @DisplayName("Test de la clase Cadrado2Test con parametros")
    void testCuadrado2Parametrized(int lado,int esperado) {
        Cadrado2 cadrado2 = new Cadrado2(lado);
        cadrado2.setLado(lado);
        //if(lado > 0){
            assertEquals(esperado, cadrado2.getLado());
        //}

    }

}
