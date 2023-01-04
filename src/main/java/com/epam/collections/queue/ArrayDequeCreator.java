package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> combinedDeck = new ArrayDeque<>();
        combinedDeck.add(firstQueue.poll());
        combinedDeck.add(firstQueue.poll());
        combinedDeck.add(secondQueue.poll());
        combinedDeck.add(secondQueue.poll());

        while (!(firstQueue.isEmpty() && secondQueue.isEmpty())) {
            firstQueue.add(combinedDeck.pollLast());
            combinedDeck.addLast(firstQueue.poll());
            combinedDeck.addLast(firstQueue.poll());

            secondQueue.add(combinedDeck.pollLast());
            combinedDeck.addLast(secondQueue.poll());
            combinedDeck.addLast(secondQueue.poll());
        }

        return combinedDeck;
    }
}
