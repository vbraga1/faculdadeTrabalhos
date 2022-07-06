public class Main {

    public static void main(String[] args) {
      Prova[] prova = { new Prova("Prova 1", 2), new Prova("Prova 2", 1) };
      Trabalho[] trabalho = {
        new Trabalho("Trabalho 1", 2),
        new Trabalho("Trabalho 2", 1.5),
      };
  
      Aluno[] alunos = {
        new Aluno("Paula"),
        new Aluno("Marcos"),
        new Aluno("Pedro"),
        new Aluno("Wellington"),
        new Aluno("Paulo"),
        new Aluno("Fabiana"),
        new Aluno("Joao"),
        new Aluno("Andre"),
        new Aluno("Igor"),
        new Aluno("Vinicius"),
        new Aluno("Gabriela"),
        new Aluno("Lucas"),
        new Aluno("Mateus"),
        new Aluno("Natanael"),
        new Aluno("Tiago"),
        new Aluno("Rafaela"),
        new Aluno("Vitoria"),
        new Aluno("Luiza"),
        new Aluno("Vitor"),
      };
  
      addProvasETrabalhosNotasRandom(alunos, prova, trabalho);
  
      // Mostra as notas de cada prova e trabalho
      for (Aluno aluno : alunos) {
        System.out.println("Notas de " + aluno.getNome());
        for (Prova prova : prova) {
          System.out.println(
            "   " + prova.getNome() + ": " + aluno.getNotaProva(prova)
          );
        }
        for (Trabalho trabalho : trabalho) {
          System.out.println(
            "   " + trabalho.getNome() + ": " + aluno.getNotaTrabalho(trabalho)
          );
        }
      }
  
      // Mostra a media de cada aluno
      for (Aluno aluno : alunos) {
        System.out.format(
          "Media final de %s: %.2f\n",
          aluno.getNome(),
          aluno.getMedia()
        );
      }
    }
  
    private static double notaRandom() {
      return ((double) (int) (Math.random() * 100)) / 10;
    }
  
    private static void addProvasETrabalhosNotasRandom(
      Aluno[] alunos,
      Prova[] provas,
      Trabalho[] trabalhos
    ) {
      for (Aluno aluno : alunos) {
        for (Prova prova : provas) {
          aluno.Prova(prova, notaRandom());
        }
        for (Trabalho trabalho : trabalhos) {
          aluno.addTrabalho(trabalho, notaRandom());
        }
      }
    }
  }