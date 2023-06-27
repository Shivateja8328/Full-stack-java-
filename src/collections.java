package javaprograms;

import java.util.HashSet;
import java.util.Iterator;

public class collections
{
    public static void main(String[] args) {
  
        HashSet<String> stringSet = new HashSet<>();

        // Add 10 strings to the HashSet
        stringSet.add("one");
        stringSet.add("two");
        stringSet.add("three");
        stringSet.add("four");
        stringSet.add("five");
        stringSet.add("six");
        stringSet.add("seven");
        stringSet.add("eight");
        stringSet.add("nine");
        stringSet.add("ten");

        System.out.println("Iterating HashSet using Iterator:");
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

        
        System.out.println("\nIterating HashSet using ForEach:");
        for (String element : stringSet) {
            System.out.println(element);
        }

       
        System.out.println("\nIterating HashSet using Streams ForEach:");
        stringSet.stream().forEach(element -> System.out.println(element));
    }
}
