// public class NOME {}

public class Produto {
    // 1. Atributo? Quais?
    // variavel "Especial"
    // Tamanho, preco, cor, unidade, marca, nome
    // public TIPO NOME;

    public String nome;
    public double tamanho;
    public double preco;
    public String cor;
    public int unidade;
    public String marca;

    // 2. Metodo? Quais?
    // Mostra informacoes do produto
    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Marca: " + marca);
    }

}
