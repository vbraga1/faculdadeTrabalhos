import java.util.HashMap;
import java.util.Map;

public class Aluno {

  private String nome;

  Map<Prova, Double> prova = new HashMap<Prova, Double>();

  Map<Trabalho, Double> trabalho = new HashMap<Trabalho, Double>();

  public Aluno(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public double getNotaProva(Prova prova) {
    return prova.get(prova);
  }

  public double getNotaTrabalho(Trabalho trabalho) {
    return trabalho.get(trabalho);
  }

  public void Prova(Prova prova, double nota) {
    prova.put(prova, nota);
  }

  public void Trabalho(Trabalho trabalho, double nota) {
    trabalho.put(trabalho, nota);
  }

  private double sum(double[] values) {
    double sum = 0;
    for (double value : values) {
      sum += value;
    }
    return sum;
  }

  private double mediaPonderada(double[] valores, double[] pesos) {
    double soma = 0;
    for (int i = 0; i < valores.length; i++) {
      soma += valores[i] * pesos[i];
    }
    return soma / sum(pesos);
  }

  public double getMedia() {
    double[] notas = new double[prova.size() + trabalho.size()];
    double[] pesos = new double[prova.size() + trabalho.size()];
    int i = 0;
    for (Prova prova : prova.keySet()) {
      notas[i] = prova.get(prova);
      pesos[i] = prova.getPeso();
      i++;
    }
    for (Trabalho trabalho : trabalho.keySet()) {
      notas[i] = trabalho.get(trabalho);
      pesos[i] = trabalho.getPeso();
      i++;
    }
    return mediaPonderada(notas, pesos);
  }
}