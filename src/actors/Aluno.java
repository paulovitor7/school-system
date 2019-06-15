package actors;

import templates.Pessoa;

public class Aluno extends Pessoa{
    private static int ra;
    private String turma;
    
    public Aluno(String nome, String cpf, int idade, String turma) {
        super(nome, cpf, idade);
        this.turma = turma;
        ra++;
    }
    
    public int getRa () {
        return ra;
    }
    
    public String getTurma (){
        return  this.turma;
    }
    
    public void setTurma (String turma) {
        this.turma = turma;
    }

    
    @Override
    public String toString () { 
            return "\n\nAluno: "+ra+"\n"+
                    "Nome: "+nome+"\n"+
                    "CPF: "+cpf+"\n"+
                    "Idade: "+idade+"\n"+
                    "Turma: "+this.turma;
     }
}
