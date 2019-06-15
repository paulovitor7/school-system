import actors.Professor;
import components.Global;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Principal {
    static Scanner scan = new Scanner(System.in);
    static Global g = new Global();
    static boolean sair = false;
    static final int MAXPROF=2, MAXALUNO=20;
    static Professor[] prof = new Professor[MAXPROF];
    
    public static void main(String[] args){

        g.about();
        
        while(!sair){
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
    
    private static void professor(){
        System.out.print("\n< Professor >\n");
        boolean sairProf = false;
        
        while(!sairProf){
            g.subMenu();
            int opc = scan.nextInt();
            scan.nextLine();
            
            switch(opc){
            case 1:
                System.out.println("\nMáximo de cadastro: "+MAXPROF+"\n");
                String error = "";
                
                for(int i=0; i<prof.length; i++){
                    if(prof[i] == null){
                        try{
                            System.out.print("Informe o nome -> ");
                            String nome = scan.nextLine();
                            System.out.print("Informe o cpf -> ");
                            String cpf = scan.nextLine();
                            System.out.print("Informe o idade -> ");
                            int idade = scan.nextInt();
                            System.out.print("Informe o salario -> ");
                            double salario = scan.nextDouble();

                            prof[i] = new Professor(nome, cpf, idade, salario);
                            error = "";
                        }catch(InputMismatchException e){
                            scan.reset();
                            scan.next(); 
                            System.out.println("\nErro: Os valores desem ser passados corretamente!");
                            prof[i] = null;
                        }
                        if(prof[i] != null)
                            System.out.println("\nAdicionado com sucesso!\n");
                        break;
                    }else
                        error = "\nTodos os cadastro já foram feitos.";
                    
                }
                
                if(error.equals(""))
                    System.out.println(error);
                
                break;
            case 2:
                System.out.println("Excluir");
                break;
            case 3:
                System.out.println("atualizar");
                break;
            case 4:
                System.out.println("\nListar de Professores:\n");
                for(int i=0; i<prof.length; i++){
                    if(prof[i] != null)
                        System.out.println((i+1)+": "+prof[i].getNome());
                }
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
