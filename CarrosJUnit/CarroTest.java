package CarrosJUnit;

import org.junit.Test;

import java.time.LocalDate;

public class CarroTest {

    @Test (expected = IllegalArgumentException.class)
    public void testExcecaoAoCriarCarroComAnoDeLancamentoInvalido() {
        new Carro("Mustang", "Ford", 2024, LocalDate.now());
    }
}