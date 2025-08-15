public class ContaBancaria {
    public String titular;
    public double saldo;

    public void depositar(double valor){
        saldo = saldo + valor;
        // saldo += valor;
        System.out.println("Deposito realizado com sucesso!");
    }

    public void sacar(double valor){
        // saldo -= valor;
        if (saldo >= valor){
            saldo = saldo - valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }


            }
}
