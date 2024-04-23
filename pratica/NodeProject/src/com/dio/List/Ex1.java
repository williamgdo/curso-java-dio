package com.dio.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

enum monthsName { Janeiro, Fevereiro , Marco, Abril, Maio, Junho };
class monthTemperature implements Comparable<monthTemperature> {
    public Double degrees;

    public monthTemperature(Double degrees, int monthNumber) {
        this.degrees = degrees;
        this.monthNumber = monthNumber;
    }

    @Override
    public String toString() {
        monthsName[] months = monthsName.values();

        return "monthTemperature{" +
                "degrees=" + degrees +
                ", monthNumber=" + monthNumber + " (" + months[monthNumber - 1] +  ")}";
    }

    public int monthNumber; // 1 to 12

    @Override
    public int compareTo(monthTemperature o) {
        return Double.compare(this.degrees, o.degrees);
    }
}
public class Ex1 {

    public static void main(String[] args) {
        monthsName[] months = monthsName.values();

        List<monthTemperature> temperatures = new ArrayList<>(){{
            add(new monthTemperature(20d, 1));
            add(new monthTemperature(25d, 2));
            add(new monthTemperature(26d, 3));
            add(new monthTemperature(23d, 4));
            add(new monthTemperature(22d, 5));
            add(new monthTemperature(21.5d, 6));
        }};

//        List<monthTemperature> temperatures = new ArrayList<>();
//        Scanner scan = new Scanner( System.in );
//        for (int i = 0; i < 6; i++) {
//            System.out.println("Digite a média da temperatura de " + months[i] + ": " );
//            double temp = scan.nextDouble();
//            temperatures.add(new monthTemperature(temp, i+1));
//        }


        Double sum = temperatures.stream().reduce(0d, (total, month) -> total + month.degrees, Double::sum);
        double average = sum / temperatures.size();

        System.out.println(temperatures);
        System.out.println("Processing temperatures...");

        List<monthTemperature> processedTemperatures = temperatures.stream()
                .filter(monthTemperature -> monthTemperature.degrees > average)
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(processedTemperatures);

        System.out.println("Meses com temperatura acima da média (" +
                + average + " graus)" +
                ", ordenado por maior temperatura: \n");

        int i = 0;


        for ( monthTemperature temp : processedTemperatures ) {
            System.out.println(i+1 + " - " + months[temp.monthNumber - 1]);
            i++;
        }
    }
}
