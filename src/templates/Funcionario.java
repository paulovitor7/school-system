
package templates;

public class Funcionario {
    
   private String Nome, BatePonto, Cpf;
   private int Idade, Codigo;
   
    public Funcionario (String Nome,String BatePonto, int Idade, int Codigo, String Cpf ){
        this.Nome = Nome;
        this.BatePonto = BatePonto;
        this.Idade = Idade;
        this.Cpf = Cpf;
    }
    
    public String getNome () {
        return Nome;
    }
    
    public void setNome (String Nome) {
        this.Nome = Nome;
    }
    
    public String getBatePonto(){
        return BatePonto;
    }
    
    public void setBatePonto (String BatePonto){
        this.BatePonto = BatePonto;
    }
    
    public int getIdade (){
        return Idade;
    }
    
    public void setIdade (int Idade){
        this.Idade = Idade;
    }
    
    public String getCpf () {
        return Cpf;
    }
    
    public void setCpf (String Cpf) {
        this.Cpf = Cpf;
    }
   
}
