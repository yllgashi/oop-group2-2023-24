package lecture66_generics_3;

import java.util.ArrayList;

// if I create an object of this class like this:
//      MyCollection<String> coll = new MyCollection<String>();
// it means that everything with "T" its replaced with "String"



/*
    <T> it is something replaceable, it means in the future when object of this class
    it's created, also this T will replace
 */

class MyCollection<T> {
    private ArrayList<T> data = new ArrayList<>();

    public void insertItem(T item) {
        this.data.add(item);
    }

    public T getItem(int index) {
        return this.data.get(index);
    }
}
