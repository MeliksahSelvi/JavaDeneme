package src.main.designpattern.template;

public class Kahve extends Demle{

    @Override
    protected void demle() {
        System.out.println("V60 ile demleniyor ");
    }

    @Override
    protected void ekIslem() {
        System.out.println("Süt Ekleniyor");
    }
}
