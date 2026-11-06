package main.java.com.lab7.functional.service;

import main.java.com.lab7.functional.interfaces.TextOperation;

public class TextService {

    public String processText(String text, int n, int limit) {

        TextOperation operation = (input, copies, maxWords) -> {

            String[] words = input.trim().split("\\s+");

            StringBuilder result = new StringBuilder();

            int counter = 0;

            for (int i = 0; i < copies; i++) {

                for (int j = 0; j < words.length; j++) {

                    if (counter == maxWords) {
                        return result.toString();
                    }

                    result.append(words[j]).append(", ");

                    counter++;
                }
            }

            return result.toString();
        };

        return operation.process(text, n, limit);
    }

    public String processTextStandard(String text, int n, int limit) {

        java.util.function.Function<String, String> operation = input -> { String[] words = input.trim().split("\\s+");

            StringBuilder result = new StringBuilder();

            int counter = 0;

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < words.length; j++) {

                    if (counter == limit) {
                        return result.toString();
                    }

                    result.append(words[j]).append(", ");

                    counter++;
                }
            }

            return result.toString();
        };

        return operation.apply(text);
    }
}
