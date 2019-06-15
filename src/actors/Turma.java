package actors;

import templates.Materia;

public class Turma extends Materia{
    
    private String nome = "";
    private String[] aulas;

    public Turma(String nome, int[] aulasIndice) {
        this.nome = nome;
        this.mountAulas(aulasIndice);
    }
    
    private void mountAulas(int[] aulasIndice){
        this.aulas = new String[aulasIndice.length];
        for(int i=0; i<aulasIndice.length; i++){
            this.aulas[i] = MATERIAS[aulasIndice[i]];
        }
    }
    
    @Override
    public String toString(){
        String strTurma = "< Turma: "+this.nome+" >";
        for(int i=0; i<this.aulas.length; i++)
            strTurma = strTurma+"\n"+this.aulas[i];
        
        return strTurma;
    }
    
}
