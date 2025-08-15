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
        Produto prod1 = new Produto("Monitor", 850.00, "Dell", 14);
//        prod1.nome = "Monitor";
//        prod1.preco = 850.00;
//        prod1.marca = "Dell";

//      GET = PEGAR
        System.out.println(prod1.getNome());
        System.out.println(prod1.getNome());

//    SET - definir, mudar



        // GETTERS e SETTERS para acessar ites privados

//        prod1.mostrarInformacoes();

        Produto prod2 = new Produto("Notebook", 3000.00, "Dell", 15);
//        prod2.nome = "Notebook";
//        prod2.preco = 3000.00;
//        prod2.marca = "Dell";

//        prod2.mostrarInformacoes();

//        Musica musica1 = new Musica("Queen", "Bohemian Rhapsody", 355);
//        musica1.artista = "Queen";
//        musica1.titulo = "Bohemian Rhapsody";
//        musica1.duracao = 355;

//        System.out.println("Titulo: " + musica1.titulo);
//        System.out.println("Artista: " + musica1.artista);
//        System.out.println("Duracao: " + musica1.duracao + " segundos");

//        musica1.exibirFichaTecnica();



        //2. Criando a Classe Carro com um Método Simples

//        Carro carro1 = new Carro("Ford", "Fiesta", 2000);
//        carro1.descricao = "hatch";
//        carro1.modelo = "Fiesta";
//        carro1.marca = "Ford";

//        carro1.exibirInformacoes();
//
//        System.out.println();
//
//        Carro carro2 = new Carro("VW", "Gol", 2021);
//        carro2.descricao = "SUV";
//        carro2.modelo = "TAOS";
//        carro2.marca = "VW";
//        carro2.exibirInformacoes();

        // 1. Criando a Classe Musica (Apenas Atributos)

        Aluno aluno1 = new Aluno("Carlos", 8.5);
//        aluno1.nome = "Carlos";
//        aluno1.nota = 8.5;
//
        aluno1.verificarStatus();
//
        Aluno aluno2 = new Aluno("Ana", 6.0);
//        aluno2.nome = "Ana";
//        aluno2.nota = 6.0;
//
        aluno2.verificarStatus();

//      4. Gerenciando uma ContaBancaria

//        ContaBancaria contaBancaria = new ContaBancaria();
//        contaBancaria.titular = "Juliana";
//        contaBancaria.saldo = 1000.00;
//
//        contaBancaria.depositar(500.00);
//        System.out.println("Saldo atual: " + contaBancaria.saldo);
//        contaBancaria.sacar(200.00);
//        System.out.println("Saldo após saque: " + contaBancaria.saldo);
//        contaBancaria.sacar(1500.00);
//        System.out.println("Saldo final: " + contaBancaria.saldo);
//
//        5. Controlando o Estoque de um Produto



    }
}