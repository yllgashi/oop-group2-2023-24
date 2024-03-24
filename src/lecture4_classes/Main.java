package lecture4_classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Example 1
//        User user1 = new User();
//        user1.username = "Administrator";
//        user1.password = "1";


//        Example 2
//        Scanner scanner = new Scanner(System.in);
//        User u1 = new User();
//
//        System.out.println("######### Register ##########");
//
//        System.out.print("Username: ");
//        u1.username = scanner.nextLine();
//
//        System.out.print("Password: ");
//        String passwordFromUser = scanner.nextLine();
//
//        if (passwordFromUser.length() > 8) {
//            u1.password = passwordFromUser;
//        }


        // Example 3
        User user3 = new User();
//        user3.username = "Administrator";
//        user3.password = "1234567";
        user3.setUsername("Administrator");
        user3.setPassword("1234567");

        System.out.println(user3.getUsername());
        System.out.println(user3.getPassword("Administrator"));
    }
}
