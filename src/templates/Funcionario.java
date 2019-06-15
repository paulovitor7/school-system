package templates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario extends Pessoa implements ActionsFuncionario{
    
    protected String batePonto;
    protected final String tipoFuncionario;
    protected double salario, bonus;
    
    public Funcionario(String nome, String cpf, int idade, double salario, double bonus, String tipoFuncionario) {
        super(nome, cpf, idade);
        this.tipoFuncionario = tipoFuncionario;
        this.salario = salario;
        this.bonus = bonus;
        this.batePonto();
    }
    
    @Override
    public String exibePonto() {
        return batePonto;
    }
    
    @Override
    public double calcBonus() {
        double salarioBonus = this.salario*this.bonus+this.salario;
        return salarioBonus;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    public double getSalario(double salario){
        return this.salario;
    }
       
    private void batePonto(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm"); 
	Date date = new Date(); 
	this.batePonto = dateFormat.format(date); 
    }
    
}
