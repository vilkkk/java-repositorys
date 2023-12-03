import javax.swing.JOptionPane;

public class corrente extends conta{
private double emprestimo = 12000;
public double getEmprestimo() {
    return emprestimo;
}

    public corrente(String Nconta, String Titular, double saldo, double emprestimo){
        super(Nconta, Titular, saldo);
        this.emprestimo = emprestimo;
    }

    @Override
    public void rendimento(){
        JOptionPane.showMessageDialog(null, "Sua conta não possui rendimento mensal");
    }
}
