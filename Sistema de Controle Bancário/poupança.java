import javax.swing.JOptionPane;

public class poupança extends conta{
    private double renda;
    public void setRenda(double renda) {
        this.renda = renda;
    }
    public double getRenda() {
        return renda;
    }
    private double taxa;
    public double getTaxa() {
        return taxa;
    }

    public poupança(String Nconta, String titular, double saldo, double taxa){
        super(Nconta, titular, saldo);
        this.taxa = taxa;
    }

    @Override
    public void rendimento(){
        renda = saldo * 0.006;
        JOptionPane.showMessageDialog(null, "O rendimento mensal da sua conta foi de R$" + renda + "\n"
        + "Saldo atual: R$" +(saldo + renda));
    }
}
