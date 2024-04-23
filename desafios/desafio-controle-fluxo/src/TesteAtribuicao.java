public class TesteAtribuicao {
    public static void main(String[] args) {
        int a = 2, b = 3;
        String nome = "William";
        nome += " Dutra";

        System.out.println("before sobrenome: " + nome);
        sobrenome(nome);

        nome = "Eliane";
        System.out.println("after sobrenome: " + nome);
    }

    static void dobrar(int num) {
        num *= 2;
        System.out.println("inside dobrar: " + num);
    }

    static void sobrenome(String nome) {
        nome += " Oliveira";
        System.out.println("inside dobrar: " + nome);
    }
}
