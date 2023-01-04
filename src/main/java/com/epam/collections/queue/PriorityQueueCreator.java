package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        System.out.println("a".compareTo("b"));

        PriorityQueue<String> result = new PriorityQueue<>((o1, o2) -> Integer.compare(0, o1.compareTo(o2)));
        result.addAll(firstList);
        result.addAll(secondList);

        return result;
    }
}
