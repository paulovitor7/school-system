package actors;

import templates.Pessoa;

public class Aluno extends Pessoa{
    private static int ra;
    
    public Aluno(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        
        ra++;
    }
    
    public int getRa () {
        
        return ra;
    }

}
