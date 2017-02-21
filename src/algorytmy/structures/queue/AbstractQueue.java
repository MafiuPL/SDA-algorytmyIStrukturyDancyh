package algorytmy.structures.queue;

/**
 * Created by RENT on 2017-02-20.
 */
public abstract class AbstractQueue implements Queue {

    protected int value;

    protected AbstractQueue next;

    public AbstractQueue() {

    }

    protected AbstractQueue(int value) {
        this.value = value;
    }


    @Override
    public int pop() throws QueueException {
        AbstractQueue nextValue = this.next;
        if (nextValue == null) {
            throw new QueueException("This queue is already empty");
        }
        this.next = nextValue.next;
        nextValue.next = null;
        return nextValue.value;
    }

    protected abstract AbstractQueue getInstance();
    protected  abstract  AbstractQueue getInstance (int value);

    {

    }

    protected AbstractQueue getLast() {
        AbstractQueue fifoQueue = this;
        while (fifoQueue.next != null) {
            fifoQueue = fifoQueue.next;
        }
        return fifoQueue;
    }


    @Override
    public Queue clone() {
        AbstractQueue clonedQueue = new FIFOQueue();
        AbstractQueue returnQueue = clonedQueue;
        AbstractQueue thisQueue = this.next;
        while (thisQueue != null) {
            clonedQueue.next = getInstance(thisQueue.value);
            thisQueue = thisQueue.next;
            clonedQueue = clonedQueue.next;
        }
        return returnQueue;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        AbstractQueue queue = this.next;
        stringBuilder.append("[");
        while (queue != null) {
            stringBuilder.append(queue.value);
            if (queue.next != null) {
                stringBuilder.append(", ");
            }
            queue = queue.next;
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}


