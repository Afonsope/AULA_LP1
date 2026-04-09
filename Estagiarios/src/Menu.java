import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

    Scanner scanner = new Scanner(System.in);

    Informacoes info = new Informacoes();

    public void escolha(ArrayList<Estagiario> lista) {
        int opcao = 0;

        System.out.println("Selecione uma opção: ");
        System.out.println("1 - Mostrar todos os candidatos maiores do que uma idade idade informada");
        System.out.println("2 - Mostrar todos os candidatos com Media geral acima de 7");
        System.out.println("3 - Mostrar total de candidatos por sexo");
        System.out.println("4 - Mostrar todos os nomes e idades dos alunos do curso de ADS");
        System.out.println("5 - Sair");
        opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Voce deseja descobrir quantos estagiarios tem acima de qual idade?");
                int idade = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Estagiarios com a idade maior que " + idade + ": ");
                info.maiorIdade(lista, idade);
                break;

            case 2:
                System.out.println("Estagiarios com a Média geral acima de 7: ");
                info.mediaMaior(lista);
                break;

            case 3:
                System.out.println("Quantidade de estagiarios por sexo: ");
                info.sexoEstagiario(lista);
                break;
                
            default:
                break;
        }
    }
    
    public boolean continuar() {
        int escolha = 0;

         do{
                try{
                    System.out.println("Deseja continuar?");
                    System.out.println("| 1 - Sim | 2 - Não |");
                    escolha = scanner.nextInt();
                    scanner.nextLine();
                    if (escolha > 2 || escolha < 1)
                        throw new Exception("Digite apenas 1 ou 2");
                    break;
                } catch (Exception e) {
                    System.out.println("Erro: " + e.getMessage());
                }
        } while (true);

        if(escolha == 1)
            return true;
        return false;
    }

}
