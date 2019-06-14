package actors;

import templates.Pessoa;
import templates.Funcionario;

public class Professor extends Pessoa implements Funcionario{

    private final String tipoFuncionario = "Professor";
    private static String strCodigo;
    private static int codigo;
    private int batePonto;
    
    public Professor(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        codigo++;
        strCodigo = "P"+codigo;
    }

    @Override
    public void batePonto() {
        System.out.println("25/12/1999 18:52:45");
    }
    
    @Override
    public String toString(){
        return "\n\nFuncionario: "+tipoFuncionario+"\n"+
                "Codigo: "+strCodigo+"\n"+
                "Nome: "+nome+"\n"+
                "CPF: "+cpf+"\n"+
                "Idade: "+idade;
    }
    
}
