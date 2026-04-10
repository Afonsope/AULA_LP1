import Entities.EmpresaEntity;
import Entities.EstagiarioEntity;


public class App {
    public static void main(String[] args) throws Exception {

        EmpresaEntity empresa = new EmpresaEntity();

        empresa.setId(1);
        empresa.setNome("Empresa X");
        empresa.setEmail("empresa@gmail.com");
        empresa.setSenha("123456");
        empresa.setSite("www.empresax.com");
        empresa.setContato("João");
        empresa.setTelefone("11999999999");
        empresa.setCNPJ("12345678000199");
        empresa.setIE("123456789");

        EstagiarioEntity estagiario = new EstagiarioEntity();

        estagiario.setId(2);
        estagiario.setNome("Maria");
        estagiario.setEmail("maria@gmail.com");
        estagiario.setSenha("654321");
        estagiario.setIdade(22);
        estagiario.setSexo("Feminino");
        estagiario.setCurso("Engenharia de Software");
        estagiario.setMedia(8.5f);

        System.out.println("Hello, World!");
    }
}
