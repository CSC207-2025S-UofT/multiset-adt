/**
 * Abstract class representing a MultiSet ADT.
 */
public abstract class MultiSet {

    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    abstract void add(Integer item);
    abstract void remove(Integer item);
    abstract boolean contains(Integer item);
    abstract boolean is_empty();
    abstract int count(Integer item);
    abstract int size();

    public void add() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void remove() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean contains() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public boolean is_empty() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int count() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public int size() {
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
