public class Telegram extends ServicoMensagemInstantanea{@Override
public void enviarMensagem() {
    System.out.println("Enviando Mensagem pelo telegram");
}

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo telegram");
    }
}
