import java.util.ArrayList;
import java.util.List;

public class PessoaDAO {

    private List<Pessoa> pessoa = new ArrayList<Pessoa>();

    public Pessoa getById(int id) {
        return pessoa.stream().filter(i -> i.getId() == id).findFirst().get();
    }

    public List<Pessoa> getAll() {
        return pessoa;
    }

    public void add(Pessoa pessoa) {
            this.pessoa.add(pessoa);
            System.out.println("Pessoa adicionada.");
    }

    public void delete(Pessoa pessoa) {
            this.pessoa.remove(pessoa);
            System.out.println("Pessoa removida.");
    }
}