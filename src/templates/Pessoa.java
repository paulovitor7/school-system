package templates;

import components.DataPessoa;
import java.util.ArrayList;

public class Pessoa {
    
    private ArrayList<DataPessoa> pessoa = new ArrayList<>();
    
    public Pessoa(String nome, String cpf, int idade){
        this.pessoa.add(new DataPessoa(nome, cpf, idade));
    }
    
    public ArrayList<DataPessoa> getPessoa(){
        return this.pessoa;
    }
}
