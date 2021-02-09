package com.sonda.GerenciadorAeronaves.model;

import java.util.Arrays;
import java.util.List;

public class DistinctTest {
    public static void main(String[] args) {

        List<String> companyList = Arrays.asList(
                "Websparrow", "Google", "Microsoft",
                "Websparrow", "Adobe", "Google", "Websparrow");

        // count distinct element in list
        long count = companyList.stream().distinct().count();
        System.out.println("Total distinct element in list: " + count);

        // looping distinct element
        companyList.stream().distinct().forEach(c -> System.out.println(c));

    }
}
