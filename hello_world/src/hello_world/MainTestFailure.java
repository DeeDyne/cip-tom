package hello_world;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainTestFailure {

    @Test
    public void testCampanelloNonValido() {
        Campanello campanello = FactoryCampanelli.creaCampanello("ufficio");
        assertNull(campanello, "Campanello non valido dovrebbe essere null");
    }
}