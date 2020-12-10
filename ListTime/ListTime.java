package ListTime;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class ListTime {
    public void Stack () {
        final int iterationCount = 250000;
        Random rand = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterationCount; i++) {
            arrayList.add(rand.nextInt(100));
        }
        long endTime = System.currentTimeMillis();
        int addArrayListTime = (int) (endTime - startTime);
        System.out.println("ArrayList add time: " + addArrayListTime + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterationCount; i++) {
            arrayList.get(i);
        }
        endTime = System.currentTimeMillis();
        int getArrayListTime = (int) (endTime - startTime);
        System.out.println("ArrayList get time: " + getArrayListTime + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterationCount; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        endTime = System.currentTimeMillis();
        int removeArrayListTime = (int) (endTime - startTime);
        System.out.println("ArrayList remove time: " + removeArrayListTime + "ms");

        // -------------------------------------------------
        LinkedList<Integer> linkedList = new LinkedList<>();

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterationCount; i++) {
            linkedList.add(rand.nextInt(100));
        }
        endTime = System.currentTimeMillis();
        int addLinkedListTime = (int) (endTime - startTime);
        System.out.println("LinkedList add time: " + addLinkedListTime + "ms");

        System.out.println("LinkedList get method needs more time... Please wait");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterationCount; i++) {
            linkedList.get(i);
        }
        endTime = System.currentTimeMillis();
        int getLinkedListTime = (int) (endTime - startTime);
        System.out.println("LinkedList get time: " + getLinkedListTime + "ms");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterationCount; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        endTime = System.currentTimeMillis();
        int removeLinkedListTime = (int) (endTime - startTime);
        System.out.println("LinkedList remove time: " + removeLinkedListTime + "ms");
    }
}
