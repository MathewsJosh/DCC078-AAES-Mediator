package padroescomportamentais.mediator;

public interface Setor {
    String reservarViagem(String mensagem);
    String cancelarViagem(String mensagem);
    String parcelarViagem(String mensagem);
}
