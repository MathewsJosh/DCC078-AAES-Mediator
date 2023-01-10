package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveReservarViagemComConcierge() {
        Cliente cliente = new Cliente();
        assertEquals("A AgenciaDeViagens agradece seu contato.\nO Concierge respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Concierge vai reservar sua viagem: Por favor, reserve uma viagem para amanhã!",
                cliente.reservarViagem("Por favor, reserve uma viagem para amanhã!"));
    }

    @Test
    void deveCancelarViagemComConcierge() {
        Cliente cliente = new Cliente();
        assertEquals("A AgenciaDeViagens agradece seu contato.\nO Concierge respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O Concierge vai efetuar o cancelamento de sua viagem: Por favor, cancele a minha viagem!",
                cliente.cancelarViagem("Por favor, cancele a minha viagem!"));
    }

    @Test
    void deveParcelarViagemComConcierge() {
        Cliente cliente = new Cliente();
        assertEquals("A AgenciaDeViagens agradece seu contato.\nO Concierge respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>O Concierge vai analisar o parcelamento: Gostaria de parcelar a viagem em 96 vezes.",
                cliente.parcelarViagem("Gostaria de parcelar a viagem em 96 vezes."));
    }

}