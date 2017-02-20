package test.algorytmy.structures.queue;

import algorytmy.structures.queue.AbstractQueue;
import algorytmy.structures.queue.LIFOQueue;
import algorytmy.structures.queue.Queue;

/**
 * Created by RENT on 2017-02-20.
 */
public class LIFOQueueTests {

    public static void main(String[] args) {
        Queue queue = new LIFOQueue();
        queue.pop();
        System.out.println();

        queue.push(2);
        queue.push(4);
        queue.push(3);
        queue.push(-1);
        queue.push(1);

        AbstractQueue cloned = (AbstractQueue) queue.clone();
        System.out.println(cloned + "test");
        cloned.push(4);
        cloned.push(3);
        System.out.println(cloned);

    }
}
