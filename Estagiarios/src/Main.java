import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Estagiario> listaEstagiarios = new ArrayList<>();        
        Estagiario estagiario = new Estagiario();    
        Menu menu = new Menu();

        do {
            estagiario.cadastrar();
            listaEstagiarios.add(estagiario);
        } while (estagiario.continuar());

        do{
            menu.escolha(listaEstagiarios);
        } while(menu.continuar());

    }
}
