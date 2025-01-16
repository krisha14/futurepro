package com.generalprojects;

import java.util.ArrayList;
import java.util.Iterator;

public class ALremove {
    public static void main(String[] args) { // Create an ArrayList and add some elements
        ArrayList<String> list = new ArrayList<>();
        list.add("John");
        list.add("Ravi K");
        list.add("Ravi V");
        list.add("David");
        list.add("Michael");
        System.out.println("Original list: " + list);
        // Use an iterator to remove elements that start with "Ravi"
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("Ravi")){
                iterator.remove();
            }
        }
        System.out.println("List after removing names starting with 'Ravi': " + list); }

}
