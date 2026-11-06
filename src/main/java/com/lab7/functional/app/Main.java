package main.java.com.lab7.functional.app;

import main.java.com.lab7.functional.service.ArrayService;
import main.java.com.lab7.functional.service.NumberService;
import main.java.com.lab7.functional.service.TextService;

import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        TextService textService = new TextService();
        NumberService numberService = new NumberService();
        ArrayService arrayService = new ArrayService();

        logger.info("Task 1");

        logger.info("Enter a text:");
        String text = scanner.nextLine();

        logger.info("Enter the number of copies:");
        int n = scanner.nextInt();

        logger.info("Enter the maximum number of words:");
        int limit = scanner.nextInt();

        logger.info("Custom functional interface:");
        logger.info(textService.processText(text, n, limit));

        logger.info("Standard functional interface:");
        logger.info(textService.processTextStandard(text, n, limit));

        logger.info("Task 2");

        logger.info("Enter a number from 0 to 9999:");
        int number = scanner.nextInt();

        logger.info("Custom functional interface:");
        logger.info(numberService.convertCustom(number));

        logger.info("Standard functional interface:");
        logger.info(numberService.convertStandard(number));

        logger.info("Task 3");

        logger.info("Enter the number of strings:");
        int count = scanner.nextInt();

        scanner.nextLine();

        String[] words = new String[count];

        for (int i = 0; i < count; i++) {
            logger.info("Enter string " + (i + 1) + ":");
            words[i] = scanner.nextLine();
        }

        logger.info("Enter the minimum string length:");
        int length = scanner.nextInt();

        String[] customResult =
                arrayService.filterCustom(words, length);

        String[] standardResult =
                arrayService.filterStandard(words, length);

        logger.info("Custom functional interface:");
        logger.info(Arrays.toString(customResult));

        logger.info("Standard functional interface:");
        logger.info(Arrays.toString(standardResult));

        scanner.close();
    }
}