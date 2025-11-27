package org.example;

import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
        String message = "hello shadow jar world";

        // Using a method from the bundled commons-lang3 library
        String capitalizedMessage = StringUtils.upperCase(message);

        System.out.println("Original: " + message);
        System.out.println("Transformed: " + capitalizedMessage);
    }
}