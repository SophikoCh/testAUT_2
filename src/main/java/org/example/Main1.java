package org.example;

abstract class VowelCounter {
   public abstract void countVowel(String input);
}


class VowelCounterImpl extends VowelCounter {
   @Override
   public void countVowel(String input) {
      if (input == null || input.isEmpty()) {
         System.out.println("Input string is empty or null.");
         return;
      }

      input = input.toLowerCase();

      String vowels = "aeiou";

      int count = 0;

      for (char ch : input.toCharArray()) {
         if (vowels.indexOf(ch) != -1) {
            count++;
         }
      }


      System.out.println("There are " + count + " vowels in this string.");
   }
}


public class Main1 {
   public static void main(String[] args) {
      VowelCounter counter = new VowelCounterImpl();

      counter.countVowel("Hello");
      counter.countVowel("I love testing");
      counter.countVowel("");
   }
}