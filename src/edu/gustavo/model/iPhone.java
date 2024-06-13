package edu.gustavo.model;

import edu.gustavo.interfaces.AparelhoTelefonico;
import edu.gustavo.interfaces.NavegadorNaInternet;
import edu.gustavo.interfaces.ReprodutorMusical;

public class iPhone implements AparelhoTelefonico, NavegadorNaInternet, ReprodutorMusical {


    // Métodos da interface ReprodutorMusical ------------------------------------------
    @Override
    public void tocar() {
        System.out.println("Tocar música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar música: " + musica);
    }

    // Métodos da interface AparelhoTelefonico ------------------------------------------
    @Override
    public void ligar(String numero) {
        System.out.println("Ligar para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atender chamada");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciar correio de voz");
    }

    // Métodos da interface NavegadorNaInternet ------------------------------------------
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibir página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionar nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar página");
    }
    
    // Método main para testar a implementação
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();

        // Testando ReprodutorMusical
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica("Minha Música Favorita");

        // Testando AparelhoTelefonico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando NavegadorNaInternet
        meuIphone.exibirPagina("http://example.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }    
}
