package org.example;

public class Main {
    public static void main(String[] args) {
        int iterations = 2000;
        System.out.println("Performance comparison between ArrayList and LinkedList (iterations: " + iterations + ")\n");

        Array_LinkedList.testAdd(iterations);
        Array_LinkedList.testDelete(iterations);
        Array_LinkedList.testGet(iterations);
        Array_LinkedList.testContains(iterations);
        Array_LinkedList.testAddAll(iterations);
        Array_LinkedList.testRemove(iterations);
    }
}
