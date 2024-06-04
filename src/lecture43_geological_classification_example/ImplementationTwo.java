package lecture43_geological_classification_example;

import java.util.Scanner;

public class ImplementationTwo {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Scanner scanner = new Scanner(System.in);
        String packageName = "lecture43_geological_classification_example.";

        while (true) {
            // lecture43_geological_classification_example.Granite
            System.out.print("Write rock name: ");
            String rockString = scanner.nextLine();

            Rock object = (Rock) Class.forName(packageName  + rockString).newInstance();
            System.out.println(object.getDescription());
        }
    }
}
