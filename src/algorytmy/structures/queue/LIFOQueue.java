package algorytmy.structures.queue;

/**
 * Created by RENT on 2017-02-20.
 */
public class LIFOQueue extends AbstractQueue {

    public LIFOQueue() {
    }

    public LIFOQueue(int value) {
        super(value);
    }

    @Override
    public void push(int value) {
        AbstractQueue nextValue = this.next;
        LIFOQueue newValue = new LIFOQueue(value);
        this.next = newValue;
        newValue.next = nextValue;
    }


    @Override
    protected AbstractQueue getInstance() {
        return new LIFOQueue();
    }

    protected AbstractQueue getInstance(int value) {
        return new LIFOQueue();
    }

}
