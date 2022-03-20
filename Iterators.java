package Java_programs;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Ajay");
        arrayList.add("Deepak");
        arrayList.add("Geeta");

        Iterator<String> iterator = arrayList.iterator();

    }
}
