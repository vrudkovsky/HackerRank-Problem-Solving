package warmup;

public class MyClosable {
    private volatile boolean closed = false;

    public boolean close() {
        if (!closed) {
            this.closed = !closed;
        }
        return closed;
    }
}
