import javax.swing.JOptionPane;

public class test {
    public static void main(String[] args) throws Exception {
        second dados = new second();
        int opt1;
        int opt2;
        int opt3;
        int num;
        double valor;

        opt1 = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo\n"
                + "1 - Realizar compra\n"
                + "2 - Sair\n"));
        
        while(opt1!=2){
            
            valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da sua compra"));
            opt2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o metodo de pagamento\n"
                + "1 - Dinheiro ou Pix | 15% de desconto\n"
                + "2 - Credito | selecione para consultar descontos disponiveis\n"
                + "3 - Debito | 10% de desconto\n"
                + "4 - Cancelar compra"));
            if(opt2==1){
                dados.setPix(valor);
                JOptionPane.showMessageDialog(null, "A forma de pagamento escolhida garante 15% de desconto\n"
                    + "O valor total da compra foi de: R$"+dados.getPix());
            }
            else if(opt2==2){
                opt3 = Integer.parseInt(JOptionPane.showInputDialog("Informe a opção de parcelamento\n"
                    + "1 - A vista | 10% de desconto\n"
                    + "2 - Em duas vezes sem juros\n" 
                    + "3 - A partir de tres vezes com 10% de juros"));
                if(opt3==1){
                    dados.setCard1(valor);
                    JOptionPane.showMessageDialog(null, "A forma de pagamento escolhida garante 10% de desconto\n"
                    + "O valor total da compra foi de: R$"+dados.getCard1());
                }
                else if(opt3==2){
                    dados.setCard2(valor);
                    JOptionPane.showMessageDialog(null, "Sua compra sera parcelada em até das vezes\n"
                    + "Você sera cobrado em duas parcelas de: R$"+dados.getCard2());
                }
                else if(opt3==3){
                    dados.setCard3(valor);
                    num = Integer.parseInt(JOptionPane.showInputDialog("Informe o numero de parcelas desejado\n"
                        + "Entre 3 e 12 parcelas"));
                    dados.setParc(num);
                    JOptionPane.showMessageDialog(null, "Sua compra sera parcelada entre 3 e 12 parcelas\n"
                    + "Você sera cobrado em "+num+" parcelas de: R$"+dados.getCard3());
                }
            }
            else if(opt2==3){
                dados.setCard1(valor);
                    JOptionPane.showMessageDialog(null, "A forma de pagamento escolhida garante 10% de desconto\n"
                    + "O valor total da compra foi de: R$"+dados.getCard1());
            }
            else if(opt2==4){
                System.exit(1);    
            }
            System.exit(1);
        }
    }
}    
