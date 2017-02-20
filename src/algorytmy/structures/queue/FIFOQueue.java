package algorytmy.structures.queue;

/**
 * Created by Szymon on 2017-02-18.
 */
public class FIFOQueue extends AbstractQueue {

    public FIFOQueue() {
    }

    private FIFOQueue(int value) {
        super(value);
    }

    @Override
    public void push(int value) {
        AbstractQueue last = getLast();
        last.next = new FIFOQueue(value);
    }


    @Override
    protected AbstractQueue getInstance() {
        return new FIFOQueue();
    }

    protected AbstractQueue getInstance(int value) {
        return new FIFOQueue();
    }

}
