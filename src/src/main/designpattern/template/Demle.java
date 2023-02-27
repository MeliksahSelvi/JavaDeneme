package src.main.designpattern.template;

public abstract class Demle {

    public Demle() {//template method olarak constructor'u belirledik
        suKaynat();
        demle();
        bardagadok();
        ekIslem();
    }

    private void suKaynat(){
        System.out.println("Su Kaynatılıyor");
    }

    protected abstract void demle();

    private void bardagadok(){
        System.out.println("Bardağa Dökülüyor");
    }

    protected abstract void ekIslem();

    //demle ve ekIslem methodları alt sınıf tarafından kendi isteğine göre doldurulacak ama bu methodların çağrılma sırasına müdahale edemiyor.
}
