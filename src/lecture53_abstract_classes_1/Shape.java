package lecture53_abstract_classes_1;

public abstract class Shape {
    private int id;

    // abstract method cannot have body
    public abstract void draw();


    // inside abstract class you can have methods which are not abstracts
    public void whatIsShape() {
        System.out.println("Shape is something");
    }

    // inside abstract class you can have final method
    public final void tellMoreAboutShape() {
        System.out.println("...");
    }
}
