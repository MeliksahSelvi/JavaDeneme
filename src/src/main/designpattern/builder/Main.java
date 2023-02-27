package src.main.designpattern.builder;

public class Main {

    public static void main(String[] args) {
        User user=new User.UserBuilder("Ali","Yılmaz").
                email("aliveli@gmail.com").
                telefonNo("552").
                build();

        System.out.println(user.getEmail());

        //User nesnesi oluşturulmak için UserBuilder static class'ı ; builder desing pattern'ına uygun olarak oluşturuldu.
    }
}