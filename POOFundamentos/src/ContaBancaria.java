public class ContaBancaria {
    public String titular;
    public double saldo;

    public void depositar(double valor){
        valor = valor + saldo;
        System.out.println("Deposito realizado com sucesso! seu novo saldo e " + saldo);
    }

    public void sacar(double valor){
        valor = valor - saldo;
        if (valor > saldo){
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
            }
}
