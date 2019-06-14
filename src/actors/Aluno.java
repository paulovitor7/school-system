package actors;

import templates.Pessoa;

public class Aluno extends Pessoa{
    
    private String Funcao;
    
    
    public Aluno(String Nome, String Cpf,String Funcao, int Idade) {
        super(Nome, Cpf, Idade);
        
        this.Funcao = Funcao;
        
    }
    
    public String getFuncao () {
        return Funcao;
    
    }
    
    public void setFuncao (String Funcao) {
        this.Funcao = Funcao;
    
    }
    
}
