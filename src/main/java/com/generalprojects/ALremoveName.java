package com.generalprojects;


import java.util.ArrayList;
import java.util.Iterator;

public class ALremoveName {
    public static void main(String args[]) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ravi A");
        names.add("Ravi B");
        names.add("Ravi C");
        names.add("Krishna");
        names.add("Deepak");
        names.add("Aasit");
        names.add("Vandana");

        System.out.println("Original ArrayList: " + names);

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("Ravi")) {
                iterator.remove();
            }
        }
        System.out.println(names);
    }
//    public static void removeName(ArrayList<String> names){
//                System.out.println("Original ArrayList: " + names);
//
//                for (int i = 0; i < names.size(); i++) {
//                    if (names.get(i).equals("Rohan")) {
//                        names.remove(i);
//                        i--;
//                    }
//                }
//    }



}


//select salary from employee
//        order by salary desc
//        limit 1 offset 2;
//
//create procedure Krishna if not exists
//        as
//select * from employee where emp_id = 3
//        go;