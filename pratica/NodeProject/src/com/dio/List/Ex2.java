package com.dio.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        java.util.List<String> questions = new ArrayList<>();

        System.out.println("Responda APENAS 'S' para sim ou 'N' para não");

        System.out.println("Telefonou para a vítima? ");
        questions.add(scan.next());


        System.out.println("Esteve no local do crime? ");
        questions.add(scan.next());

        System.out.println("Mora perto da vítima? ");
        questions.add(scan.next());

        System.out.println("Devia para a vítima? ");
        questions.add(scan.next());

        System.out.println("Já trabalhou com a vítima? ");
        questions.add(scan.next());

        Iterator<String> iterator = questions.iterator();

        int count = 0;
        while (iterator.hasNext()) {
            String answer = iterator.next();
            System.out.println(answer);

            if (answer.equalsIgnoreCase("s"))
                count++;
        }

        System.out.println(questions);
        if (count == 0)
            System.out.println("Inocente");
        else if (count > 0 && count < 3)
            System.out.println("Suspeito");
        else if (count >= 3 && count < 5)
            System.out.println("Cúmplice");
        else
            System.out.println("Assassina");

    }
}