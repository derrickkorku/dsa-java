public class ListSequence extends List implements ISequence {

    public Object elemAtRank(int r) {
        Position p = atRank(r);

        return p.element();
    }

    public void replaceAtRank(int r, Object e) {
        Position p = atRank(r);

        this.replaceElement(p, e);
    }

    public Position insertAtRank(int r, Object e) {
        Position p = atRank(r);

        if (r == size())
            return insertLast(e);

        if (p == null)
            return null;

        return insertAfter(p, e);
    }

    public Object removeAtRank(int r) {
        Position p = atRank(r);

        if (p == null)
            return null;

        return remove(p);
    }

    @Override
    public int rankOf(Position p) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'rankOf'");
    }

    @Override
    public Position atRank(int r) {
        if (r < 0 || r >= size()) {
            return null;
        }

        Position current = this.first();

        for (int i = 0; i < r; i++) {
            current = after(current);
        }

        return current;
    }

}
