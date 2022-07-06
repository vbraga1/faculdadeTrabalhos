import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AlunoTeste {
    @Test
    public void testeAluno() {
        Aluno aluno = new Aluno("Pedro");
        assertEquals("Pedro", aluno.getNome());
    }

    @Test
    public void testeNome() {
        Aluno aluno = new Aluno("Pedro");
        assertEquals("Pedro", aluno.getNome());
    }

    @Test
    public void testeNotaProva() {
        Aluno aluno = new Aluno("Pedro");
        Prova prova = new Prova("Prova 1", 1.0);
        aluno.Prova(prova, 10.0);
        assertEquals(10.0, aluno.getNotaProva(prova));
    }

    @Test
    public void testeNotaTrabalho() {
        Aluno aluno = new Aluno("Pedro");
        Trabalho trabalho = new Trabalho("Trabalho 1", 1.0);
        aluno.Trabalho(trabalho, 10.0);
        assertEquals(10.0, aluno.getNotaTrabalho(trabalho));
    }

    @Test
    public void testeProva() {
        Aluno aluno = new Aluno("Pedro");
        Prova prova = new Prova("Prova 1", 1.0);
        aluno.Prova(prova, 10.0);
        assertEquals(10.0, aluno.getNotaProva(prova));
    }

    @Test
    public void testeTrabalho() {
        Aluno aluno = new Aluno("Pedro");
        Trabalho trabalho = new Trabalho("Trabalho 1", 1.0);
        aluno.Trabalho(trabalho, 10.0);
        assertEquals(10.0, aluno.getNotaTrabalho(trabalho));
    }

    @Test
    public void testeMedia() {
        Aluno aluno = new Aluno("Pedro");
        Prova prova = new Prova("Prova 1", 1.0);
        aluno.Prova(prova, 10.0);
        Trabalho trabalho = new Trabalho("Trabalho 1", 1.0);
        aluno.Trabalho(trabalho, 10.0);
        assertEquals(10.0, aluno.getMedia());
    }
}