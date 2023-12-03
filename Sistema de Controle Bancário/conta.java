import javax.swing.JOptionPane;

public class conta {
    protected String Nconta;
    protected String titular;
    protected double saldo;

    public conta(String Nconta, String titular, double saldo){
    this.Nconta = Nconta;
    this.titular = titular;
    this.saldo = saldo;
    }

    public void setNconta(String nconta) {
        Nconta = nconta;
    }
    public String getNconta() {
        return Nconta;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }
    public String getTitular() {
        return titular;
    }
    public void deposito(double valor){
        saldo += valor;
        JOptionPane.showMessageDialog(null, "Deposito de R$" + valor + " realizado com sucesso.\n"
        + "Saldo atual R$" + saldo);

    }

    public void saque(double valor){
        if(valor > saldo){
            JOptionPane.showMessageDialog(null, "Saldo insuficiente para sacar R$" + valor);
        }
        else{
        saldo -= valor;
        JOptionPane.showMessageDialog(null, "Saque de R$" + valor + " realizado com sucesso.\n"
        + "Saldo atual R$" + saldo);
        }   
    }

    public void rendimento(){

    }
}
