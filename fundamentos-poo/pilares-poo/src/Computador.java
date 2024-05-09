public class Computador {
    public static void main(String[] args) {
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println("FACEBOOK");
        FacebookMesseger fcb = new FacebookMesseger();
        fcb.enviarMensagem();
        fcb.receberMensagem();
        System.out.println("TELEGRAM");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.receberMensagem();


    }
}
