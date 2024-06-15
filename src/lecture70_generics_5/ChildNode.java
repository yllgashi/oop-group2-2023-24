package lecture70_generics_5;

class ChildNode extends Node<Integer> {
    public ChildNode(Integer data) {
        super(data);
    }


    // we can override methods which has generic memebers

    @Override
    public void setData(Integer data) {
        super.setData(data);
    }
}
