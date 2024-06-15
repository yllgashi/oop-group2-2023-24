package lecture66_generics_3;

public class Main {
    public static void main(String[] args) {
        MyCollection<String> collection = new MyCollection<String>();
        collection.insertItem("test");
        System.out.println(collection.getItem(0));


        MyCollection<Integer> collection2 = new MyCollection<Integer>();
        collection2.insertItem(1);
        collection2.insertItem(2);
        System.out.println(collection2.getItem(0));
    }
}
