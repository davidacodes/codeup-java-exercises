package practice.flowcontrol;

import java.util.ArrayList;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {

        int x = 5;

        while (x > 0) {
            System.out.println("x is " + x);
            x--;
        }

        for (int y = 0; y < 5; y++) {
            System.out.println("y is " + y);
        }

        String[] names = {"Fred", "Jim", "Sheila"};
        System.out.println("name-zero is " + names[0]);
        names[0] = "Fredrick";
        for (String n : names) {
            System.out.println("name is " + n);
        }

        // List is an "interface"
        List<String> nameList = new ArrayList<>();
        nameList.add("Fred");
        System.out.println("list is " + nameList);
        nameList.add("Jim");
        System.out.println("list is " + nameList);
        nameList.add("Sheila");
        System.out.println("list is " + nameList);

//        for (String n : )
    }
}
