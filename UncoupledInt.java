/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author sameer
 */
public class UncoupledInt {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter comma separated integers please ");

        String line;
        String[] lineVector;

        line = scan.nextLine();
        line = line.replaceAll("\\s+", "");

        lineVector = line.split(",");

        for (String singleItem : lineVector) {
            list.add(Integer.parseInt(singleItem));
        }

        Map<Integer, Long> itemFrequencyMap = list.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        itemFrequencyMap.forEach((k, v)
                -> {
            if (v == 1) {
                System.out.println(k);
            }
        });

    }

}
