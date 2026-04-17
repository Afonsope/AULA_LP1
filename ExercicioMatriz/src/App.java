import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int qtdAlunos = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.println("Digite a quantidade de alunos: ");
                qtdAlunos = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
                scanner.nextLine();
            }
        } while (qtdAlunos<0);

        float notasAlunos[][] = new float[qtdAlunos][3];

        for(int i = 0; i < qtdAlunos; i++){
            for(int j = 0; j < 3; j++){
                do{
                    try {
                        System.out.println("Digite a nota " + j + " do aluno " + i + ": ");
                        notasAlunos[i][j] = scanner.nextFloat();
                        if(notasAlunos[i][j] < 0 || notasAlunos[i][j] > 10)
                            throw new Exception("Informe uma nota ente 0 a 10.");
                    } catch (Exception e) {
                        System.out.println("Erro: " + e.getMessage());
                        scanner.nextLine();
                    }
                } while(notasAlunos[i][j] < 0 || notasAlunos[i][j] > 10);
            }
        }

        float[][] maioresNotas = new float[3][3];
        float[][] menoresNotas = new float[3][3];

        for(int i = 0; i < qtdAlunos; i++){
            for(int j = 0; j < 3; j++){
                if(i == 0){
                    maioresNotas[i][j] = notasAlunos[i][j];
                    menoresNotas[i][j] = notasAlunos[i][j];
                } else{
                    if(notasAlunos[i][j] > maioresNotas[i][j]){
                        maioresNotas[i][j] = notasAlunos[i][j];
                    } else if(notasAlunos[i][j] < menoresNotas[i][j]){
                        menoresNotas[i][j] = notasAlunos[i][j];
                    }
                    
                }
            }
        }

        for(int i = 0; i < qtdAlunos; i++){
            for(int j = 0; j < 3; j++){
                System.out.println("Nota " + (i+1) + " --> maior nota " + maioresNotas[j] + ", do aluno " + maioresNotas[i] + " | menor nota " + menoresNotas[j] + ", do aluno " + menoresNotas[i]);
            }
        }

        scanner.close();
    }
}