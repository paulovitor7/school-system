import actors.Aluno;

public class Principal {
    public static void main(String[] args){
        Aluno aluno = new Aluno("José", "123.123.123-12", 44);
        System.out.println(aluno.getPessoa());
    }
}
