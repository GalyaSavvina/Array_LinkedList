package org.example;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_LinkedList {

    public static void testAdd(int iterations) {
        System.out.println("Add Method:");
        System.out.println("| Collection | Iterations | Time (ms) |");

        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            arrayList.add(i);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("| ArrayList  | " + iterations + "          | " + duration + "        |");

        List<Integer> linkedList = new LinkedList<>();
        startTime = System.currentTimeMillis();

        for (int i = 0; i < iterations; i++) {
            linkedList.add(i);
        }

        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("| LinkedList | " + iterations + "          | " + duration + "        |\n");
    }

    public static void testDelete(int iterations) {
        System.out.println("Delete Method:");
        System.out.println("| Collection | Iterations | Time (ms) |");

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < iterations; i++) {
            arrayList.add(i);
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            arrayList.remove(0);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("| ArrayList  | " + iterations + "          | " + duration + "        |");

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < iterations; i++) {
            linkedList.add(i);
        }

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            linkedList.remove(0);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("| LinkedList | " + iterations + "          | " + duration + "        |\n");
    }

    public static void testGet(int iterations) {
        System.out.println("Get Method:");
        System.out.println("| Collection | Iterations | Time (ms) |");

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < iterations; i++) {
            arrayList.add(i);
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            arrayList.get(i);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("| ArrayList  | " + iterations + "          | " + duration + "        |");

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < iterations; i++) {
            linkedList.add(i);
        }

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            linkedList.get(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("| LinkedList | " + iterations + "          | " + duration + "        |\n");
    }


    public static void testContains(int iterations) {
        System.out.println("Contains Method:");
        System.out.println("| Collection | Iterations | Time (ms) |");

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < iterations; i++) {
            arrayList.add(i);
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            boolean contains = arrayList.contains(i);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("| ArrayList  | " + iterations + "          | " + duration + "        |");

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < iterations; i++) {
            linkedList.add(i);
        }

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            boolean contains = linkedList.contains(i);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("| LinkedList | " + iterations + "          | " + duration + "        |\n");
    }




    public static void testAddAll(int iterations) {
        System.out.println("AddAll Method:");
        System.out.println("| Collection | Iterations | Time (ms) |");

        List<Integer> sourceList = new ArrayList<>();
        for (int i = 0; i < iterations; i++) {
            sourceList.add(i);
        }

        List<Integer> arrayList = new ArrayList<>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            arrayList.addAll(sourceList);
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("| ArrayList  | " + iterations + "          | " + duration + "        |");

        List<Integer> linkedList = new LinkedList<>();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            linkedList.addAll(sourceList);
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("| LinkedList | " + iterations + "          | " + duration + "        |\n");
    }


    public static void testRemove(int iterations) {
        System.out.println("Remove Method:");
        System.out.println("| Collection | Iterations | Time (ms) |");

        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < iterations; i++) {
            arrayList.add(i);
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            arrayList.remove(Integer.valueOf(i));
        }
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("| ArrayList  | " + iterations + "          | " + duration + "        |");

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < iterations; i++) {
            linkedList.add(i);
        }

        startTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            linkedList.remove(Integer.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("| LinkedList | " + iterations + "          | " + duration + "        |\n");
    }
}



