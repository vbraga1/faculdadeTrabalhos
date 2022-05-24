import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        System.out.println("O que você deseja fazer?");
        System.out.println("Rotacionar o robô em um dos ângulos: 90, 180, 270, 360");
        System.out.println("Movimentar para frente ou para trás");
        System.out.println("Realizar uma captura de foto");
        System.out.println("Atenção, cada ação gasta um total de 10% de bateria");
        System.out.println("E caso o robô fique com menos de 10%");
        System.out.println("Ele não vai executar nenhuma ação, somente a ação de recarregar.");
        System.out.println("Caso queira fechar a aplicação, digite 'fechar'.");

        int bateriaRobo = 100;
        boolean bool = true;
        do {       
            Scanner scanner = new Scanner(System.in);
            System.out.println("Tags: 90, 180, 270, 360, 'frente', 'tras', 'foto', 'recarregar', 'status', 'fechar'");
            String userInput = scanner.next();

            if(bateriaRobo > 10) {
                switch(userInput){
                    case "90":
                    Robo.acoesRobo(userInput);
                    break;

                    case "180":
                    Robo.acoesRobo(userInput);
                    break;

                    case "270":
                    Robo.acoesRobo(userInput);
                    break;

                    case "360":
                    Robo.acoesRobo(userInput);
                    break;

                    case "frente":
                    Robo.acoesRobo(userInput);
                    break;
    
                    case "tras":
                    Robo.acoesRobo(userInput);
                    break;
    
                    case "foto":
                    Robo.acoesRobo(userInput);
                    break;                   

                    case "recarregar":
                    Robo.acoesRobo(userInput);
                    bateriaRobo = 100;
                    break;

                    case "status":
                    Robo.statusRobo(bateriaRobo);
                    bateriaRobo = bateriaRobo + 10;
                    break;

                    case "fechar":
                    System.exit(0);

                    default:
                    System.out.println("Opção inválida, tente novamente.");
            }       
        } else {
            System.out.println("Robô sem bateria, precisa ser recarregado.");
            switch(userInput) {
                case "recarregar":
                Robo.acoesRobo(userInput);
                bateriaRobo = 100;
                break;

                case "status":
                Robo.statusRobo(bateriaRobo);
                bateriaRobo = bateriaRobo + 10;
                break;

                case "fechar":
                System.exit(0);

                default:
                System.out.println("Opção inválida, tente novamente.");
            }               
        }
    
        bateriaRobo = bateriaRobo - 10;

        } while (bool = true);
    }
}