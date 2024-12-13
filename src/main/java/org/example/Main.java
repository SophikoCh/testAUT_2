package org.example;

interface ReplaceA {
    void replaceSymbolA(String input);
}


interface ReplaceB {
    void replaceSymbolB(String input);
}


class ReplaceSymbols implements ReplaceA, ReplaceB {
    @Override
    public void replaceSymbolA(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input string is empty or null.");
            return;
        }
        String result = input.replace('a', 'z');
        System.out.println(result);
    }

    @Override
    public void replaceSymbolB(String input) {
        if (input == null || input.isEmpty()) {
            System.out.println("Input string is empty or null.");
            return;
        }
        String result = input.replace('b', 'w');
        System.out.println(result);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of the class implementing both interfaces
        ReplaceSymbols replacer = new ReplaceSymbols();


        replacer.replaceSymbolA("Lela");

        replacer.replaceSymbolB("Gabelaia");
    }
}