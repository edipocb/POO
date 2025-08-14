//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // STATIC - nao usa programacao orientada a objetos
    // String e uma classe por isso comeca com letra maiuscula

    // Objeto utilizado para criar um carro
    // HB20 e um objeto da classe carro
    //Bolo de cenoura e um objeto da forma bola
    // livro e um objeto da classe livro
    // classe CACHORRO   TEM OS objetos rex - atila - lulu
    // classe explica o que e aquilo (forma)

    public static void main(String[] args) {

        //Criar variavel do tipo produto//
      // TIPO NOME = new TIPO(); // NEW Produto(); UTILIZADO PARA INSTANCIAR A CLASSE
//        Produto prod1 = new Produto();
//        prod1.nome = "Monitor";
//        prod1.preco = 850.00;
//        prod1.marca = "Dell";
//
//        prod1.mostrarInformacoes();
//
//        Produto prod2 = new Produto();
//        prod2.nome = "Notebook";
//        prod2.preco = 3000.00;
//        prod2.marca = "Dell";
//
//        prod2.mostrarInformacoes();

        Carro carro1 = new Carro();
        carro1.descricao = "hatch";
        carro1.modelo = "Fiesta";
        carro1.marca = "Ford";

        carro1.exibirInformacoes();

        System.out.println();

        Carro carro2 = new Carro();
        carro2.descricao = "SUV";
        carro2.modelo = "TAOS";
        carro2.marca = "VW";
        carro2.exibirInformacoes();
    }
}