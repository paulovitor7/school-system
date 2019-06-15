package actors;

import templates.Funcionario;

public class Professor extends Funcionario{

    private static String strCodigo;
    private static int codigo;
    
    public Professor(String nome, String cpf, int idade, double salario) {
        super(nome, cpf, idade, salario, 0.1, "Professor");
        codigo++;
        strCodigo = "P"+codigo;
    }
    
    public String getStrCod() {
        return strCodigo;
    }
    
    public int getCod() {
        return codigo;
    }
    
    @Override
    public String toString(){
        return "\n\nFuncionario: "+tipoFuncionario+"\n"+
                "Codigo: "+strCodigo+"\n"+
                "Nome: "+nome+"\n"+
                "CPF: "+cpf+"\n"+
                "Idade: "+idade+"\n"+
                "Salario: "+salario+"\n"+
                "Bonus: "+bonus+"\n"+
                "Ponto eletrônico: "+batePonto;
    }
    
}
