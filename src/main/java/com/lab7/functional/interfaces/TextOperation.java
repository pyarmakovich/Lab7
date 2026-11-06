package main.java.com.lab7.functional.interfaces;

@FunctionalInterface
public interface TextOperation {

    String process(String text, int n, int limit);
}