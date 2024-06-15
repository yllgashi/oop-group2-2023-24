package lecture70_generics_5;

class Node<T> {
    private T data;

    public Node(T data) {
        this.data = data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
