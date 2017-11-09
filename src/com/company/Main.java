package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");

        list.forEach(x -> System.out.println(x));

        Stream<String> stream = list.stream();
        List<String> aaa = stream.filter(x -> x == "A").collect(Collectors.toList());
        aaa.forEach(x -> System.out.println(x));

    }
}
