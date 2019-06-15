package templates;

public class Materia {
    protected static final String[] MATERIAS = {
        "Matematica",
        "Portugues",
        "Biologia",
        "Artes",
        "Historia",
        "Sociologia",
        "Filosofia"
    };
    
    public static String[] getMaterias(){
        return MATERIAS;
    }
    
    @Override
    public String toString(){
        String strMatrias = "";
        for(int i=0; i<MATERIAS.length; i++){
            strMatrias = strMatrias+"\n"+(i+1)+": "+MATERIAS[i];
        }
        return strMatrias;
    }
}
