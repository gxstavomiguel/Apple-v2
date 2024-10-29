public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    private String modelo;
    private String numeroDeSerie;

    public Iphone(String modelo, String numeroDeSerie) {
        this.modelo = modelo;
        this.numeroDeSerie = numeroDeSerie;
    }

    // Implementação dos métodos de ReprodutorMusical
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    public void pausar() {
        System.out.println("Música pausada.");
    }

    public void escolherMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    public void ligar(String numero) {
        System.out.println("Ligando para o número: " + numero);
    }

    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo a página: " + url);
    }

    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova aba no navegador.");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página.");
    }
}
