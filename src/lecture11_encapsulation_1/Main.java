package lecture11_encapsulation_1;

public class Main {
    public static void main(String[] args) {
        // spaghetti code (all in one class/file)
        String personFullName = "Filan Fisteku";
        String productName = "Coca cola";
        double productPrice = 5.10;
        System.out.println(personFullName + "buy" + productName);

        // divided / organized code in classes
        // each class has its own entity
        Person person1 = new Person();
        person1.setFullname("Filan Fisteku");

        Product product1 = new Product();
        product1.setName("Coca cola");
        product1.setPrice(5.10);
    }
}
