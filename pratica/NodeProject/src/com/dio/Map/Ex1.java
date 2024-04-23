package com.dio.Map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<String, Double> populationPerState = new HashMap<>();
        populationPerState.put("PE", 9616621d);
        populationPerState.put("AL", 3351543d);
        populationPerState.put("CL", 9187103d);
        populationPerState.put("RN", 3534265d);
//        populationPerState.put("PB", 4039277d);

        System.out.println(populationPerState);

        // substitua a populacao do RN
        populationPerState.put("RN", 3534165d);

        System.out.println(populationPerState);

        // confira se o estado PB existe, senao adicione
        if (populationPerState.containsKey("PB"))
            System.out.println("já contem!");
        else
            populationPerState.put("PB", 4039277d);

        System.out.println(populationPerState);
    }
}
