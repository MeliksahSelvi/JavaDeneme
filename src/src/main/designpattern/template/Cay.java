package src.main.designpattern.template;

public class Cay extends Demle{

    @Override
    protected void demle() {
        System.out.println("Çaydanlık İle Demleniyor");
    }

    @Override
    protected void ekIslem() {
        System.out.println("Şeker Ekleniyor");
    }
}
