package main.java.com.lab7.functional.service;


import main.java.com.lab7.functional.interfaces.StringCondition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ArrayService {

    public String[] filterCustom(String[] words, int limit) {

        StringCondition condition = text -> text.length() > limit;

        List<String> result = new ArrayList<>();

        for (String word : words) {

            if (condition.check(word)) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }

    public String[] filterStandard(String[] words, int limit) {

        Predicate<String> condition = text -> text.length() > limit;

        return Arrays.stream(words)
                .filter(condition)
                .toArray(String[]::new);
    }
}
