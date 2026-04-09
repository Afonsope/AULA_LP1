import java.util.ArrayList;

public class Informacoes {   
    Estagiario estagiario = new Estagiario();

    public void maiorIdade(ArrayList<Estagiario> lista, int idade){
        int i = 0;

        for(Estagiario e : lista){
            if(e.getIdade() > idade){
                System.out.println(e);
                i++;
            }
        }
        System.out.println(i + " estagiarios com idade superios a " + idade);
    }


    public void mediaMaior(ArrayList<Estagiario> lista) {
        int i = 0;

        for(Estagiario e : lista){
            if(e.getMediaGeral() > 7){
                System.out.println(e);
                i++;
            }
        }
        System.out.println(i + " estagiarios com a Médiageral maior que 7");
    }

    public void sexoEstagiario(ArrayList<Estagiario> lista) {
        int m = 0;
        int f = 0;

        for(Estagiario e : lista){
            if(e.getSexo() == 'M' || e.getSexo() == 'm'){
                System.out.println(e);
                m++;
            } else {
                System.out.println(e);
                f++;
            }
            System.out.println(m + " estagiarios homens");
            System.out.println(f + " estagiarias mulheres");
        }
    }

}
