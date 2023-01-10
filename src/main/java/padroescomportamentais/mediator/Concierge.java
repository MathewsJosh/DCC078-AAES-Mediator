package padroescomportamentais.mediator;

public class Concierge implements Setor {

    private static Concierge instancia = new Concierge();

    private Concierge() {}

    public static Concierge getInstancia() {
        return instancia;
    }

    public String reservarViagem(String mensagem) {
        return "O Concierge vai reservar sua viagem: " + mensagem;
    }

    public String cancelarViagem(String mensagem) {
        return "O Concierge vai efetuar o cancelamento de sua viagem: " + mensagem;
    }

    public String parcelarViagem(String mensagem) {
        return "O Concierge vai analisar o parcelamento: " + mensagem;
    }
}
