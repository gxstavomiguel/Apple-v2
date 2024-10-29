public class Main {
    public static void main(String[] args) {
        Iphone cell = new Iphone("iPhone 15 PRO", "183010");

        cell.tocar();
        cell.escolherMusica("Numb");
        cell.pausar();

        cell.ligar("0800");
        cell.atender();

        cell.exibirPagina("https://google.com");
        cell.adicionarNovaPagina();
        cell.atualizarPagina();
    }
}
