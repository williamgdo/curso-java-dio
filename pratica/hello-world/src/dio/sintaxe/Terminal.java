package dio.sintaxe;

import java.util.Locale;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        String name, lastName;
        int age;
        double height;

        if (args.length == 4) {
            name = args[0];
            lastName = args[1];
            age = Integer.parseInt(args[2]);
            height = Double.parseDouble(args[3]);
        }
        else {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            name = scanner.next();

            System.out.println("Digite seu sobrenome");
            lastName = scanner.next();

            System.out.println("Digite sua idade");
            age = scanner.nextInt();

            System.out.println("Digite sua altura");
            height = scanner.nextDouble();
        }


        System.out.println("Ola, me chamo " + name + " " + lastName);
        System.out.println("Tenho " + age + " anos ");
        System.out.println("Minha altura é " + height + "cm ");
    }
}
