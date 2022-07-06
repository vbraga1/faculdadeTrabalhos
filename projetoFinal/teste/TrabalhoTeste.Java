import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TrabalhoTeste {
    @Test
    public void testeTrabalho() {
        Trabalho trabalho = new Trabalho("Trabalho 1", 1.0);
        assertEquals("Trabalho 1", trabalho.getNome());
        assertEquals(1.0, trabalho.getPeso());
    }

    @Test
    public void testeNome() {
        Trabalho trabalho = new Trabalho("Trabalho 1", 1.0);
        assertEquals("Trabalho 1", trabalho.getNome());
    }

    @Test
    public void testePeso() {
        Trabalho trabalho = new Trabalho("Trabalho 1", 1.0);
        assertEquals(1.0, trabalho.getPeso());
    }
}