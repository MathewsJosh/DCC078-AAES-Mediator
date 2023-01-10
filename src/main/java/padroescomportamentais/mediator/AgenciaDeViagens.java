package padroescomportamentais.mediator;

public class AgenciaDeViagens {

    private static AgenciaDeViagens instancia = new AgenciaDeViagens();

    private AgenciaDeViagens() {}

    public static AgenciaDeViagens getInstancia() {
        return instancia;
    }

    public String receberReservaConcierge(String mensagem) {
        return "A AgenciaDeViagens agradece seu contato.\n"+
                "O Concierge respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Concierge.getInstancia().reservarViagem(mensagem);
    }

    public String receberCancelamentoConcierge(String mensagem) {
        return "A AgenciaDeViagens agradece seu contato.\n"+
                "O Concierge respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Concierge.getInstancia().cancelarViagem(mensagem);
    }

    public String receberParcelamentoDeViagemConcierge(String mensagem) {
        return "A AgenciaDeViagens agradece seu contato.\n"+
                "O Concierge respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Concierge.getInstancia().parcelarViagem(mensagem);
    }

}
