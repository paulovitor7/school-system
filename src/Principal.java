import actors.Professor;
import components.Global;
import java.util.Scanner;

public class Principal {
    static Scanner scan = new Scanner(System.in);
    static Global g = new Global();
    static boolean sair = true;
    
    public static void main(String[] args){
        g.about();
        
        while(sair){
            g.menuPrincipal();
            int opc = scan.nextInt();
            switch(opc){
                case 1:
                    professor();
                    break;
                case 2:
                    aluno();
                    break;
                case 3:
                    System.out.println("\nVocê escolheu sair.\nFinalizando programa...");
                    sair = false;
                    break;
                default:
                    System.out.println("\nNenhuma das opções foi selecionada.\nFinalizando programa...");
                    sair = false;
                    break;
            }
        }
        scan.close();
    }
    
    private static void professor(){
        System.out.print("\n< Professor >");
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
