import actors.Professor;
import components.Global;
import java.util.Scanner;

public class Principal {
    static Scanner scan = new Scanner(System.in);
    static Global g = new Global();
    static boolean sair = false;
    static final int MAXPROF=2, MAXALUNO=20;
    public static void main(String[] args){
        Professor[] prof = new Professor[MAXPROF];

        g.about();
        
        while(!sair){
            g.menuPrincipal();
            int opc = scan.nextInt();
            switch(opc){
                case 1:
                    professor(prof);
                    break;
                case 2:
                    aluno();
                    break;
                case 3:
                    System.out.println("\nVocê escolheu sair.\nFinalizando programa...");
                    sair = true;
                    break;
                default:
                    System.out.println("\nNenhuma das opções foi selecionada.\nFinalizando programa...");
                    sair = true;
                    break;
            }
        }
        scan.close();
    }
    
    private static void professor(Professor prof[]){
        System.out.print("\n< Professor >\n\nMáximo de cadastro: "+MAXPROF);
        boolean sairProf = false;

        while(!sairProf){
            g.subMenu();
            int opc = scan.nextInt();
            scan.nextLine();
            
            switch(opc){
            case 1:
                System.out.println("Add");
                break;
            case 2:
                System.out.println("Excluir");
                break;
            case 3:
                System.out.println("atualizar");
                break;
            case 4:
                System.out.println("listar");
                break;
            case 5:
                System.out.println("\nVoltando...");
                sairProf = true;
                break;
            case 6:
                System.out.println("\nVocê escolheu sair.\nFinalizando programa...");
                sairProf = true;
                sair = true;
                break;
            default:
                System.out.println("\nNenhuma das opções foi selecionada.\nFinalizando programa...");
                sairProf = true;
                sair = true;
                break;
            }
        }
    }
    
    private static void aluno(){
        System.out.print("\n< Aluno >");
        g.subMenu();
        int opc = scan.nextInt();
        switch(opc){
            case 1:
                System.out.println("Add");
                break;
            case 2:
                System.out.println("Excluir");
                break;
            case 3:
                System.out.println("atualizar");
                break;
            case 4:
                System.out.println("listar");
                break;
            case 5:
                System.out.println("\nVoltando...");
                break;
            case 6:
                System.out.println("\nVocê escolheu sair.\nFinalizando programa...");
                sair = false;
                break;
            default:
                System.out.println("\nNenhuma das opções foi selecionada.\nFinalizando programa...");
                sair = false;
                break;
        }
    }
    
}
