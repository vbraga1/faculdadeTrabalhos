import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ProvaTrabalhoTeste {
    @Test
    public void testeProvaTrabalho() {
        ProvaTrabalho provaTrabalho = new ProvaTrabalho("Prova 1", 1.0);
        assertEquals("Prova 1", provaTrabalho.getNome());
        assertEquals(1.0, provaTrabalho.getPeso());
    }

    @Test
    public void testeNome() {
        ProvaTrabalho provaTrabalho = new ProvaTrabalho("Prova 1", 1.0);
        assertEquals("Prova 1", provaTrabalho.getNome());
    }

    @Test
    public void testePeso() {
        ProvaTrabalho provaTrabalho = new ProvaTrabalho("Prova 1", 1.0);
        assertEquals(1.0, provaTrabalho.getPeso());
    }
}