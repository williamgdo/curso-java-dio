package com.dio.List;

import java.util.*;
import java.util.stream.Stream;

public class Collections {

    public static void main(String[] args) {
        List<Double> notas = new ArrayList<>(Arrays.asList(3d, 8.2, 5d));
        List<Double> newNotas = new LinkedList<>();

        for (Double tmp : notas) {
//            System.out.println(tmp);
            newNotas.add(tmp);
        }

//        Iterator<Double> iterator = notas.iterator();
//        while (iterator.hasNext()) {
//            Double tmp = iterator.next();
//            System.out.println(tmp);
//            newNotas.add(tmp);
//        }

        Double first = newNotas.getFirst();
        boolean filter = newNotas.removeIf(i -> i < 6);
        Stream<Double> filter2 = newNotas.stream().filter(i -> i < 6);
        System.out.println(filter2);
//        Double firstButRemoved = newNotas.removeFirst();
//        System.out.println(firstButRemoved);
//        System.out.println(newNotas);
    }

}
