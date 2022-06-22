import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        PessoaDAO pessoaDAO = new PessoaDAO();
        
        while (true) {
            System.out.println("/--------------------------/");
            System.out.println("1 = Adicionar uma pessoa");
            System.out.println("2 = Listar as pessoas");
            System.out.println("3 = Buscar a pessoa pelo ID");
            System.out.println("4 = Excluir uma pessoa");
            System.out.println("5 = Sair");
            System.out.println("/--------------------------/");
            
            Pessoa pessoa = new Pessoa();
            
            int opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o nome da pessoa");
                    String nome = scan.next();

                    System.out.println("Digite o id da pessoa");
                    int id = scan.nextInt();

                    pessoa.setNome(nome);
                    pessoa.setId(id);
                    pessoaDAO.add(pessoa);

                    break;

                case 2:
                    System.out.println("Lista de pessoas abaixo.");
                    System.out.println("/--------------------------/");
                    pessoaDAO.getAll().forEach(i -> System.out.println(i.getId()+ " - "+ i.getNome()));
                    System.out.println("/--------------------------/");
                    break;

                case 3:
                    System.out.println("Digite o ID da pessoa que deseja.");
                    id = scan.nextInt();
                    pessoa = pessoaDAO.getById(id);
                    System.out.println("/--------------------------/");
                    System.out.println(pessoa.getId()+" - "+pessoa.getNome());
                    System.out.println("/--------------------------/");
                    break;

                case 4:
                    System.out.println("Digite o ID da pessoa que você deseja excluir.");
                    id = scan.nextInt();
                    pessoa = pessoaDAO.getById(id);
                    pessoaDAO.delete(pessoa);
                    break;

                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}