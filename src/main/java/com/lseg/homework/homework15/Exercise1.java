package com.lseg.homework.homework15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Exercise1 {
    public static final String INPUT_PATH = "./src/main/resources/input.txt";

    public static void main(String... args) throws IOException {

        try (Scanner input = new Scanner(new FileInputStream(com.lseg.homework.homework15.CharStreams.INPUT_TXT));
             OutputStream out = new FileOutputStream("./src/main/resources/output.txt")) {

            ArrayList<String> words = new ArrayList<>();

            input.useDelimiter("\\s+");

            Set<String> occurrences = new TreeSet<>();

            while (input.hasNext()) {
                words.add(input.next());
            }

            List<String> collectedWords = words.stream()
                    .map(String::toLowerCase)
                    .map(s -> s.replaceAll("[(,\\.)]*", ""))
                    .map(s -> s.replaceAll("\\[[1-9\\]]*", ""))
                    .sorted()
                    .collect(Collectors.toList());

            for (String word : collectedWords) {
                occurrences.add(Collections.frequency(collectedWords, word) + ": " + word);
            }

            for (String word : occurrences) {
                System.out.println(word);
            }
        }
    }

}


