package actors;

import templates.Materia;

public class Turma extends Materia{
    
    private String nome = "";
    private String[] aulas;
    private int codigo;
    private static int codigoInterno;
    
    public Turma(String nome, int[] aulasIndice) {
        this.nome = nome.toUpperCase();
        this.mountAulas(aulasIndice);
        this.codigo = ++codigoInterno;
    }
    
    private void mountAulas(int[] aulasIndice){
        this.aulas = new String[aulasIndice.length];
        for(int i=0; i<aulasIndice.length; i++){
            this.aulas[i] = MATERIAS[aulasIndice[i]];
        }
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getAulasIndice() {
        String strMatrias = "";
        for(int i=0; i<this.aulas.length; i++){
            strMatrias = strMatrias+"\n"+(i+1)+": "+this.aulas[i];
        }
        return strMatrias;
    }
    
    public void setAulasIndice(int[] aulasIndice){
        this.mountAulas(aulasIndice);
    }
    
    @Override
    public String toString(){
        String strTurma = "\nTurma: "+this.nome+"\nCodigo: "+codigo+"\nAulas:";
        for(int i=0; i<this.aulas.length; i++)
            strTurma = strTurma+"\n "+this.aulas[i];
        
        return strTurma;
    }
    
}
