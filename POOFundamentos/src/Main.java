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

//        Musica musica1 = new Musica();
//        musica1.artista = "Queen";
//        musica1.titulo = "Bohemian Rhapsody";
//        musica1.duracao = 355;
//
//        System.out.println("Tocando agora: " + musica1.titulo);
//        System.out.println("Artista: " + musica1.artista);
//        System.out.println("Duracao: " + musica1.duracao + " segundos");

        //2. Criando a Classe Carro com um Método Simples

//        Carro carro1 = new Carro();
//        carro1.descricao = "hatch";
//        carro1.modelo = "Fiesta";
//        carro1.marca = "Ford";
//
//        carro1.exibirInformacoes();
//
//        System.out.println();
//
//        Carro carro2 = new Carro();
//        carro2.descricao = "SUV";
//        carro2.modelo = "TAOS";
//        carro2.marca = "VW";
//        carro2.exibirInformacoes();

        // 1. Criando a Classe Musica (Apenas Atributos)

//        Aluno aluno1 = new Aluno();
//        aluno1.nome = "Carlos";
//        aluno1.nota = 8.5;
//
//        aluno1.verificarStatus();
//
//        Aluno aluno2 = new Aluno();
//        aluno2.nome = "Ana";
//        aluno2.nota = 6.0;
//
//        aluno2.verificarStatus();


        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.titular = "Juliana";
        contaBancaria.saldo = 1000.00;

        contaBancaria.depositar(1000.00);
        contaBancaria.sacar(200.00);
        contaBancaria.sacar(1500.00);

    }
}