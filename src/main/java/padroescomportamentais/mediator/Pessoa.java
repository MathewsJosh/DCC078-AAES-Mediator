package padroescomportamentais.mediator;

public class Pessoa {

    public String reservarViagem(String mensagem) {
        return AgenciaDeViagens.getInstancia().receberReservaConcierge(mensagem);
    }

    public String cancelarViagem(String mensagem) {
        return AgenciaDeViagens.getInstancia().receberCancelamentoConcierge(mensagem);
    }

    public String parcelarViagem(String mensagem) {
        return AgenciaDeViagens.getInstancia().receberParcelamentoDeViagemConcierge(mensagem);
    }


}
