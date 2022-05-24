public class Robo {
    
    static void acoesRobo(String userInput) {
        
                switch(userInput){
                case "90":
                System.out.println("Você rotacionou o robô em 90° em sentido horário");
                System.out.println("//--------------------------------------------//");
                break;
    
                case "180":
                System.out.println("Você rotacionou o robô em 180° em sentido horário");
                System.out.println("//--------------------------------------------//");
                break;

                case "270":
                System.out.println("Você rotacionou o robô em 270° em sentido horário");
                System.out.println("//--------------------------------------------//");
                break;
    
                case "360":
                System.out.println("Você rotacionou o robô em 360° em sentido horário");
                System.out.println("//--------------------------------------------//");
                break;
    
                case "frente":
                System.out.println("O robô andou alguns metros para frente");
                System.out.println("//--------------------------------------------//");
                break;
    
                case "tras":
                System.out.println("O robô deu ré");
                System.out.println("//--------------------------------------------//");
                break;
    
                case "foto":
                System.out.println("O robô tirou uma foto");
                System.out.println("//--------------------------------------------//");
                break;
                
                case "recarregar":
                System.out.println("O robô foi totalmente carregado.");
                System.out.println("//--------------------------------------------//");               
                break;

            }           
        }

    static void statusRobo(int qntdBateria) {

        System.out.println("A quantidade de bateria atual do robô é: "+ qntdBateria+"%");
        System.out.println("Você possui "+ ((qntdBateria / 10) -1) +" movimentos restantes");
        System.out.println("//--------------------------------------------//");

    }
}
