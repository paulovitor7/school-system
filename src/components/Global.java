package components;

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
                + "\n1 para area de professores"
                + "\n2 para area de alunos"
                + "\n3 para sair"
                + "\n---------------------------------\nSelecione -> ");
    }
    
    public void subMenu(){
        System.out.print("\n---------------------------------"
                + "\n1 para adicionar"
                + "\n2 para excluir"
                + "\n3 para atualizar"
                + "\n4 para listar"
                + "\n5 para voltar"
                + "\n6 para sair"
                + "\n---------------------------------\nSelecione -> ");
    }
    
    // return
}
