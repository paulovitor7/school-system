import actors.Aluno;
import actors.Professor;
import actors.Turma;
import components.Global;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.lang.NullPointerException;

public class Principal {
    static Scanner scan = new Scanner(System.in);
    static Global g = new Global();
    static boolean sair = false;
    static final int MAXPROF=2, MAXALUNO=20, MAXTURMA=3;
    static Professor[] prof = new Professor[MAXPROF];
    static Aluno[] aluno = new Aluno[MAXALUNO];
    static Turma[] turma = new Turma[MAXALUNO];
    
    public static void main(String[] args){

        g.about();
        while(!sair){
            try{
                g.menuPrincipal();
                int opc = scan.nextInt();
                switch(opc){
                    case 1:
                        turma();
                        break;
                    case 2:
                        professor();
                        break;
                    case 3:
                        aluno();
                        break;
                    case 4:
                        System.out.println("\nVocê escolheu sair.\nFinalizando programa...");
                        sair = true;
                        break;
                    default:
                        System.out.println("\nNenhuma das opções foi selecionada.\nFinalizando programa...");
                        sair = true;
                        break;
                }
            }catch(InputMismatchException e){
                scan.reset();
                scan.next();
                System.out.println("\nErro: Os valores desem ser passados corretamente!");
            }catch(NullPointerException e){
                scan.reset();
                System.out.println("\nNada a ser excluido.");
            }
        }
        scan.close();
    }
    
    // setup Turma
    private static void turma(){
        System.out.print("\n< Turma >\n");
        boolean sairTurma = false;
        
        while(!sairTurma){
            g.subMenu();
            int opc = scan.nextInt();
            scan.nextLine();
            sairTurma = true;
        }
    }
    
    // setup Professor
    private static void professor(){
        System.out.print("\n< Professor >\n");
        boolean sairProf = false;
        
        while(!sairProf){
            g.subMenu();
            int opc = scan.nextInt();
            scan.nextLine();
            
            switch(opc){
                case 1:{
                    System.out.println("\nMáximo de cadastro: "+MAXPROF+"\n");
                    String error = "";

                    for(int i=0; i<prof.length; i++){
                        if(prof[i] == null){
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

                            if(prof[i] != null)
                                System.out.println("\nSalvo com sucesso!\n");

                            break;
                        }else
                            error = "\nTodos os cadastro já foram feitos.";

                    }

                    if(error.equals(""))
                        System.out.println(error);

                    break;
                }
                case 2:{
                    System.out.print("Informe o codigo a ser excluido -> ");
                    String cod = scan.next(), msg = "";

                    for(int i=0; i<prof.length; i++){
                        if(cod.toLowerCase().equals(prof[i].getStrCod().toLowerCase())){
                            prof[i] = null;
                            msg = "Excluido com sucesso!";
                            break;
                        }else
                            msg = "Nada a ser excluido.";

                    }

                    System.out.println("\n"+msg+"\n");
                    break;
                }
                case 3:{
                    System.out.print("\nInforme o codigo a ser atualizado -> ");
                    String cod = scan.next(), msg = "";
                    scan.nextLine();
                    for(int i=0; i<prof.length; i++){
                        if(cod.toLowerCase().equals(prof[i].getStrCod().toLowerCase())){
                            System.out.print("Informe o nome -> ");
                            String nome = scan.nextLine();
                            System.out.print("Informe o cpf -> ");
                            String cpf = scan.nextLine();
                            System.out.print("Informe o idade -> ");
                            int idade = scan.nextInt();
                            System.out.print("Informe o salario -> ");
                            double salario = scan.nextDouble();

                            prof[i].setNome(nome);
                            prof[i].setCpf(cpf);
                            prof[i].setIdade(idade);
                            prof[i].setSalario(salario);

                            msg = "Salvo com sucesso!";

                            scan.nextLine();
                            break;
                        }else
                            msg = "Nada a ser atualizado.";
                    }
                    System.out.println("\n"+msg+"\n");
                    break;
                }
                case 4:{
                    System.out.println("\nListar de Professores:\n");
                    for(int i=0; i<prof.length; i++){
                        if(prof[i] != null)
                            System.out.println((i+1)+". cod: "+prof[i].getStrCod()+" - Nome: "+prof[i].getNome());
                    }
                    break;
                }
                case 5:{
                    System.out.println("\nVoltando...");
                    sairProf = true;
                    break;
                }
                case 6:{
                    System.out.println("\nVocê escolheu sair.\nFinalizando programa...");
                    sairProf = true;
                    sair = true;
                    break;
                }
                default:
                    System.out.println("\nNenhuma das opções foi selecionada.\nFinalizando programa...");
                    sairProf = true;
                    sair = true;
                    break;
            }
        }
    }
    
