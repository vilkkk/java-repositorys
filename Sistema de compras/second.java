public class second{

    private double pix, card1, card2, card3, parc; 
    
    public double getPix() {
        pix = ((pix/10)*1.5)-pix; 
        return pix;
    }
    public void setPix(double pix) {
        this.pix = pix;
    }
    public double getCard1() {
        card1 = ((card1/10)*1)-card1;
        return card1;
    }
    public void setCard1(double card1) {
        this.card1 = card1;
    }
    public double getCard2() {
        card2 = card2/2;
        return card2;
    }
    public void setCard2(double card2) {
        this.card2 = card2;
    }
    public double getParc() {
        return parc;
    }
    public void setParc(double parc) {
        this.parc = parc;
    }
    public double getCard3() {
        card3 = card3/parc;
        return card3;
    }
    public void setCard3(double card3) {
        this.card3 = card3;
    }
}
