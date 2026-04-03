import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estagiario> listaEstagiarios = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        

        int continuar;

        

        do {
            Estagiario estagiario = new Estagiario();

            estagiario.cadastrar();
            listaEstagiarios.add(estagiario);

            

            do{
                try{
                    System.out.println("Deseja continuar?");
                    System.out.println("| 1 - Sim | 2 - Não |");
                    continuar = scanner.nextInt();
                    scanner.nextLine();
                    if (continuar > 2 || continuar < 1)
                        throw new Exception("Digite apenas 1 ou 2");
                    break;
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
            } while (true);
        } while (continuar != 2);
    }
}
