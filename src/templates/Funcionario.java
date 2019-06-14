package templates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario extends Pessoa implements ActionsFuncionario{
    
    protected String batePonto;
    
    public Funcionario(String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.batePonto();
    }
    
    @Override
    public String exibePonto() {
        return batePonto;
    }
    
    private void batePonto(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm"); 
	Date date = new Date(); 
	this.batePonto = dateFormat.format(date); 
    }
    
}
