import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ProvaTeste {
    @Test
    public void testeProva() {
        Prova prova = new Prova("Prova 1", 1.0);
        assertEquals("Prova 1", prova.getNome());
        assertEquals(1.0, prova.getPeso());
    }

    @Test
    public void testeGetNome() {
        Prova prova = new Prova("Prova 1", 1.0);
        assertEquals("Prova 1", prova.getNome());
    }

    @Test
    public void testeGetPeso() {
        Prova prova = new Prova("Prova 1", 1.0);
        assertEquals(1.0, prova.getPeso());
    }
}