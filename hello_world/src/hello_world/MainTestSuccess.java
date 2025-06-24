package hello_world;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MainTestSuccess {

    @Test
    public void testCampanelloCasa() {
        Campanello campanello = FactoryCampanelli.creaCampanello("casa");
        assertNotNull(campanello, "Campanello di casa non dovrebbe essere null");

        CampanelloMultiplo adattato = new CampanelloAdapter(campanello);

        // Non possiamo verificare il System.out facilmente qui senza redirect, ma possiamo testare che non lancia eccezioni
        assertDoesNotThrow(() -> adattato.suonaTreVolte());
    }

    @Test
    public void testCampanelloNegozio() {
        Campanello campanello = FactoryCampanelli.creaCampanello("negozio");
        assertNotNull(campanello, "Campanello del negozio non dovrebbe essere null");

        CampanelloMultiplo adattato = new CampanelloAdapter(campanello);
        assertDoesNotThrow(() -> adattato.suonaTreVolte());
    }
}