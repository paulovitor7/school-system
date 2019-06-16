package actors;

import templates.Pessoa;

public class Aluno extends Pessoa{
    private int ra;
    private String turma;
    private static int codigoInterno;
    
    public Aluno(String nome, String cpf, int idade, String turma) {
        super(nome, cpf, idade);
        this.turma = turma;
        this.ra = ++codigoInterno;
    }
    
    public int getRa () {
        return this.ra;
    }
    
    public String getTurma (){
        return  this.turma;
    }
    
    public void setTurma (String turma) {
        this.turma = turma;
    }

    
    @Override
    public String toString () { 
            return "\n\nAluno: "+this.ra+"\n"+
                    "Nome: "+nome+"\n"+
                    "CPF: "+cpf+"\n"+
                    "Idade: "+idade+"\n"+
                    "Turma: "+this.turma;
     }
}
