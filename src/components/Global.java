package components;

import java.util.Scanner;
import templates.Materia;
        
public class Global {
    
    public final String app_name = "School System";
    public final String[] app_developers = {"Paulo Vitor", "Lucas Barbosa"};
    
    // void
    public void about(){
        System.out.println("\nWelcome to "+app_name+"."
                + "\nDevelopers: "+app_developers[0]+", "+app_developers[1]+"."
                + "\nYear: 2019\n");
    }
    
    public void menuPrincipal(){
        System.out.print("\n---------------------------------"
                + "\n1 para area de turma"
                + "\n2 para area de professores"
                + "\n3 para area de alunos"
                + "\n4 para area de relatorio"
                + "\n5 para sair"
                + "\n---------------------------------\nSelecione -> ");
    }
    
    public void subMenu(){
        System.out.print("\n---------------------------------"
                + "\n1 para adicionar"
                + "\n2 para excluir"
                + "\n3 para atualizar"
                + "\n4 para listar"
                + "\n5 para lista personalizada"
                + "\n6 para voltar"
                + "\n7 para sair"
                + "\n---------------------------------\nSelecione -> ");
    }
    
    public void subMenuListaPersonalizada(){
        System.out.print("\n---------------------------------"
                + "\n1 para listar tudo"
                + "\n2 para listar apenas um"
                + "\n3 para voltar"
                + "\n4 para sair"
                + "\n---------------------------------\nSelecione -> ");
    }
    
    public void relatorio(){
        System.out.print("\n---------------------------------"
                + "\n1 para simples"
                + "\n2 para datalhado"
                + "\n3 para voltar"
                + "\n4 para sair"
                + "\n---------------------------------\nSelecione -> ");
    }
    
    // return
    public int[] subMenuTurma(int max){
        Scanner scan = new Scanner(System.in);
        Materia materias = new Materia();
        
        System.out.print("\n*********************************"
                +materias.strMaterias()
                + "\n*********************************\n");
        
        int[] selecionados = new int[max];
        
        for(int i=0; i<selecionados.length; i++){
            System.out.print("Selecione o item acima -> ");
            selecionados[i] = scan.nextInt()-1;
        }
        
        return selecionados;
    }
}
