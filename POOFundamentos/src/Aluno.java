public class Aluno {

    public String nome;
    public double nota;

    public void verificarStatus() {
        if (nota >= 7){
            System.out.println(nome + ": Aprovado(a)");
        } else {
            System.out.println(nome + ": Reprovado(a)");
        }
    }
}
