package actors;

import templates.Pessoa;
import templates.Funcionario;

public class Professor extends Pessoa implements Funcionario{

    private String tipoFuncionario = "Professor";
    private static String strCodigo;
    private static int codigo;
    
    public Professor(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        codigo++;
        strCodigo = "P"+codigo;
    }

    @Override
    public void batePonte() {
        System.out.println("Olá");
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