    // setup Aluno
    private static void aluno(){
        System.out.print("\n< Aluno >\n");
        boolean sairAluno = false;
        
        while(!sairAluno){
            g.subMenu();
            int opc = scan.nextInt();
            scan.nextLine();
            
            switch(opc){
                case 1:{
                    System.out.println("\nMáximo de cadastro: "+MAXALUNO+"\n");
                    String error = "";

                    for(int i=0; i<aluno.length; i++){
                        if(aluno[i] == null){
                            try{
                                System.out.print("Informe o nome -> ");
                                String nome = scan.nextLine();
                                System.out.print("Informe o cpf -> ");
                                String cpf = scan.nextLine();
                                System.out.print("Informe o idade -> ");
                                int idade = scan.nextInt();
                                scan.nextLine();
                                System.out.print("Informe a turma -> ");
                                String turma = scan.nextLine();

                                aluno[i] = new Aluno (nome, cpf, idade, turma);
                                error = "";
                            }catch(InputMismatchException e){
                                scan.reset();
                                scan.next(); 
                                System.out.println("\nErro: Os valores desem ser passados corretamente!");
                                aluno[i] = null;
                            }
                            if(aluno[i] != null)
                                System.out.println("\nSalvo com sucesso!\n");
                            break;
                        }else
                            error = "\nTodos os cadastro já foram feitos.";

                    }

                    if(error.equals(""))
                        System.out.println(error);

                    break;
                }
                case 2:{
                    System.out.print("Informe o RA a ser excluido -> ");
                    int cod = scan.nextInt();
                    String msg = "";

                    for(int i=0; i<aluno.length; i++){
                        if(cod == aluno[i].getRa()){
                            aluno[i] = null;
                            msg = "Excluido com sucesso!";
                            break;
                        }else
                            msg = "Nada a ser excluido.";

                    }
                    System.out.println("\n"+msg+"\n");
                    break;
                }
                case 3:{
                    System.out.print("\nInforme o RA a ser atualizado -> ");
                    int cod = scan.nextInt(); 
                    String msg = "";
                    scan.nextLine();

                    for(int i=0; i<aluno.length; i++){

                        if(cod == aluno[i].getRa()){
                            System.out.print("Informe o nome -> ");
                            String nome = scan.nextLine();
                            System.out.print("Informe o cpf -> ");
                            String cpf = scan.nextLine();
                            System.out.print("Informe o idade -> ");
                            int idade = scan.nextInt();
                            scan.nextLine();
                            System.out.print("Informe a turma -> ");
                            String turma = scan.nextLine();


                            aluno[i].setNome(nome);
                            aluno[i].setCpf(cpf);
                            aluno[i].setIdade(idade);
                            aluno[i].setTurma(turma);


                            msg = "Salvo com sucesso!";

                            scan.nextLine();
                            break;
                        }else
                            msg = "Nada a ser atualizado.";

                    }

                    System.out.println("\n"+msg+"\n");
                    break;
                }
                case 4:{
                    System.out.println("\nListar de Alunos:\n");
                    for(int i=0; i<aluno.length; i++){
                        if(aluno[i] != null)
                            System.out.println((i+1)+". RA: "+aluno[i].getRa()+" - Nome: "+aluno[i].getNome());
                    }
                    break;
                }
                case 5:{
                    System.out.println("\nVoltando...");
                    sairAluno = true;
                    break;
                }
                case 6:{
                    System.out.println("\nVocê escolheu sair.\nFinalizando programa...");
                    sairAluno = true;
                    sair = true;
                    break;
                }
                default:
                    System.out.println("\nNenhuma das opções foi selecionada.\nFinalizando programa...");
                    sairAluno = true;
                    sair = true;
                    break;
            }
        }
    
    }
}