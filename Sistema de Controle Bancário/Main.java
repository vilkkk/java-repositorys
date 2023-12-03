import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        corrente cc = new corrente("10001", "jorge", 5000, 12000);
        poupança cp = new poupança("11001", "Amanda", 7000, 0.6);
        
        int opt1;
        
        opt1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero da sua conta"));

        if(opt1 == 10001){
            int opt2;
            opt2 = Integer.parseInt(JOptionPane.showInputDialog("-----Menu-----\n"
            + "1 - Depositar\n"
            + "2 - Sacar\n"
            + "3 - Consultar saldo\n"
            + "4 - Consultar rendimento\n"
            + "5 - Sair"));

            switch (opt2) {
                case 1:
                    double valorD = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do deposito"));
                    cc.deposito(valorD);
                    break;
                case 2: 
                    double valorS = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque"));
                    cc.saque(valorS);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saldo atual: R$" + cc.getSaldo());
                    break;
                case 4:
                    conta[] contas = {cc};
                    for (conta conta : contas){
                        conta.rendimento();
                    }
                    break;
                case 5:
                    System.exit(1);    
                    break;  
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida. Tente novamente.");
                    break;
            }
        }
        else if(opt1 == 11001){
            int opt3;
            opt3 = Integer.parseInt(JOptionPane.showInputDialog("-----Menu-----\n"
            + "1 - Depositar\n"
            + "2 - Sacar\n"
            + "3 - Consultar saldo\n"
            + "4 - Consultar rendimento\n"
            + "5 - Sair"));

            switch (opt3) {
                case 1:
                    double valorD = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do deposito"));
                    cp.deposito(valorD);
                    break;
                case 2: 
                    double valorS = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do saque"));
                    cp.saque(valorS);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saldo atual: R$" + cp.getSaldo());
                    break;
                case 4:
                    conta[] contas = {cp};
                    for (conta conta : contas){
                        conta.rendimento();
                    }
                    break;
                case 5:
                    System.exit(1);    
                    break;  
                default:
                    JOptionPane.showMessageDialog(null, "Opção invalida. Tente novamente.");
                    break;
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Número de conta invalido.");
        }
}
}
