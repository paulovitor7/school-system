import actors.Professor;

public class Principal {
    public static void main(String[] args){
        Professor prof1 = new Professor("José", "123.123.123-12", 44);
        System.out.println(prof1.toString());
        
        Professor prof2 = new Professor("Maria", "123.2123.100-87", 27);
        System.out.println(prof2.toString());
        
        prof2.batePonto();
    }
}
