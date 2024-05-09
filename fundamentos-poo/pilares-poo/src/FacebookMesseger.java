public class FacebookMesseger extends ServicoMensagemInstantanea{

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando Mensagem pelo facebook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo facebook");
    }
}
