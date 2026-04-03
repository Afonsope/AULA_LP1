import java.util.Scanner;

public class Estagiario {

    Scanner scanner = new Scanner(System.in);

    private String nome;
    private String email;
    private String curso;
    private float mediaGeral;
    private int idade;
    private char sexo;


    //  CONSTRUTOR
    public Estagiario(){
        nome = new String();
        email = new String();
        curso = new String();
        mediaGeral = 0;
        idade = 0;
        sexo = 'A';
    }

    public void cadastrar(){
        do {
            try{
                System.out.println("Informe o nome do estágiario: ");
                nome = scanner.nextLine();
                if(nome.isEmpty() || nome.length() < 10)
                    throw new Exception("Informe um nome válido com mais de 10 caracteres");
                break;
            } catch (Exception e){
                System.out.println("Erro: " + e.getMessage());
            }
        } while (nome.isEmpty() || nome.length() < 10);

        do {
            try {
                System.out.println("Infome o email do estagiario: ");
                email = scanner.nextLine();
                if(email.contains(".") || email.contains("@") || email.length() < 10)
                    throw new Exception("Informe um email válido");
                break;
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (!email.contains(".") || !email.contains("@") || email.length() < 10);


        do {
            try {
                System.out.println("Informe o curso do curso do estagiario: ");
                curso = scanner. nextLine();
                if(curso.length() < 2 || curso.isEmpty())
                    throw new Exception("Informe um curso válido");
                break;
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (curso.length() < 2 || curso.isEmpty());

        do {
            try {
                System.out.println("Ifome a média ageral do estagiario: ");
                mediaGeral = scanner.nextFloat();
                if(mediaGeral > 10 || mediaGeral < 0)
                    throw new Exception("Infome uma nota de 0 a 10");
                break;
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (mediaGeral > 10 || mediaGeral < 0);

        do {
            try {
                System.out.println("Informe o sexo do estagiario: ");
                System.out.println("| M - Maculino | F - Feminino |");
                if(sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f')
                    throw new Exception("Digite apenas M (Masculino) ou F (Feminino)");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        } while (sexo != 'M' && sexo != 'm' && sexo != 'F' && sexo != 'f');
    }

    public void continuar() {
         
    }

    // GET SET
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public float getMediaGeral() {
        return mediaGeral;
    }

    public void setMediaGeral(float mediaGeral) {
        this.mediaGeral = mediaGeral;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}