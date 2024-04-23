package one.innovation.digital;

public class Iphone implements Ipod, Phone, InternetCommunicator {
    public void play() {
        System.out.println("Tocando uma música");
    }

    public void stop() {
        System.out.println("Pausando música");
    }

    public void selectSong() {
        System.out.println("Escolhendo música");
    }

    public void call() {
        System.out.println("Ligando para alguém");
    }

    public void answer() {
        System.out.println("Atendendo chamada");
    }

    public void startVoiceMail() {
        System.out.println("Iniciando caixa postal");
    }

    public void showWebPage() {
        System.out.println("Renderizando página da Web.");
    }
    public void addTab() {
        System.out.println("Abrindo nova guia.");
    }
    public void refreshPage() {
        System.out.println("Atualizando página da Web.");
    }
}
