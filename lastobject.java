package week3;


import java.util.ArrayList;

public class lastobject {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("lambo");
        list.add("ferari");
        list.add("volvo");

        System.out.println("" + list);

        // Remove the last object
        if (!list.isEmpty()) {
            list.remove(list.size() - 1);
        }

        System.out.println("removal: " + list);
    }
}

