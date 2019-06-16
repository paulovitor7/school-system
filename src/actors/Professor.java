package actors;

import templates.Funcionario;

public class Professor extends Funcionario{

    private String strCodigo, turma;
    private int codigo;
    private static int codigoInterno;
    
    public Professor(String nome, String cpf, int idade, double salario, String turma) {
        super(nome, cpf, idade, salario, 0.1, "Professor");
        this.turma = turma;
        this.codigo = ++codigoInterno;
        this.strCodigo = "P"+this.codigo;
    }
    
    public String getStrCod() {
        return this.strCodigo;
    }
    
    public int getCod() {
        return this.codigo;
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
